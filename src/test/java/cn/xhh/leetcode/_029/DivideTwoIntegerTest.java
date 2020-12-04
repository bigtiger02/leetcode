package cn.xhh.leetcode._029;

import org.junit.Assert;
import org.junit.Test;

/**
 * DivideTwoIntegerTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/4
 */
public class DivideTwoIntegerTest {

    private Solution solution = new Solution();

    @Test
    public void case1() {
        int result = solution.divide(10,3);
        Assert.assertEquals(3, result);
    }

    @Test
    public void case2() {
        int result = solution.divide(7,-3);
        Assert.assertEquals(-2, result);
    }
}
