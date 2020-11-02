package cn.xhh.leetcode._009;

import org.junit.Assert;
import org.junit.Test;

/**
 * PalindromeNumberTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/3
 */
public class PalindromeNumberTest {

    private Solution solution = new Solution();

    @Test
    public void case1(){
        boolean result = solution.isPalindrome(121);
        Assert.assertEquals(true, result);
    }

    @Test
    public void case2(){
        boolean result = solution.isPalindrome(-121);
        Assert.assertEquals(false, result);
    }

    @Test
    public void case3(){
        boolean result = solution.isPalindrome(10);
        Assert.assertEquals(false, result);
    }

    @Test
    public void case4(){
        boolean result = solution.isPalindrome(11);
        Assert.assertEquals(true, result);
    }

    @Test
    public void case5(){
        boolean result = solution.isPalindrome(1);
        Assert.assertEquals(true, result);
    }

    @Test
    public void case6(){
        boolean result = solution.isPalindrome(-1);
        Assert.assertEquals(false, result);
    }

    @Test
    public void case7(){
        boolean result = solution.isPalindrome(0);
        Assert.assertEquals(true, result);
    }
}
