package cn.xhh.leetcode._069;

import org.junit.Assert;
import org.junit.Test;

/**
 * SqrtTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/7
 */
public class SqrtTest {

    private Solution solution = new Solution();

    @Test
    public void case1() {
        int result = solution.mySqrt(0);
        Assert.assertEquals(0, result);
    }

    @Test
    public void case2() {
        int result = solution.mySqrt(1);
        Assert.assertEquals(1, result);
    }

    @Test
    public void case3() {
        int result = solution.mySqrt(2);
        Assert.assertEquals(1, result);
    }

    @Test
    public void case4() {
        int result = solution.mySqrt(4);
        Assert.assertEquals(2, result);
    }

    @Test
    public void case5() {
        int result = solution.mySqrt(8);
        Assert.assertEquals(2, result);
    }

    @Test
    public void case6() {
        int result = solution.mySqrt(2147395599);
        Assert.assertEquals(46339, result);
    }

    @Test
    public void case7() {
        int result = solution.mySqrt(Integer.MAX_VALUE);
        Assert.assertEquals((int)Math.sqrt(Integer.MAX_VALUE), result);
    }
}
