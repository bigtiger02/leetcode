package cn.xhh.leetcode._003;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * LongestSubstringCharactersTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/10/31
 */
public class LongestSubstringCharactersTest {

    private Solution solution = new Solution();


    @Test
    public void case1(){
        String str = "abcabcbb";
        int result = solution.lengthOfLongestSubstring(str);
        assertEquals(3, result);
    }

    @Test
    public void case2(){
        String str = "bbbbb";
        int result = solution.lengthOfLongestSubstring(str);
        assertEquals(1, result);
    }

    @Test
    public void case3(){
        String str = "pwwkew";
        int result = solution.lengthOfLongestSubstring(str);
        assertEquals(3, result);
    }

    @Test
    public void case4(){
        String str = "au";
        int result = solution.lengthOfLongestSubstring(str);
        assertEquals(2, result);
    }

    @Test
    public void case5(){
        String str = "a";
        int result = solution.lengthOfLongestSubstring(str);
        assertEquals(1, result);
    }

    @Test
    public void case6(){
        String str = "anviaj";
        int result = solution.lengthOfLongestSubstring(str);
        assertEquals(5, result);
    }

}
