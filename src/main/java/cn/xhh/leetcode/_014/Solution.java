package cn.xhh.leetcode._014;

/**
 * Longest common prefix
 * <a href="https://leetcode-cn.com/problems/longest-common-prefix/">Longest common prefix</a>
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/14
 */
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(null == strs || strs.length == 0){
            return "";
        }

        if(null == strs[0] || strs[0].length() < 1){
            return "";
        }

        int index = 0; char c;
        boolean flag = true;
        while(flag && index < strs[0].length()){
            c = strs[0].charAt(index);
            for (int i = 1; i < strs.length; i++) {
                if((null == strs[i]
                        || index >= strs[i].length()
                        || c != strs[i].charAt(index))){
                    flag = false;
                    break;
                }
            }

            if(flag){
                index++;
            }
        }

        return index == 0 ? "" : strs[0].substring(0, index);
    }
}
