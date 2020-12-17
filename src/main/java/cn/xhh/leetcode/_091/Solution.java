package cn.xhh.leetcode._091;

/**
 * Decode ways
 * <a href="https://leetcode-cn.com/problems/decode-ways/"></a>
 * @author <a href="mailto:bigtiger02@gmail.com">Decode ways</a>
 * @date 2020/12/17
 */
public class Solution {
    public int numDecodings(String s) {
        if(s.charAt(0) == '0'){
            return 0;
        }

        int len = s.length();
        int[] notJoin = new int[len];
        int[] join = new int[len];
        notJoin[0] = 1;
        join[0] = 0;

        for (int i = 1; i < len; i++) {
            int num = s.charAt(i) - '0';
            int lastNum = s.charAt(i-1) - '0';
            int totalNum = lastNum*10 + num;
            notJoin[i] = num == 0 ? 0 : notJoin[i-1] + join[i-1];
            join[i] = totalNum > 26 ? 0 : notJoin[i-1];
        }

        return notJoin[len-1] + join[len-1];
    }
}
