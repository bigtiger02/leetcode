package cn.xhh.leetcode._041;

/**
 * First missing positive
 * <a href="https://leetcode-cn.com/problems/first-missing-positive/">First missing positive</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/6
 */
public class Solution {
    public int firstMissingPositive(int[] nums) {
        if(null == nums || nums.length == 0){
            return 1;
        }

        int n = nums.length;
        for (int i = 0; i < n; i++) {
            while(nums[i] > 0 && nums[i] < n && nums[nums[i]-1] != nums[i]){
                int tmp = nums[nums[i]-1];
                nums[nums[i]-1] = nums[i];
                nums[i] = tmp;
            }

        }

        for (int i = 0; i < n; i++) {
            if(nums[i] != i+1){
                return i+1;
            }
        }

        return n+1;
    }
}
