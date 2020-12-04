package cn.xhh.leetcode._034;

import org.junit.Assert;
import org.junit.Test;

/**
 * FindFirstAndLastPositionOfElementInSortedArrayTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/4
 */
public class FindFirstAndLastPositionOfElementInSortedArrayTest {
    private Solution solution = new Solution();

    @Test
    public void case1(){
        int[] results = solution.searchRange(new int[]{5,7,7,8,8,10}, 8);
        Assert.assertArrayEquals(new int[]{3,4}, results);
    }

    @Test
    public void case2(){
        int[] results = solution.searchRange(new int[]{5,7,7,8,8,10}, 6);
        Assert.assertArrayEquals(new int[]{-1,-1}, results);
    }

    @Test
    public void case3(){
        int[] results = solution.searchRange(new int[]{}, 0);
        Assert.assertArrayEquals(new int[]{-1,-1}, results);
    }

    @Test
    public void case4(){
        int[] results = solution.searchRange(new int[]{1,3}, 1);
        Assert.assertArrayEquals(new int[]{0,0}, results);
    }

    @Test
    public void case5(){
        int[] results = solution.searchRange(new int[]{1,4}, 4);
        Assert.assertArrayEquals(new int[]{1,1}, results);
    }

    @Test
    public void case6(){
        int[] results = solution.searchRange(new int[]{5,7,8,8,10}, 6);
        Assert.assertArrayEquals(new int[]{-1,-1}, results);
    }

    @Test
    public void case7(){
        int[] results = solution.searchRange(new int[]{1,2,3}, 2);
        Assert.assertArrayEquals(new int[]{1,1}, results);
    }
}
