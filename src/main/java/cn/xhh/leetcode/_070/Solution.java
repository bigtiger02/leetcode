package cn.xhh.leetcode._070;

/**
 * Climbing stairs
 * <a href="https://leetcode-cn.com/problems/climbing-stairs/">Climbing stairs</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/20
 */
public class Solution {
    public int climbStairs(int n) {
        if(n < 3){
            return n;
        }

        int a = 1, b = 2, result = 0;
        for (int i = 3; i <= n; i++) {
            result = a + b;
            a = b;
            b = result;
        }

        return result;
    }
}
