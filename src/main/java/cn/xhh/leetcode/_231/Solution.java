package cn.xhh.leetcode._231;

/**
 * Power of two
 * <a href="https://leetcode-cn.com/problems/power-of-two/">Power of two</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/30
 */
public class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0){
            return false;
        }

        int result = n & (n-1);
        return result == 0;
    }
}
