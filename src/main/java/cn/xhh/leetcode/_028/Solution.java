package cn.xhh.leetcode._028;

/**
 * Implement strstr
 * <a href="https://leetcode-cn.com/problems/implement-strstr/">Implement strstr</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/4
 */
public class Solution {
    public int strStr(String haystack, String needle) {
        if(null == haystack || null == needle){
            return -1;
        }

        if(needle.length() == 0){
            return 0;
        }

        if(haystack.length() < needle.length()){
            return -1;
        }


        int first = 0;
        while(first < haystack.length() && first < haystack.length() - needle.length() + 1){
            if(haystack.charAt(first) == needle.charAt(0)){
                int second = 1;
                while(second < needle.length()){
                    if(haystack.charAt(first+second) != needle.charAt(second)){
                        break;
                    }else{
                        second++;
                    }
                }

                if(second == needle.length()){
                    return first;
                }
            }
            first++;
        }

        return -1;
    }
}
