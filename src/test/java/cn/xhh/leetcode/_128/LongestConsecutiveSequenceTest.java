package cn.xhh.leetcode._128;

import org.junit.Assert;
import org.junit.Test;

/**
 * LongestConsecutiveSequenceTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/27
 */
public class LongestConsecutiveSequenceTest {
    private final Solution solution = new Solution();

    @Test
    public void case1() {
        int result = solution.longestConsecutive(new int[]{100,4,200,1,3,2});
        Assert.assertEquals(4, result);
    }

    @Test
    public void case2() {
        int result = solution.longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1});
        Assert.assertEquals(9, result);
    }
}
