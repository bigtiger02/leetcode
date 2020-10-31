package cn.xhh.leetcode._03;

import java.util.HashSet;
import java.util.Set;

/**
 *  Longest Substring Without Repeating Characters
 * <a href="https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/">Longest Substring Without Repeating Characters</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/10/31
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(null == s){
            return 0;
        }
        if(s.length() < 2){
            return s.length();
        }


        int maxLen = 0, lastJ = 0;
        Set<Character> existCharacters = new HashSet<>();
        for(int i = 0; i < s.length()-1;i++){
            existCharacters.add(s.charAt(i));
            //记录上次的j的位置，下次从此处开始找
            lastJ = Math.max(i + 1, lastJ);
            for(int j = lastJ; j < s.length(); j++){
                lastJ = j;
                if(existCharacters.contains(s.charAt(j))){
                    maxLen = Math.max(j - i, maxLen);
                    break;
                }

                existCharacters.add(s.charAt(j));
                //全部都是不重复的
                if( j == s.length() - 1){
                    maxLen = Math.max(j - i + 1, maxLen);
                }
            }

            if(lastJ == s.length() - 1){
                break;
            }

            if(maxLen > s.length() - i){
                break;
            }

            existCharacters.remove(s.charAt(i));
        }

        return maxLen;
    }
}
