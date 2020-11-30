package cn.xhh.leetcode._344;

/**
 * reverse string
 * <a href="https://leetcode-cn.com/problems/reverse-string/">reverse string</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/1
 */
public class Solution {
    public void reverseString(char[] s) {
        if(null == s){
            return;
        }

        int left = 0, right = s.length-1;
        while(left < right){
            char tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;
            left++;
            right--;
        }
    }
}
