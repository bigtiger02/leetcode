package cn.xhh.leetcode._438;

import java.util.*;

/**
 * find-all-anagrams-in-a-string
 * <a href="https://leetcode-cn.com/problems/find-all-anagrams-in-a-string/">find-all-anagrams-in-a-string</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/11
 */
public class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> results = new ArrayList<>();
        if(s == null || s.length() == 0 || p == null || p.length() == 0){
            return results;
        }

        Map<Character,Integer> needs = new HashMap<>();
        for (int i = 0; i < p.length(); i++) {
            char c = p.charAt(i);
            Integer count = needs.getOrDefault(c, 0);
            needs.put(c,count+1);
        }

        Map<Character,Integer> window = new HashMap<>();
        int left = 0,right = 0;
        int valid = 0;
        while(right < s.length()){
            char c = s.charAt(right);
            right++;

            if(needs.containsKey(c)){
                Integer count = window.getOrDefault(c, 0);
                window.put(c, count+1);
                if(needs.get(c) == count+1){
                    valid++;
                }
            }

            while(right-left >= p.length()){
                if(valid == needs.size()){
                    results.add(left);
                }
                char lc = s.charAt(left);
                left++;
                if(needs.containsKey(lc)){
                    if(window.get(lc) == needs.get(lc)){
                        valid--;
                    }
                    Integer count = window.get(lc);
                    window.put(lc, count-1);
                }
            }
        }

        return results;
    }
}
