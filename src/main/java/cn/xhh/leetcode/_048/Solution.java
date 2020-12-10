package cn.xhh.leetcode._048;

/**
 * Rotate image
 * <a href="https://leetcode-cn.com/problems/rotate-image/">rotate image</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/10
 */
public class Solution {
    public void rotate(int[][] matrix) {
        if(null == matrix || matrix.length == 1){
            return;
        }

        int len = matrix.length;
        for (int i = 0; i < len/2; i++) {
            for (int j = i; j < len-i-1; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[len-j-1][i];
                matrix[len-j-1][i] = matrix[len-i-1][len-j-1];
                matrix[len-i-1][len-j-1] = matrix[j][len-i-1];
                matrix[j][len-i-1] = tmp;
            }
        }
    }
}
