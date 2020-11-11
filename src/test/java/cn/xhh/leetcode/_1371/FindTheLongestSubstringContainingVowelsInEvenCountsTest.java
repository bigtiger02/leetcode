package cn.xhh.leetcode._1371;

import org.junit.Assert;
import org.junit.Test;

/**
 * FindTheLongestSubstringContainingVowelsInEvenCounts
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/11
 */
public class FindTheLongestSubstringContainingVowelsInEvenCountsTest {

    private Solution solution = new Solution();

    @Test
    public void case1(){
        String s = "eleetminicoworoep";
        int result = solution.findTheLongestSubstring(s);
        Assert.assertEquals(13, result);
    }

    @Test
    public void case2(){
        String s = "leetcodeisgreat";
        int result = solution.findTheLongestSubstring(s);
        Assert.assertEquals(5, result);
    }

    @Test
    public void case3(){
        String s = "bcbcbc";
        int result = solution.findTheLongestSubstring(s);
        Assert.assertEquals(6, result);
    }

    @Test
    public void case4(){
        String s = "";
        int result = solution.findTheLongestSubstring(s);
        Assert.assertEquals(0, result);
    }

    @Test
    public void case5(){
        String s = "ab";
        int result = solution.findTheLongestSubstring(s);
        Assert.assertEquals(1, result);
    }

    @Test
    public void case6(){
        String s = "aa";
        int result = solution.findTheLongestSubstring(s);
        Assert.assertEquals(2, result);
    }

    @Test
    public void case7(){
        String s = "aaa";
        int result = solution.findTheLongestSubstring(s);
        Assert.assertEquals(2, result);
    }

    @Test
    public void case8(){
        String s = "bbb";
        int result = solution.findTheLongestSubstring(s);
        Assert.assertEquals(3, result);
    }

    @Test
    public void case9(){
        String s = "a";
        int result = solution.findTheLongestSubstring(s);
        Assert.assertEquals(0, result);
    }

    @Test
    public void case10(){
        String s = "janrudfu";
        int result = solution.findTheLongestSubstring(s);
        Assert.assertEquals(6, result);
    }
}
