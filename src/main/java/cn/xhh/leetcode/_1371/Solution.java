package cn.xhh.leetcode._1371;

import java.util.*;

/**
 * Find the longest substring containing vowels in even counts
 * <a href="https://leetcode-cn.com/problems/find-the-longest-substring-containing-vowels-in-even-counts/">Find the longest substring containing vowels in even counts</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/11
 */
public class Solution {

    private static class Tuple{
        protected char c;
        protected int index;

        public Tuple(char c, int index) {
            this.c = c;
            this.index = index;
        }
    }

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

        //记录字符中元音所在的位置，以及最大子串
        LinkedList<Tuple> vowels = new LinkedList<>();
        int flag = 0;//标识当前元音是否全是偶数
        int lastVowelIndex = 1;//前一元音所在位置
        int maxSubStrLen = 0;//最大子串
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            Integer vowelIndex = vowelMap.get(c);
            if(null != vowelIndex){
                vowels.add(new Tuple(c, i));//添加到记录
                flag = flag ^ 1 << vowelIndex;//标记该元音是否为偶数
                maxSubStrLen = Math.max(maxSubStrLen,i-lastVowelIndex-1);//计算子串长度
                lastVowelIndex = i;
            }else if(i == s.length() - 1){
                maxSubStrLen = Math.max(maxSubStrLen,i-lastVowelIndex);//计算子串长度
            }
        }

        //如果不存在元音或元音个数满足要求直接返回
        if(vowels.isEmpty() || 0 == flag){
            return s.length();
        }

        //循环计算子串最大长度
        int maxLen = 0;//最大满足子串
        int startVowelIndex = -1;//元音数组
        int startStrIndex = 0;//开始首字母位置
        int leftLen = s.length();//剩余子串最大长度
        while(leftLen > maxLen && startVowelIndex < vowels.size()-1){
            int tFlag = flag;//保存上次状态
            if(tFlag == 0){
                startStrIndex = startVowelIndex == -1 ? 0 : vowels.get(startVowelIndex).index + 1;
                maxLen = Math.max(maxLen, s.length() - startStrIndex);
            }else {
                //从最后开始向前找符合要求的最大子串
                for (int i = vowels.size() - 1; i > startVowelIndex; i--) {
                    Tuple tuple = vowels.get(i);
                    Integer vowel = vowelMap.get(tuple.c);
                    tFlag = tFlag ^ 1 << vowel;
                    if (tFlag == 0) {
                        startStrIndex = startVowelIndex == -1 ? 0 : vowels.get(startVowelIndex).index + 1;
                        maxLen = Math.max(maxLen, tuple.index - startStrIndex);
                        break;
                    }
                }
            }

            startVowelIndex++;
            Tuple tuple = vowels.get(startVowelIndex);
            startStrIndex = startVowelIndex == -1 ? 0 : tuple.index + 1;
            leftLen = s.length() - startStrIndex;
            flag = flag ^ 1 << vowelMap.get(tuple.c);
        }

        return Math.max(maxLen, maxSubStrLen);
    }
}
