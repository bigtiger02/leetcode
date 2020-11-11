package cn.xhh.leetcode._1371;

import java.util.*;

/**
 * Find the longest substring containing vowels in even counts
 * <a href="https://leetcode-cn.com/problems/find-the-longest-substring-containing-vowels-in-even-counts/">Find the longest substring containing vowels in even counts</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/11
 */
public class Solution {

    public int findTheLongestSubstring(String s) {
        if(null == s || s.length() == 0){
            return 0;
        }

        //元音字典初始化
        Map<Character, Integer> vowelMap = new HashMap<>();
        char[] vowelChars = new char[]{'a','e','i','o','u'};
        for (int i = 0; i < vowelChars.length; i++) {
            vowelMap.put(vowelChars[i], i);
        }

        int[] pos = new int[1 << 5];
        Arrays.fill(pos, -1);
        pos[0] = 0;

        int flag = 0;
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            Integer vowelIndex = vowelMap.get(c);
            if(null != vowelIndex){
                flag = flag ^ 1 << vowelIndex;//标记该元音是否为偶数
            }

            if(pos[flag] >= 0){
                max = Math.max(max, i+1-pos[flag]);
            }else{
                pos[flag] = i+1;
            }
        }

        return max;
    }
}
