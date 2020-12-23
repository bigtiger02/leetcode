package cn.xhh.leetcode._125;

/**
 * Valid palindrome
 * <a href="https://leetcode-cn.com/problems/valid-palindrome/">Valid palindrome</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/24
 */
public class Solution {
    public boolean isPalindrome(String s) {
        if(null == s || s.length() == 0){
            return true;
        }
        s = s.toLowerCase();
        int left = 0, right = s.length()-1;
        while(left < right){
            char lc = s.charAt(left);
            while(!isValidNumberOrAlpha(lc) && left < right){
                lc = s.charAt(++left);
            }

            char rc = s.charAt(right);
            while(!isValidNumberOrAlpha(rc) && left < right){
                rc =s.charAt(--right);
            }

            if(lc == rc){
                left++;
                right--;
            }else{
                return false;
            }
        }

        return true;
    }

    private boolean isValidNumberOrAlpha(char rc){
        if(rc >= '0' && rc <= '9'){
            return true;
        }else if(rc >= 'a' && rc <= 'z'){
            return true;
        }else{
            return false;
        }
    }
}
