package cn.xhh.leetcode._076;

import org.junit.Assert;
import org.junit.Test;

/**
 * MinimumWindowSubstringTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/15
 */
public class MinimumWindowSubstringTest {
    private Solution solution = new Solution();

    @Test
    public void case1() {
        String result = solution.minWindow("ADOBECODEBANC","ABC");
        Assert.assertEquals("BANC",result);
    }

    @Test
    public void case2() {
        String result = solution.minWindow("a","a");
        Assert.assertEquals("a",result);
    }

    @Test
    public void case3() {
        String result = solution.minWindow("a","b");
        Assert.assertEquals("",result);
    }

    @Test
    public void case4() {
        String result = solution.minWindow("a","aa");
        Assert.assertEquals("",result);
    }

    @Test
    public void case5() {
        String result = solution.minWindow("aa","aa");
        Assert.assertEquals("aa",result);
    }

    @Test
    public void case6() {
        String result = solution.minWindow("ab","a");
        Assert.assertEquals("a",result);
    }

    @Test
    public void case7() {
        String result = solution.minWindow("cabwefgewcwaefgcf","cae");
        Assert.assertEquals("cwae",result);
    }

    @Test
    public void case8() {
        String result = solution.minWindow("bbaa","aba");
        Assert.assertEquals("baa",result);
    }
}
