package cn.xhh.leetcode._125;

import org.junit.Assert;
import org.junit.Test;

/**
 * ValidPalindromeTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/24
 */
public class ValidPalindromeTest {
    private final Solution solution = new Solution();

    @Test
    public void case1() {
        boolean result = solution.isPalindrome("");
        Assert.assertEquals(true, result);
    }

    @Test
    public void case2() {
        boolean result = solution.isPalindrome("1");
        Assert.assertEquals(true, result);
    }

    @Test
    public void case3() {
        boolean result = solution.isPalindrome("12");
        Assert.assertEquals(false, result);
    }

    @Test
    public void case4() {
        boolean result = solution.isPalindrome("A man, a plan, a canal: Panama");
        Assert.assertEquals(true, result);
    }

    @Test
    public void case5() {
        boolean result = solution.isPalindrome("race a car");
        Assert.assertEquals(false, result);
    }

    @Test
    public void case6() {
        boolean result = solution.isPalindrome("OP");
        Assert.assertEquals(false, result);
    }
}
