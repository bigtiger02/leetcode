package cn.xhh.leetcode._050;

import org.junit.Assert;
import org.junit.Test;

/**
 * PowxNTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/10
 */
public class PowxNTest {
    private Solution solution = new Solution();

    @Test
    public void case1() {
        double result = solution.myPow(2.00000,10);
        Assert.assertEquals(1024.00000, result,0);
    }

    @Test
    public void case2() {
        double result = solution.myPow(2.10000,3);
        Assert.assertEquals(9.26100, result,3);
    }

    @Test
    public void case3() {
        double result = solution.myPow(2.00000,-2);
        Assert.assertEquals(0.25000, result,2);
    }
}
