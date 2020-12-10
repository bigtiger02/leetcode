package cn.xhh.leetcode._050;

/**
 * Powx n
 * <a href="https://leetcode-cn.com/problems/powx-n/">Powx n</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/10
 */
public class Solution1 {
    public double myPow(double x, int n) {
        if(n == 0){
            return 1;
        }

        long N = n;
        return n >= 0 ? quickPow(x, N) : quickPow(x,-N);
    }

    private double quickPow(double x, long n){
        if(n == 0){
            return 1;
        }

        double result = quickPow(x, n/2);
        return n % 2 == 0 ? result * result : result * result * x;
    }
}
