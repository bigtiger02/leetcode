package cn.xhh.leetcode._076;

import java.util.HashMap;
import java.util.Map;

/**
 * Minimum window substring
 * <a href="https://leetcode-cn.com/problems/minimum-window-substring/">Minimum window substring</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/15
 */
public class Solution {
    public String minWindow(String s, String t) {
        if(s.length() < t.length()){
            return "";
        }

        Map<Character,Integer> existMap = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            int num = existMap.getOrDefault(c,0);
            existMap.put(c, num+1);
        }

        int len = s.length();
        int left = 0, right = left;
        int matchCount = 0, minLen = Integer.MAX_VALUE;
        Map<Character,Integer> countMap = new HashMap<>();
        String result = "";
        while(right < len){
            while(matchCount < existMap.size() && right < len){
                char c = s.charAt(right);
                Integer existCount = existMap.get(c);
                if(null != existCount){
                    int num = countMap.getOrDefault(c,0);
                    num++;
                    countMap.put(c, num);
                    if(num == existCount){
                        matchCount = matchCount+1;
                    }
                }
                right++;
            }

            while(matchCount == existMap.size()
                    && left < right){
                if(right-left < minLen){
                    result = s.substring(left, right);
                    minLen = right-left;
                }
                char c = s.charAt(left);
                Integer count = countMap.get(c);
                if(null != count){
                    Integer existCount = existMap.get(c);
                    if(count > existCount){
                        countMap.put(c, count-1);
                    }else{
                        if(count > 1){
                            countMap.put(c, count-1);
                        }else{
                            countMap.remove(c);
                        }
                        matchCount--;
                    }
                }
                left++;
            }
        }

        return result;
    }
}
