package cn.xhh.leetcode._044;

/**
 * wildcard matching
 * <a href="https://leetcode-cn.com/problems/wildcard-matching/">wildcard matching</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/9
 */
public class Solution {
    public boolean isMatch(String s, String p) {
        if(null == s || null == p){
            return false;
        }

        int m = s.length(), n = p.length();
        //dp[i][j] 表示子串是否匹配
        boolean[][] dp = new boolean[n+1][m+1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                dp[i][j] = false;
            }
        }
        dp[0][0] = true;

        for (int i = 1; i <= n; i++) {
            char c = p.charAt(i-1);
            dp[i][0] = c == '*' ? dp[i-1][0] : false;
            for (int j = 1; j <= m; j++) {
                char t = s.charAt(j-1);
                if(c == '*'){
                    dp[i][j] = dp[i-1][j-1] || dp[i-1][j] || dp[i][j-1];
                }else if(c == '?' || c == t){
                    dp[i][j] = dp[i-1][j-1];
                }
            }
        }

        return dp[n][m];
    }
}
