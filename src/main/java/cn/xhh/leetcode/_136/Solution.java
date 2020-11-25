package cn.xhh.leetcode._136;

import java.util.Arrays;

/**
 * Single number
 * <a href="https://leetcode-cn.com/problems/single-number/">Single number</a>
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/25
 */
public class Solution {
    public int singleNumber(int[] nums) {
        int single = 0;
        for (int num : nums) {
            single ^= num;
        }
        return single;
    }
}
