package cn.xhh.leetcode._043;

import org.junit.Assert;
import org.junit.Test;

/**
 * MultiplyStringsTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/19
 */
public class MultiplyStringsTest {
    private Solution solution = new Solution();

    @Test
    public void case1(){
        String result = solution.multiply("2","3");
        Assert.assertEquals("6", result);
    }

    @Test
    public void case2(){
        String result = solution.multiply("123","456");
        Assert.assertEquals("56088", result);
    }

    @Test
    public void case3(){
        String result = solution.multiply("123","0");
        Assert.assertEquals("0", result);
    }

    @Test
    public void case4(){
        String result = solution.multiply("0","123");
        Assert.assertEquals("0", result);
    }

    @Test
    public void case5(){
        String result = solution.multiply("123","1");
        Assert.assertEquals("123", result);
    }

    @Test
    public void case6(){
        String result = solution.multiply("1","123");
        Assert.assertEquals("123", result);
    }

    @Test
    public void case7(){
        String result = solution.multiply("9999999","9999999");
        Assert.assertEquals(Long.toString(9999999L*9999999L,10), result);
    }
}
