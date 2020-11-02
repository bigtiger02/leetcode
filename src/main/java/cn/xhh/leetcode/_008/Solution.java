package cn.xhh.leetcode._008;

/**
 * String to integer atoi
 * <a href="https://leetcode-cn.com/problems/string-to-integer-atoi/">String to integer atoi</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/2
 */
public class Solution {
    public int myAtoi(String s) {
        if(null == s){
            return 0;
        }

        int sign = 0;
        int result = 0;
        for (int i = 0; i < s.length();i++) {
            char c = s.charAt(i);
            if (isNumber(c)) {//找到数字
                //符号位容错，有可能为纯正整数
                sign = 0 == sign ? 1 : sign;
                //越界检测
                int value = c - '0';
                if (result > (Integer.MAX_VALUE - value) / 10) {
                    return 1 == sign ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                result = result * 10 + value;
                continue;
            }

            //表明已经遇到过数字并且当前字符不是数字
            if (0 != sign) {
                return sign * result;
            }

            //空字符串继续判断
            if(' ' == c){
                continue;
            }

            //符号位处理
            if('-' == c || '+' == c){
                if(i < s.length() - 1 && isNumber(s.charAt(i+1))){
                    sign = '-' == c ? -1 : 1;
                    continue;
                }
                //表明符号位后面非数字，应返回0
                return 0;
            }

            //表明还未遇到数字
            return 0;
        }

        return sign * result;
    }

    private boolean isNumber(char c){
        return c >= '0' && c<= '9';
    }
}
