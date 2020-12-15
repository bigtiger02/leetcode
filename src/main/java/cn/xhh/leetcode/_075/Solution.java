package cn.xhh.leetcode._075;

/**
 * Sort Colors
 * <a href="https://leetcode-cn.com/problems/sort-colors/">Sort colors</a>
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/15
 */
public class Solution {
    public void sortColors(int[] nums) {
        if(null == nums ||nums.length == 1){
            return;
        }

        int len = nums.length;
        int left = 0, right = len-1;
        for (int i = 0; i <= right; i++) {
            while(i < right && nums[i] == 2){
                int tmp = nums[right];
                nums[right] = nums[i];
                nums[i] = tmp;
                right--;
            }

            if(nums[i] == 0){
                int tmp = nums[left];
                nums[left] = nums[i];
                nums[i] = tmp;
                left++;
            }
        }
    }
}
