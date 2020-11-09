package cn.xhh.leetcode._327;

import org.junit.Assert;
import org.junit.Test;

/**
 * CountOfRangeSumTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/7
 */
public class CountOfRangeSumTest {
    private Solution solution = new Solution();

    @Test
    public void case1(){
        int result = solution.countRangeSum(new int[]{-2,5,1}, -2 ,2);
        Assert.assertEquals(3, result);
    }

    @Test
    public void case2(){
        int result = solution.countRangeSum(new int[]{}, -2 ,2);
        Assert.assertEquals(0, result);
    }

    @Test
    public void case3(){
        int result = solution.countRangeSum(new int[]{1}, -2 ,2);
        Assert.assertEquals(1, result);
    }

    @Test
    public void case4(){
        int result = solution.countRangeSum(new int[]{1,2,3}, 4 ,5);
        Assert.assertEquals(0, result);
    }

    @Test
    public void case5(){
        int result = solution.countRangeSum(new int[]{1,2,3}, 0 ,1);
        Assert.assertEquals(2, result);
    }

    @Test
    public void case6(){
        int result = solution.countRangeSum(new int[]{0}, 0 ,0);
        Assert.assertEquals(1, result);
    }
}
