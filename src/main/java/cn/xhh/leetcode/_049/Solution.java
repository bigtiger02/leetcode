package cn.xhh.leetcode._049;

import java.util.*;

/**
 * Group anagrams
 * <a href="https://leetcode-cn.com/problems/group-anagrams/">Group anagrams</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/10
 */
public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> results = new ArrayList<>();
        if(null == strs || strs.length == 0){
            return results;
        }

        Map<String,Integer> indexMap = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            Integer index = indexMap.get(key);
            List<String> list;
            if(null == index){
                list = new ArrayList<>();
                results.add(list);
                index = results.size()-1;
                indexMap.put(key, index);
            }else{
                list = results.get(index);
            }

            list.add(str);
        }

        return results;
    }
}
