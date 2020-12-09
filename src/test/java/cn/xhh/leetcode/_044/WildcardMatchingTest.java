package cn.xhh.leetcode._044;

import org.junit.Assert;
import org.junit.Test;

/**
 * WildcardMatchingTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/9
 */
public class WildcardMatchingTest {
    private Solution solution = new Solution();

    @Test
    public void case1(){
        boolean result = solution.isMatch("aa","a");
        Assert.assertEquals(false, result);
    }

    @Test
    public void case2(){
        boolean result = solution.isMatch("aa","*");
        Assert.assertEquals(true, result);
    }

    @Test
    public void case3(){
        boolean result = solution.isMatch("cb","?a");
        Assert.assertEquals(false, result);
    }

    @Test
    public void case4(){
        boolean result = solution.isMatch("adceb","*a*b");
        Assert.assertEquals(true, result);
    }

    @Test
    public void case5(){
        boolean result = solution.isMatch("abcdcb","a*c?b");
        Assert.assertEquals(false, result);
    }

    @Test
    public void case6(){
        boolean result = solution.isMatch("","******");
        Assert.assertEquals(true, result);
    }

    @Test
    public void case7(){
        boolean result = solution.isMatch("abcabczzzde","*abc???de*");
        Assert.assertEquals(true, result);
    }

    @Test
    public void case8(){
        boolean result = solution.isMatch("","?");
        Assert.assertEquals(false, result);
    }
}
