package cn.xhh.leetcode._066;

import org.junit.Assert;
import org.junit.Test;

/**
 * PlusOneTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/4
 */
public class PlusOneTest {
    private Solution solution = new Solution();

    @Test
    public void case1(){
        int[] results = solution.plusOne(new int[]{1,2,3});
        Assert.assertArrayEquals(new int[]{1,2,4},results);
    }

    @Test
    public void case2(){
        int[] results = solution.plusOne(new int[]{4,3,2,1});
        Assert.assertArrayEquals(new int[]{4,3,2,2},results);
    }

    @Test
    public void case3(){
        int[] results = solution.plusOne(new int[]{0});
        Assert.assertArrayEquals(new int[]{1},results);
    }

    @Test
    public void case4(){
        int[] results = solution.plusOne(new int[]{9});
        Assert.assertArrayEquals(new int[]{1,0},results);
    }

    @Test
    public void case5(){
        int[] results = solution.plusOne(new int[]{9,9});
        Assert.assertArrayEquals(new int[]{1,0,0},results);
    }
}
