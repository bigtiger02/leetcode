package cn.xhh.leetcode._091;

import org.junit.Assert;
import org.junit.Test;

/**
 * DecodeWaysTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/17
 */
public class DecodeWaysTest {
    private final Solution solution = new Solution();

    @Test
    public void case1() {
        int result = solution.numDecodings("0001");
        Assert.assertEquals(0,result);
    }

    @Test
    public void case2() {
        int result = solution.numDecodings("0010");
        Assert.assertEquals(0,result);
    }

    @Test
    public void case3() {
        int result = solution.numDecodings("12");
        Assert.assertEquals(2,result);
    }

    @Test
    public void case4() {
        int result = solution.numDecodings("226");
        Assert.assertEquals(3,result);
    }

    @Test
    public void case5() {
        int result = solution.numDecodings("0");
        Assert.assertEquals(0,result);
    }

    @Test
    public void case6() {
        int result = solution.numDecodings("1");
        Assert.assertEquals(1,result);
    }

    @Test
    public void case7() {
        int result = solution.numDecodings("10");
        Assert.assertEquals(1,result);
    }

    @Test
    public void case8() {
        int result = solution.numDecodings("10011");
        Assert.assertEquals(0,result);
    }
}
