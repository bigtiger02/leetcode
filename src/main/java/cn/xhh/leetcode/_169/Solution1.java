package cn.xhh.leetcode._169;

import java.util.Arrays;

/**
 * Majority element
 * <a href="https://leetcode-cn.com/problems/majority-element/">Majority element</a>
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/29
 */
public class Solution1 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
