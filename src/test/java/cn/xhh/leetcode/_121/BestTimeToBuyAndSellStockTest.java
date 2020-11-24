package cn.xhh.leetcode._121;

import org.junit.Assert;
import org.junit.Test;

/**
 * BestTimeToBuyAndSellStockTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/24
 */
public class BestTimeToBuyAndSellStockTest {
    private Solution solution = new Solution();

    @Test
    public void case1(){
        int result = solution.maxProfit(new int[]{7,1,5,3,6,4});
        Assert.assertEquals(5, result);
    }

    @Test
    public void case2(){
        int result = solution.maxProfit(new int[]{7,6,4,3,1});
        Assert.assertEquals(0, result);
    }

    @Test
    public void case3(){
        int result = solution.maxProfit(new int[]{7,1,5,1,8,3,6,4});
        Assert.assertEquals(7, result);
    }
}
