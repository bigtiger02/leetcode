package cn.xhh.leetcode._122;

import org.junit.Assert;
import org.junit.Test;

/**
 * BestTimeToBuyAndSellStockIITest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/13
 */
public class BestTimeToBuyAndSellStockIITest {
    private Solution solution = new Solution();

    @Test
    public void case1(){
        int result = solution.maxProfit(new int[]{7,1,5,3,6,4});
        Assert.assertEquals(7, result);
    }

    @Test
    public void case2(){
        int result = solution.maxProfit(new int[]{1,2,3,4,5});
        Assert.assertEquals(4, result);
    }

    @Test
    public void case3(){
        int result = solution.maxProfit(new int[]{7,6,4,3,1});
        Assert.assertEquals(0, result);
    }

    @Test
    public void case4(){
        int result = solution.maxProfit(new int[]{});
        Assert.assertEquals(0, result);
    }

    @Test
    public void case5(){
        int result = solution.maxProfit(new int[]{1});
        Assert.assertEquals(0, result);
    }

    @Test
    public void case6(){
        int result = solution.maxProfit(new int[]{1,1});
        Assert.assertEquals(0, result);
    }

    @Test
    public void case7(){
        int result = solution.maxProfit(new int[]{1,2});
        Assert.assertEquals(1, result);
    }

    @Test
    public void case8(){
        int result = solution.maxProfit(new int[]{2,1});
        Assert.assertEquals(0, result);
    }

    @Test
    public void case9(){
        int result = solution.maxProfit(new int[]{2,1,1,3});
        Assert.assertEquals(2, result);
    }

    @Test
    public void case10(){
        int result = solution.maxProfit(new int[]{2,1,1,3});
        Assert.assertEquals(2, result);
    }
}
