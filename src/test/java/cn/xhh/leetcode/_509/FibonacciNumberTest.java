package cn.xhh.leetcode._509;

import org.junit.Assert;
import org.junit.Test;

/**
 * FibonacciNumberTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/9
 */
public class FibonacciNumberTest {
    private Solution solution = new Solution();

    @Test
    public void case1() {
        int result = solution.fib(0);
        Assert.assertEquals(0,result);
    }

    @Test
    public void case2() {
        int result = solution.fib(1);
        Assert.assertEquals(1,result);
    }

    @Test
    public void case3() {
        int result = solution.fib(4);
        Assert.assertEquals(3,result);
    }
}
