package cn.xhh.leetcode._215;

import java.util.Arrays;

/**
 * kth largest element in an array
 * <a href="https://leetcode-cn.com/problems/kth-largest-element-in-an-array/">kth largest element in an array</a>
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/29
 */
public class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
