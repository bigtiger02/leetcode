package cn.xhh.leetcode._01;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * TwoSumTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/10/31
 */
public class TwoSumTest {

    private Solution solution = new Solution();

    @Test
    public void case1(){
        int[] numbers = new int[]{2,7,11,15};
        int target = 9;
        int[] results = solution.twoSum(numbers, target);
        assertArrayEquals(new int[]{0,1},results);
    }

    @Test
    public void case2(){
        int[] numbers = new int[]{3,2,4};
        int target = 6;
        int[] results = solution.twoSum(numbers, target);
        assertArrayEquals(new int[]{1,2},results);
    }

    @Test
    public void case3(){
        int[] numbers = new int[]{3,3};
        int target = 6;
        int[] results = solution.twoSum(numbers, target);
        assertArrayEquals(new int[]{0,1},results);
    }
}
