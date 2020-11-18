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

        int i =0, j = 1;
        while(j < nums.length){
            if(nums[j] != nums[i]){
                nums[i++] = nums[j];
            }
            j++;
        }

        return i+1;
    }
}
