package cn.xhh.leetcode._322;

import org.junit.Assert;
import org.junit.Test;

/**
 * CoinChangeTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/9
 */
public class CoinChangeTest {
    private Solution solution = new Solution();

    @Test
    public void case1() {
        int result = solution.coinChange(new int[]{1, 2, 5}, 11);
        Assert.assertEquals(3, result);
    }

    @Test
    public void case2() {
        int result = solution.coinChange(new int[]{2}, 3);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void case4() {
        int result = solution.coinChange(new int[]{1}, 1);
        Assert.assertEquals(1, result);
    }

    @Test
    public void case5() {
        int result = solution.coinChange(new int[]{1}, 2);
        Assert.assertEquals(2, result);
    }

    @Test
    public void case6() {
        int result = solution.coinChange(new int[]{1}, 0);
        Assert.assertEquals(0, result);
    }

    @Test
    public void case7() {
        int result = solution.coinChange(new int[]{}, 0);
        Assert.assertEquals(0, result);
    }

}
