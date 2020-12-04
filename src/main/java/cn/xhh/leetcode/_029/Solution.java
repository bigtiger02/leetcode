package cn.xhh.leetcode._029;

/**
 * divide two integers
 * <a href="https://leetcode-cn.com/problems/divide-two-integers/">divide two integers</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/4
 */
public class Solution {

    public int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }

        if(divisor == 1){
            return dividend;
        }

        //符号位
        boolean sign = Integer.signum(dividend) == Integer.signum(divisor);
        int result = 0;
        dividend = dividend < 0 ? dividend : -dividend;
        divisor =  divisor < 0 ? divisor : -divisor;

        while(dividend <= divisor){
            int tmp = divisor;
            int c = 1;
            while(dividend-tmp <= tmp){
                tmp = tmp << 1;
                c = c << 1;
            }

            dividend -= tmp;
            result += c;
        }

        return sign ? result : -result;
    }
}
