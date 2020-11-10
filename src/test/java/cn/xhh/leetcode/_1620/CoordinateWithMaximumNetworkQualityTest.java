package cn.xhh.leetcode._1620;

import org.junit.Assert;
import org.junit.Test;

/**
 * CoordinateWithMaximumNetworkQualityTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/11
 */
public class CoordinateWithMaximumNetworkQualityTest {
    private Solution solution = new Solution();

    @Test
    public void case1(){
        int[] results = solution.bestCoordinate(new int[][]{{1,2,5},{2,1,7},{3,1,9}},2);
        Assert.assertArrayEquals(new int[]{2,1}, results);
    }

    @Test
    public void case2(){
        int[] results = solution.bestCoordinate(new int[][]{{23,11,21}},9);
        Assert.assertArrayEquals(new int[]{23,11}, results);
    }

    @Test
    public void case3(){
        int[] results = solution.bestCoordinate(new int[][]{{1,2,13},{2,1,7},{0,1,9}},2);
        Assert.assertArrayEquals(new int[]{1,2}, results);
    }

    @Test
    public void case4(){
        int[] results = solution.bestCoordinate(new int[][]{{2,1,9},{0,1,9}},2);
        Assert.assertArrayEquals(new int[]{0,1}, results);
    }

    @Test
    public void case5(){
        int[] results = solution.bestCoordinate(new int[][]{{42,0,0}},7);
        Assert.assertArrayEquals(new int[]{0,0}, results);
    }

    @Test
    public void case6(){
        int[] results = solution.bestCoordinate(new int[][]{{42,0,0}},0);
        Assert.assertArrayEquals(new int[]{0,0}, results);
    }

    @Test
    public void case7(){
        int[] results = solution.bestCoordinate(new int[][]{{44,31,4},{47,27,27},{7,13,0},{13,21,20},{50,34,18},{47,44,28}},13);
        Assert.assertArrayEquals(new int[]{47,27}, results);
    }

    @Test
    public void case8(){
        int[] results = solution.bestCoordinate(new int[][]{{0,1,2},{2,1,2},{1,0,2},{1,2,2}},1);
        Assert.assertArrayEquals(new int[]{1,1}, results);
    }
}
