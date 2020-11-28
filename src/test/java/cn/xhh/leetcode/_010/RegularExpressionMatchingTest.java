package cn.xhh.leetcode._010;

import org.junit.Assert;
import org.junit.Test;

/**
 * RegularExpressionMatchingTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/27
 */
public class RegularExpressionMatchingTest {
    private Solution solution = new Solution();

    @Test
    public void case1(){
        boolean result = solution.isMatch("aa","a");
        Assert.assertFalse(result);
    }

    @Test
    public void case2(){
        boolean result = solution.isMatch("aa","a*");
        Assert.assertTrue(result);
    }

    @Test
    public void case3(){
        boolean result = solution.isMatch("ab",".*");
        Assert.assertTrue(result);
    }

    @Test
    public void case4(){
        boolean result = solution.isMatch("aab","c*a*b");
        Assert.assertTrue(result);
    }

    @Test
    public void case5(){
        boolean result = solution.isMatch("mississippi","mis*is*p*.");
        Assert.assertFalse(result);
    }

    @Test
    public void case6(){
        boolean result = solution.isMatch("mississippi","mis*is*ip*.");
        Assert.assertTrue(result);
    }

    @Test
    public void case7(){
        boolean result = solution.isMatch("aaa","ab*a*c*a");
        Assert.assertTrue(result);
    }
}
