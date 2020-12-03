package cn.xhh.leetcode._022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

        dfs('(',n-1, n, 0, new char[2*n],results);
        return  results;
    }

    private void dfs(char c, int left,int right, int index, char[] chars, List<String> results) {
        if(left > right){
            return;
        }
        chars[index] = c;

        if(index == chars.length-1){
            results.add(new String(chars));
            return;
        }
        if(left > 0){
            char[] tmp = Arrays.copyOf(chars,chars.length);
            dfs('(',left-1,right,index+1,tmp,results);
        }

        if(right > 0){
            char[] tmp1 = Arrays.copyOf(chars,chars.length);
            dfs(')',left,right-1,index+1,tmp1,results);
        }
    }
}
