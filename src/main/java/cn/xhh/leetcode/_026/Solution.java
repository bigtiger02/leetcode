package cn.xhh.leetcode._026;

/**
 * Remove duplicates from sorted array
 * <a href="https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/">Remove duplicates from sorted array</a>
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/17
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        if(null == nums){
            return 0;
        }
        if(nums.length < 2){
            return nums.length;
        }

        int len = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] != nums[i+1]){
                len++;
                continue;
            }

            int j = i+1;
            while(j < nums.length && nums[j] == nums[j+1]){
                j++;
            }


        }
        int l = 0, r = nums.length - 1;
        int tmp;
        while(l < r){
            if(nums[l] == nums[l+1]){
                tmp = nums[l+1];
                nums[l+1] = nums[r];
                nums[r] = tmp;
                r--;
            }else if(nums[l] > nums[l+1]){
                tmp = nums[l+1];
                nums[l+1] = nums[l];
                nums[l] = tmp;
                if(l>= 1 && nums[l] == nums[l-1]){
                    l--;
                }
            }else{
                l++;
            }
        }

        return r+1;
    }
}
