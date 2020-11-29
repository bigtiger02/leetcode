package cn.xhh.leetcode._231;

import org.junit.Assert;
import org.junit.Test;

/**
 * PowerOfTwoTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/30
 */
public class PowerOfTwoTest {

    private Solution solution = new Solution();

    @Test
    public void case1(){
        boolean result = solution.isPowerOfTwo(1);
        Assert.assertEquals(true, result);
    }

    @Test
    public void case2(){
        boolean result = solution.isPowerOfTwo(16);
        Assert.assertEquals(true, result);
    }

    @Test
    public void case3(){
        boolean result = solution.isPowerOfTwo(218);
        Assert.assertEquals(false, result);
    }

    @Test
    public void case4(){
        boolean result = solution.isPowerOfTwo(0);
        Assert.assertEquals(false, result);
    }

    @Test
    public void case5(){
        boolean result = solution.isPowerOfTwo(-2);
        Assert.assertEquals(false, result);
    }
}
