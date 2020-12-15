package cn.xhh.leetcode._870;

import org.junit.Assert;
import org.junit.Test;

/**
 * AdvantageShuffleTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/15
 */
public class AdvantageShuffleTest {
    private Solution solution = new Solution();

    @Test
    public void case1() {
        int[] results = solution.advantageCount(new int[]{2,7,11,15}, new int[]{1,10,4,11});
        Assert.assertArrayEquals(new int[]{2,11,7,15}, results);
    }

    @Test
    public void case2() {
        int[] results = solution.advantageCount(new int[]{12,24,8,32}, new int[]{13,25,32,11});
        Assert.assertArrayEquals(new int[]{24,32,8,12}, results);
    }

    @Test
    public void case3() {
        int[] results = solution.advantageCount(new int[]{2,0,4,1,2}, new int[]{1,3,0,0,2});
        Assert.assertArrayEquals(new int[]{2,4,1,2,0}, results);
    }
}
