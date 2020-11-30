package cn.xhh.leetcode._238;

/**
 * product-of-array-except-self
 * <a href="https://leetcode-cn.com/problems/product-of-array-except-self/">product-of-array-except-self</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/1
 */
public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] lefts = new int[len];
        int[] rights = new int[len];
        int p = 1,q = 1;
        for (int i = 0; i < len; i++) {
            lefts[i] = p;
            p *= nums[i];

            rights[len-i-1] = q;
            q *= nums[len-i-1];
        }

        for (int i = 0; i < len; i++) {
            lefts[i] = lefts[i] * rights[i];
        }
        return lefts;
    }
}
