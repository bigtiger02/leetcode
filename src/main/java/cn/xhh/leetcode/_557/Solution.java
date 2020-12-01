package cn.xhh.leetcode._557;

/**
 * reverse string iii
 * <a href="https://leetcode-cn.com/problems/reverse-words-in-a-string-iii/">reverse string iii</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/1
 */
public class Solution {
    public String reverseWords(String s) {
        if(null == s || s.length() < 2){
            return s;
        }

        int len = s.length();
        StringBuilder sb = new StringBuilder();
        int left = 0,right = 0;
        while(right < len){
            char c = s.charAt(right);
            if(c != ' '){
                right++;
            }else{
                for (int i = right-1; i >= left; i--) {
                    sb.append(s.charAt(i));
                }
                sb.append(c);
                right++;
                left = right;
            }
        }

        if(left < right){
            for (int i = right-1; i >= left; i--) {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }
}
