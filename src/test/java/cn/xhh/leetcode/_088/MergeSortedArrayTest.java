package cn.xhh.leetcode._088;

import org.junit.Assert;
import org.junit.Test;

/**
 * MergeSortedArrayTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/23
 */
public class MergeSortedArrayTest {
    private Solution solution = new Solution();

    @Test
    public void case1(){
        int[] numbers1 = new int[]{1,2,3,0,0,0};
        solution.merge(numbers1,3,new int[]{2,5,6},3);
        Assert.assertArrayEquals(new int[]{1,2,2,3,5,6}, numbers1);
    }

    @Test
    public void case2(){
        int[] numbers1 = new int[]{1,2,3,0,0,0};
        solution.merge(numbers1,3,new int[]{},0);
        Assert.assertArrayEquals(new int[]{1,2,3,0,0,0}, numbers1);
    }

    @Test
    public void case3(){
        int[] numbers1 = new int[]{1,2,3,0,0,0};
        solution.merge(numbers1,3,new int[]{4},1);
        Assert.assertArrayEquals(new int[]{1,2,3,4,0,0}, numbers1);
    }

    @Test
    public void case4(){
        int[] numbers1 = new int[]{1,2,3,0,0,0};
        solution.merge(numbers1,3,new int[]{2,3,4},3);
        Assert.assertArrayEquals(new int[]{1,2,2,3,3,4}, numbers1);
    }

    @Test
    public void case5(){
        int[] numbers1 = new int[]{5,6,7,0,0,0};
        solution.merge(numbers1,3,new int[]{2,3,4},3);
        Assert.assertArrayEquals(new int[]{2,3,4,5,6,7}, numbers1);
    }
}
