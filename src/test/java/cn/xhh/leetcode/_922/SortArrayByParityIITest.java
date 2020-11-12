package cn.xhh.leetcode._922;

import org.junit.Assert;
import org.junit.Test;

/**
 * SortArrayByParityIITest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/13
 */
public class SortArrayByParityIITest {
    private Solution solution = new Solution();

    @Test
    public void case1(){
        int[] results = solution.sortArrayByParityII(new int[]{4,2,5,7});
        Assert.assertArrayEquals(new int[]{4,5,2,7},results);
    }

    @Test
    public void case2(){
        int[] results = solution.sortArrayByParityII(new int[]{});
        Assert.assertArrayEquals(new int[]{},results);
    }

    @Test
    public void case3(){
        int[] results = solution.sortArrayByParityII(new int[]{4});
        Assert.assertArrayEquals(new int[]{4},results);
    }

    @Test
    public void case5(){
        int[] results = solution.sortArrayByParityII(new int[]{4,5});
        Assert.assertArrayEquals(new int[]{4,5},results);
    }

    @Test
    public void case6(){
        int[] results = solution.sortArrayByParityII(new int[]{4,5,6});
        Assert.assertArrayEquals(new int[]{4,5,6},results);
    }

    @Test
    public void case7(){
        int[] results = solution.sortArrayByParityII(new int[]{4,5,5,6});
        Assert.assertArrayEquals(new int[]{4,5,6,5},results);
    }

    @Test
    public void case8(){
        int[] results = solution.sortArrayByParityII(new int[]{3,4});
        Assert.assertArrayEquals(new int[]{4,3},results);
    }

    @Test
    public void case9(){
        int[] results = solution.sortArrayByParityII(new int[]{2,3,1,1,4,0,0,4,3,3});
        Assert.assertArrayEquals(new int[]{2,3,0,1,4,1,0,3,4,3},results);
    }

    @Test
    public void case10(){
        int[] results = solution.sortArrayByParityII(new int[]{2,3,3,4,2});
        Assert.assertArrayEquals(new int[]{2,3,4,3,2},results);
    }
}
