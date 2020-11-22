package cn.xhh.leetcode._062;

/**
 * Unique paths
 * <a href="https://leetcode-cn.com/problems/unique-paths/">Unique paths</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/22
 */
public class Solution {
    public int uniquePaths(int m, int n) {
        if(n == 0 || n == 1 || m == 1){
            return n  == 0 ? 0 : 1;
        }

        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(i == 0 || j == 0){
                    dp[i][j] = 1;
                }else{
                    dp[i][j] = dp[i][j-1] + dp[i-1][j];
                }
            }
        }

        return dp[m-1][n-1];
    }

}
