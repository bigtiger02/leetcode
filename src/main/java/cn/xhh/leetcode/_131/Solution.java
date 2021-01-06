package cn.xhh.leetcode._131;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * palindrome-partitioning
 * <a href="https://leetcode-cn.com/problems/palindrome-partitioning/">palindrome-partitioning</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2021/1/6
 */
public class Solution {
    public List<List<String>> partition(String s) {
        if(null == s || s.length() == 0){
            return new ArrayList<>();
        }

        List<List<String>> results = new ArrayList<>();
        backtrack(s, 0, new LinkedList<String>(), results);
        return results;
    }

    private void backtrack(String s, int start, LinkedList<String> path, List<List<String>> results) {
        if(start == s.length()){
            results.add(new ArrayList<>(path));
            return;
        }

        for (int i = start; i < s.length(); i++) {
            String tmp = s.substring(start, i+1);
            if(isPalindrome(tmp)){
               path.addLast(tmp);
               backtrack(s,i+1, path, results);
               path.removeLast();
            }
        }
    }

    private boolean isPalindrome(String str) {
        if(null == str || str.length() == 0){
            return false;
        }
        int left = 0, right = str.length()-1;
        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

}
