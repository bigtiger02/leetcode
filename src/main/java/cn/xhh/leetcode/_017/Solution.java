package cn.xhh.leetcode._017;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * letter-combinations-of-a-phone-number
 * <a href="https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number/">letter-combinations-of-a-phone-number</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/3
 */
public class Solution {

    private static final char[][] charArr = {
        {'a','b','c'},
        {'d','e','f'},
        {'g','h','i'},
        {'j','k','l'},
        {'m','n','o'},
        {'p','q','r','s'},
        {'t','u','v'},
        {'w','x','y','z'}
    };
    public List<String> letterCombinations(String digits) {
        List<String> results = new ArrayList<>();
        if(null == digits || "".equals(digits)){
            return results;
        }

        dfs(0, digits.length(), digits, new char[digits.length()], results);
        return results;
    }

    private void dfs(int start, int len, String digits, char[] chars, List<String> results) {
        if(start == len){
            results.add(new String(chars));
            return;
        }

        char number = digits.charAt(start);
        char[] tmp = charArr[number-'2'];
        for (int i = 0; i < tmp.length; i++) {
            char[] tmpChars = Arrays.copyOf(chars, len);
            tmpChars[start] = tmp[i];
            dfs(start+1, len, digits, tmpChars, results);
        }
    }
}
