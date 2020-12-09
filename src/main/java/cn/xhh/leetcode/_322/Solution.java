package cn.xhh.leetcode._322;

import java.util.Arrays;

/**
 * coin change
 * <a href="https://leetcode-cn.com/problems/coin-change/">coin change</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/9
 */
public class Solution {
    public int coinChange(int[] coins, int amount) {
        if(null == coins){
            return -1;
        }

        int[] dp = new int[amount+1];
        Arrays.fill(dp, amount+1);
        dp[0] = 0;
        for (int i = 0; i < dp.length; i++) {
            for (int coin : coins){
                if(i-coin >= 0){
                    dp[i] = Math.min(dp[i], 1+dp[i-coin]);
                }
            }
        }

        return dp[amount] == amount+1 ? -1 : dp[amount];
    }
}
