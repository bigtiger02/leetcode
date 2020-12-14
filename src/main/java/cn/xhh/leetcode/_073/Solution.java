package cn.xhh.leetcode._073;

import java.util.HashSet;
import java.util.Set;

/**
 * Set matrix zeros
 * <a href="https://leetcode-cn.com/problems/set-matrix-zeroes/">Set Matrix zeros</a>
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/14
 */
public class Solution {
    public void setZeroes(int[][] matrix) {

        if(null == matrix){
            return;
        }

        Set<Integer> zeroRowIndexes = new HashSet<>();
        Set<Integer> zeroColumnIndexes = new HashSet<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == 0){
                    zeroColumnIndexes.add(i);
                    zeroColumnIndexes.add(j);
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(zeroRowIndexes.contains(i) || zeroColumnIndexes.contains(j)){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
