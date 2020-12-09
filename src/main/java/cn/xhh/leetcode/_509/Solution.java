package cn.xhh.leetcode._509;

/**
 * fibonacci number
 * <a href="https://leetcode-cn.com/problems/fibonacci-number/">fibonacci number</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/9
 */
public class Solution {
    public int fib(int n) {
        if(n < 2){
            return n;
        }

        int[] dp = new int[n+2];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 0; i < n; i++) {
            dp[i+2] = dp[i+1] + dp[i];
        }
        return dp[n];
    }
}
