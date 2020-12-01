package cn.xhh.leetcode._010;

import java.util.Arrays;

/**
 * Regular expression matching
 * <a href="https://leetcode-cn.com/problems/regular-expression-matching/">Regular expression matching</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/27
 */
public class Solution {
    public boolean isMatch(String s, String p) {
        //都为空返回 true
        if("".equals(s) && "".equals(p)){
            return true;
        }

        if("".equals(p)){
            return false;
        }

        //* 开头不合法通配符
        if('*' == p.charAt(0)){
            return false;
        }

        int sLength = s.length(), pLength = p.length();
        //初始化dp
        boolean[][] dp = new boolean[sLength+1][pLength+1];
        dp[0][0] = true;
        dp[0][1] = false;
        //谨防 s="" p="a*" 场景
        for (int i = 1; i < pLength; i++) {
            char pc = p.charAt(i);
            dp[0][i + 1] = pc == '*' && dp[0][i-1];
        }

        //填表
        for (int i = 1; i <= sLength; i++) {
            for (int j = 1; j <= pLength; j++) {
                char sc = s.charAt(i-1);
                char pc = p.charAt(j-1);
                if(pc == '.' || sc == pc){//不为*场景
                    dp[i][j] = dp[i-1][j-1];
                }else if(pc == '*' && j >= 2){//为*场景
                    char lpc = p.charAt(j-2);
                    if(dp[i][j-2]) {//为空场景
                        dp[i][j] = true;
                    }else if(lpc == sc || lpc == '.'){//上一个字符匹配
                        dp[i][j] = dp[i-1][j];
                    }
                }
            }
        }

        return dp[sLength][pLength];
    }
}

