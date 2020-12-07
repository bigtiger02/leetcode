package cn.xhh.leetcode._1143;

import org.junit.Assert;
import org.junit.Test;

/**
 * LongestCommonSubsequenceTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/8
 */
public class LongestCommonSubsequenceTest {
    private Solution solution = new Solution();

    @Test
    public void case1() {
        int result = solution.longestCommonSubsequence("abcde","ace");
        Assert.assertEquals(3,result);
    }

    @Test
    public void case2() {
        int result = solution.longestCommonSubsequence("abc","abc");
        Assert.assertEquals(3,result);
    }

    @Test
    public void case3() {
        int result = solution.longestCommonSubsequence("abc","def");
        Assert.assertEquals(0,result);
    }

    @Test
    public void case4() {
        int result = solution.longestCommonSubsequence("abcd","def");
        Assert.assertEquals(1,result);
    }
}
