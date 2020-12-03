package cn.xhh.leetcode._022;

import java.util.*;

/**
 * Generate parentheses
 * <a href="https://leetcode-cn.com/problems/generate-parentheses/">Generate parentheses</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/4
 */
public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> results = new ArrayList<>();
        if(n == 0){
            return results;
        }
        dfs(n, n, new StringBuilder(), results);
        return  results;
    }

    private void dfs(int left, int right,
                     StringBuilder sb, List<String> results) {
        if(left > right){
            return;
        }

        if(left == 0 && right == 0){
            results.add(sb.toString());
            return;
        }

        if(left != 0){
            StringBuilder tmp = new StringBuilder(sb);
            tmp.append('(');
            dfs(left-1, right, tmp,results);
        }

        if(right != 0){
            StringBuilder tmp = new StringBuilder(sb);
            tmp.append(')');
            dfs(left, right-1, tmp,results);
        }
    }
}
