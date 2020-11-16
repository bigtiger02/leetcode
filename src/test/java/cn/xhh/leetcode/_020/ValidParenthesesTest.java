package cn.xhh.leetcode._020;

import org.junit.Assert;
import org.junit.Test;

/**
 * ValidParenthesesTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/16
 */
public class ValidParenthesesTest {
    private Solution solution = new Solution();

    @Test
    public void case1(){
        boolean result = solution.isValid("()");
        Assert.assertEquals(true, result);
    }

    @Test
    public void case2(){
        boolean result = solution.isValid("()[]{}");
        Assert.assertEquals(true, result);
    }

    @Test
    public void case3(){
        boolean result = solution.isValid("(]");
        Assert.assertEquals(false, result);
    }

    @Test
    public void case4(){
        boolean result = solution.isValid("([)]");
        Assert.assertEquals(false, result);
    }

    @Test
    public void case5(){
        boolean result = solution.isValid("{[]}");
        Assert.assertEquals(true, result);
    }

    @Test
    public void case6(){
        boolean result = solution.isValid("");
        Assert.assertEquals(true, result);
    }

    @Test
    public void case7(){
        boolean result = solution.isValid("]");
        Assert.assertEquals(false, result);
    }

    @Test
    public void case8(){
        boolean result = solution.isValid("()]");
        Assert.assertEquals(false, result);
    }

    @Test
    public void case9(){
        boolean result = solution.isValid("[(({})}]");
        Assert.assertEquals(false, result);
    }
}
