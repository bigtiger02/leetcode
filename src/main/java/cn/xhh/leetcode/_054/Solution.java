package cn.xhh.leetcode._054;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Spiral matrix
 * <a href="https://leetcode-cn.com/problems/spiral-matrix/">Spiral matrix</a>
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/21
 */
public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> results = new LinkedList<>();
        if(null == matrix || 0 == matrix.length){
            return results;
        }
        int m = matrix.length, n = matrix[0].length;
        int count = 0, total = m * n;
        int i = 0, j = 0, director = 1;
        int left = -1, right = n, top = 0, end = m;
        while(count < total){
            results.add(matrix[i][j]);
            count++;

            switch (director){
                case 1: j++;break;
                case 2: i++;break;
                case 3: j--;break;
                case 4: i--;break;
            }

            if(director == 1 && j == right){
                director = 2;
                j--;
                i++;
                right--;
            }else if(director == 2 && i == end){
                director = 3;
                i--;
                j--;
                end--;
            }else if(director == 3 && j == left){
                director = 4;
                j++;
                i--;
                left++;
            }else if(director == 4 && i == top){
                director = 1;
                i++;
                j++;
                top++;
            }
        }

        return results;
    }
}
