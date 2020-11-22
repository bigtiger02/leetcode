package cn.xhh.leetcode._062;

import java.util.Arrays;

/**
 * Unique paths
 * <a href="https://leetcode-cn.com/problems/unique-paths/">Unique paths</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/22
 */
public class Solution1 {


    public int uniquePaths(int m, int n) {
        if(n == 0 || (m == 1 && n == 1)){
            return n;
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
            }
        }

        return uniquePath(2,1, m, n) + uniquePath(1,2, m, n);
    }

    private int uniquePath(int m, int n, int tm, int tn){
        if(m == tm || n == tn){
            return 1;
        }

        if(m < tm && n < tn){
            return uniquePath(m+1,n, tm, tn) + uniquePath(m,n+1, tm, tn);
        }

        return 0;
    }

}
