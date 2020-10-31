package cn.xhh.leetcode._004;

import org.junit.Assert;
import org.junit.Test;

/**
 * MedianOfTwoSortedArraysTest
 * <a href="https://leetcode-cn.com/problems/median-of-two-sorted-arrays/">MedianOfTwoSortedArraysTest</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/10/31
 */
public class MedianOfTwoSortedArraysTest {

    private Solution solution = new Solution();

    @Test
    public void case1(){
        int[] numbers1 = new int[]{1,3};
        int[] numbers2 = new int[]{2};
        double result = solution.findMedianSortedArrays(numbers1, numbers2);
        Assert.assertEquals(2.0d,result, 0);
    }

    @Test
    public void case2(){
        int[] numbers1 = new int[]{1,2};
        int[] numbers2 = new int[]{3,4};
        double result = solution.findMedianSortedArrays(numbers1, numbers2);
        Assert.assertEquals(2.5d,result, 0);
    }

    @Test
    public void case3(){
        int[] numbers1 = new int[]{0,0};
        int[] numbers2 = new int[]{0,0};
        double result = solution.findMedianSortedArrays(numbers1, numbers2);
        Assert.assertEquals(0.0d,result, 0);
    }

    @Test
    public void case4(){
        int[] numbers1 = new int[]{2};
        int[] numbers2 = new int[]{};
        double result = solution.findMedianSortedArrays(numbers1, numbers2);
        Assert.assertEquals(2.0d,result, 0);
    }

    @Test
    public void case5(){
        int[] numbers1 = new int[]{};
        int[] numbers2 = new int[]{1};
        double result = solution.findMedianSortedArrays(numbers1, numbers2);
        Assert.assertEquals(1.0d,result, 0);
    }
}
