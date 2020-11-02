package cn.xhh.leetcode._007;

import org.junit.Assert;
import org.junit.Test;

/**
 * ReverseIntegerTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/2
 */
public class ReverseIntegerTest {

    private Solution solution = new Solution();

    @Test
    public void case1(){
        int result = solution.reverse(123);
        Assert.assertEquals(321, result);
    }

    @Test
    public void case2(){
        int result = solution.reverse(-123);
        Assert.assertEquals(-321, result);
    }

    @Test
    public void case3(){
        int result = solution.reverse(120);
        Assert.assertEquals(21, result);
    }

    @Test
    public void case4(){
        int result = solution.reverse(1534236469);
        Assert.assertEquals(0, result);
    }

    @Test
    public void case5(){
        int result = solution.reverse(901000);
        Assert.assertEquals(109, result);
    }
}
