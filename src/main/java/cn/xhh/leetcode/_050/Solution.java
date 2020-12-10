package cn.xhh.leetcode._050;

/**
 * Powx n
 * <a href="https://leetcode-cn.com/problems/powx-n/">Powx n</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/10
 */
public class Solution {
    public double myPow(double x, int n) {
        long N = n;
        return n >= 0 ? quickPow(x, N) : 1.0/quickPow(x,-N);
    }

    private double quickPow(double x, long n){
        if(n == 0){
            return 1;
        }

        double tmp = x, result = 1.0;
        while(n > 0){
            if(n % 2 == 1){
                result = result * tmp;
            }

            tmp = tmp * tmp;
            n = n/2;
        }
        return result;
    }
}
