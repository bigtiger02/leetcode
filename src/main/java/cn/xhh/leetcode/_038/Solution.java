package cn.xhh.leetcode._038;

/**
 * Count and say
 * <a href="https://leetcode-cn.com/problems/count-and-say/">Count and say</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/6
 */
public class Solution {
    public String countAndSay(int n) {
       if(n == 1){
           return "1";
       }

       String tmp = countAndSay(n-1);
       int len = tmp.length();
       StringBuilder sb = new StringBuilder();
       int i = 0;
       while(i < len){
           char current = tmp.charAt(i);
           int count = 1, j = i+1;
           while(j < len && tmp.charAt(j) == current){
               count++;
               j++;
           }

           sb.append(count).append(current);
           i = j;
       }

       return sb.toString();
    }

}
