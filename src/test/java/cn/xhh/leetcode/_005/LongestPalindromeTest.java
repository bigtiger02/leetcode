package cn.xhh.leetcode._005;

import org.junit.Assert;
import org.junit.Test;

/**
 * LongestPalidromeTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/10/31
 */
public class LongestPalindromeTest {

    private Solution solution = new Solution();

    @Test
    public void case1(){
        String str = "babad";
        String result = solution.longestPalindrome(str);
        Assert.assertEquals("bab", result);
    }

    @Test
    public void case2(){
        String str = "cbbd";
        String result = solution.longestPalindrome(str);
        Assert.assertEquals("bb", result);
    }

    @Test
    public void case3(){
        String str = "a";
        String result = solution.longestPalindrome(str);
        Assert.assertEquals("a", result);
    }

    @Test
    public void case4(){
        String str = "aba";
        String result = solution.longestPalindrome(str);
        Assert.assertEquals("aba", result);
    }

    @Test
    public void case5(){
        String str = "abcd";
        String result = solution.longestPalindrome(str);
        Assert.assertEquals("a", result);
    }
}
