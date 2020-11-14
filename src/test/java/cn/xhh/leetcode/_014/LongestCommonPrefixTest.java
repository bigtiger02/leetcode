package cn.xhh.leetcode._014;

import org.junit.Assert;
import org.junit.Test;

/**
 * LongestCommonPrefixTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/14
 */
public class LongestCommonPrefixTest {

    private Solution solution = new Solution();

    @Test
    public void case1(){
        String[] arr = {"flower","flow","flight"};
        String result = solution.longestCommonPrefix(arr);
        Assert.assertEquals("fl", result);
    }

    @Test
    public void case2(){
        String[] arr = {"dog","racecar","car"};
        String result = solution.longestCommonPrefix(arr);
        Assert.assertEquals("", result);
    }

    @Test
    public void case3(){
        String[] arr = {};
        String result = solution.longestCommonPrefix(arr);
        Assert.assertEquals("", result);
    }

    @Test
    public void case4(){
        String[] arr = {"dog"};
        String result = solution.longestCommonPrefix(arr);
        Assert.assertEquals("dog", result);
    }

    @Test
    public void case5(){
        String[] arr = {"a","aa"};
        String result = solution.longestCommonPrefix(arr);
        Assert.assertEquals("a", result);
    }

    @Test
    public void case6(){
        String[] arr = {"a","aa","d"};
        String result = solution.longestCommonPrefix(arr);
        Assert.assertEquals("", result);
    }
}
