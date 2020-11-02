package cn.xhh.leetcode._009;

/**
 * Palindrome number
 * <a href="https://leetcode-cn.com/problems/palindrome-number/">Palindrome number</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/3
 */
public class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }

        if(x >= 0 && x < 10){
            return true;
        }

        int t = x;
        int reverseNumber = 0;
        while(t > 0){
            int v = t % 10;
            if(reverseNumber >= (Integer.MAX_VALUE - v)/10){
                return false;
            }

            reverseNumber = reverseNumber * 10 + t % 10;
            t = t / 10;
        }

        return x == reverseNumber;
    }
}
