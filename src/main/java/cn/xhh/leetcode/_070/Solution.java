package cn.xhh.leetcode._070;

/**
 * Climbing stairs
 * <a href="https://leetcode-cn.com/problems/climbing-stairs/">Climbing stairs</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/20
 */
public class Solution {
    public int climbStairs(int n) {
        return tryClimb(n-1) + tryClimb(n-2);
    }

    private int tryClimb(int n){
        if(n == 0){
            return 1;
        }

        if(n < 0){
            return 0;
        }

        return tryClimb(n-1) + tryClimb(n-2);
    }
}
