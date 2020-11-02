package cn.xhh.leetcode._008;

import org.junit.Assert;
import org.junit.Test;

/**
 * StringToIntegerAToITest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/2
 */
public class StringToIntegerAToITest {

    private Solution solution = new Solution();

    @Test
    public void case1(){
        int result = solution.myAtoi("42");
        Assert.assertEquals(42, result);
    }

    @Test
    public void case2(){
        int result = solution.myAtoi("-42");
        Assert.assertEquals(-42, result);
    }

    @Test
    public void case3(){
        int result = solution.myAtoi("4193 with words");
        Assert.assertEquals(4193, result);
    }

    @Test
    public void case4(){
        int result = solution.myAtoi("words and 987");
        Assert.assertEquals(0, result);
    }

    @Test
    public void case5(){
        int result = solution.myAtoi("-91283472332");
        Assert.assertEquals(Integer.MIN_VALUE, result);
    }

    @Test
    public void case6(){
        int result = solution.myAtoi("-a");
        Assert.assertEquals(0, result);
    }

    @Test
    public void case7(){
        int result = solution.myAtoi("91283472332");
        Assert.assertEquals(Integer.MAX_VALUE, result);
    }

    @Test
    public void case8(){
        int result = solution.myAtoi(" ");
        Assert.assertEquals(0, result);
    }

    @Test
    public void case9(){
        int result = solution.myAtoi(null);
        Assert.assertEquals(0, result);
    }

    @Test
    public void case10(){
        int result = solution.myAtoi("4 2");
        Assert.assertEquals(4, result);
    }

    @Test
    public void case11(){
        int result = solution.myAtoi("-4 2");
        Assert.assertEquals(-4, result);
    }

    @Test
    public void case12(){
        int result = solution.myAtoi("- 4 2");
        Assert.assertEquals(0, result);
    }

    @Test
    public void case13(){
        int result = solution.myAtoi("+1");
        Assert.assertEquals(1, result);
    }

    @Test
    public void case14(){
        int result = solution.myAtoi("+1 2");
        Assert.assertEquals(1, result);
    }

    @Test
    public void case15(){
        int result = solution.myAtoi("+ 1 2");
        Assert.assertEquals(0, result);
    }

    @Test
    public void case16(){
        int result = solution.myAtoi("2147483646");
        Assert.assertEquals(2147483646, result);
    }

    @Test
    public void case17(){
        int result = solution.myAtoi("2147483647");
        Assert.assertEquals(2147483647, result);
    }

    @Test
    public void case18(){
        int result = solution.myAtoi("2147483648");
        Assert.assertEquals(2147483647, result);
    }

    @Test
    public void case19(){
        int result = solution.myAtoi("-2147483647");
        Assert.assertEquals(-2147483647, result);
    }

    @Test
    public void case20(){
        int result = solution.myAtoi("-2147483648");
        Assert.assertEquals(-2147483648, result);
    }

    @Test
    public void case21(){
        int result = solution.myAtoi("-2147483649");
        Assert.assertEquals(-2147483648, result);
    }
}
