package cn.xhh.leetcode._054;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * SpiralMatrixTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/21
 */
public class SpiralMatrixTest {
    private Solution solution = new Solution();

    @Test
    public void case1(){
        List<Integer> results = solution.spiralOrder(new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}
        });

        Assert.assertArrayEquals(results.toArray(new Integer[0]),
                new Integer[]{1,2,3,6,9,8,7,4,5});
    }

    @Test
    public void case2(){
        List<Integer> results = solution.spiralOrder(new int[][]{
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        });

        Assert.assertArrayEquals(results.toArray(new Integer[0]),
                new Integer[]{1,2,3,4,8,12,11,10,9,5,6,7});
    }

}
