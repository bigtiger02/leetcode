package cn.xhh.leetcode._005;

/**
 * Longest palindromic substring
 * <a href="https://leetcode-cn.com/problems/longest-palindromic-substring/">Longest palindromic substring</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/10/31
 */
public class Solution {

    public String longestPalindrome(String s) {
        if(null == s || 0 == s.length()){
            return "";
        }

        String result = s.substring(0,1);
        for (int i = 0; i < s.length(); i++) {
            int left = i, right = s.length();
            if(right - left <= result.length()){
                break;
            }

            while(left < right){
                if(right - left <= result.length()){
                    break;
                }
                if(s.charAt(left) != s.charAt(right - 1)){
                    right--;
                }else{
                    if(isPalindrome(s,left,right)){
                        if(result.length() < right - left){
                            result = s.substring(left,right);
                        }
                        break;
                    }else{
                        right--;
                    }
                }
            }
        }

        return result;
    }

    private boolean isPalindrome(String s, int left, int right){
        if(left == right - 1){
            return true;
        }

        while(left < right){
            if(s.charAt(left) != s.charAt(right - 1)){
                return false;
            }else{
                left++;
                right--;
            }
        }
        return true;
    }
}
