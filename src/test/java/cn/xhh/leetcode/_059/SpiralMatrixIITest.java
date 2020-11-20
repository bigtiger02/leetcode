package cn.xhh.leetcode._059;

import org.junit.Assert;
import org.junit.Test;

/**
 * SpiralMatrixIITest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/21
 */
public class SpiralMatrixIITest {
    private Solution solution = new Solution();

    @Test
    public void case1(){
        int[][] results = solution.generateMatrix(3);
        Assert.assertArrayEquals(new int[][]{
                {1,2,3},
                {8,9,4},
                {7,6,5}
        },results);
    }
}
