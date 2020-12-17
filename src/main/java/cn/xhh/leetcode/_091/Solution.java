package cn.xhh.leetcode._091;

/**
 * Decode ways
 * <a href="https://leetcode-cn.com/problems/decode-ways/"></a>
 * @author <a href="mailto:bigtiger02@gmail.com">Decode ways</a>
 * @date 2020/12/17
 */
public class Solution {
    public int numDecodings(String s) {
        if(null == s || s.length() == 0){
            return 0;
        }

        if("0".equals(s)){
            return 0;
        }

        int[] dp = new int[s.length()+1];
        for (int i = 0; i < s.length(); i++) {
        }
    }
}
