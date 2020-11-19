package cn.xhh.leetcode._053;

/**
 * Maximum subarray
 * <a href="https://leetcode-cn.com/problems/maximum-subarray/">Maximum subarray</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/18
 */
public class Solution2 {
    public int maxSubArray(int[] nums) {
        if(null == nums){
            return 0;
        }

        int maxSum = nums[0], tmpSum = 0;
        for (int i = 0; i < nums.length; i++) {
            tmpSum = Math.max(tmpSum+nums[i], nums[i]);
            maxSum = Math.max(tmpSum, maxSum);
        }
        return maxSum;
    }
}
