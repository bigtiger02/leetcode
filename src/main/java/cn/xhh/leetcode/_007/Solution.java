package cn.xhh.leetcode._007;

/**
 * Reverse Integer
 * <a href="https://leetcode-cn.com/problems/reverse-integer/">Reverse Integer</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/2
 */
public class Solution {
    public int reverse(int x) {
        int t = Math.abs(x), result = 0;
        while(t > 0){
            int num = t % 10;
            t = t / 10;
            if(result > (Integer.MAX_VALUE - num) / 10){
                return 0;
            }
            result = result * 10 + num;
        }

        return Integer.signum(x) * result;
    }
}
