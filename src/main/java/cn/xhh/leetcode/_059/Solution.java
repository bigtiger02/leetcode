package cn.xhh.leetcode._059;

/**
 * Spiral matrix ii
 * <a href="https://leetcode-cn.com/problems/spiral-matrix-ii/">Spiral matrix ii</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/21
 */
public class Solution {
    public int[][] generateMatrix(int n) {
        int[][] results = new int[n][n];
        int max = n * n;
        int v = 0, h = 0;
        int top = 0, bottom = n, left = -1, right = n;
        int director = 1;
        for (int i = 1; i <= max; i++) {
            results[v][h] = i;
            switch (director){
                case 1: h++;break;
                case 2: v++;break;
                case 3: h--;break;
                case 4: v--;break;
            }

            if(director == 1 && h == right){
                director = 2;
                h--;
                v++;
                right--;
            }else if(director == 2 && v == bottom){
                director = 3;
                v--;
                h--;
                bottom--;
            }else if(director == 3 && h == left){
                director = 4;
                h++;
                v--;
                left++;
            }else if(director == 4 && v == top){
                director = 1;
                v++;
                h++;
                top++;
            }
        }

        return results;
    }
}
