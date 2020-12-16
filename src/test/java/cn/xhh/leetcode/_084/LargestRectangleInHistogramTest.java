package cn.xhh.leetcode._084;

import org.junit.Assert;
import org.junit.Test;

/**
 * LargestRectangleInHistogramTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/16
 */
public class LargestRectangleInHistogramTest {
    private Solution solution = new Solution();

    @Test
    public void case1() {
        int result = solution.largestRectangleArea(new int[]{2,1,5,6,2,3});
        Assert.assertEquals(10, result);
    }

    @Test
    public void case2() {
        int result = solution.largestRectangleArea(new int[]{1,2,3,4,5});
        Assert.assertEquals(9, result);
    }

    @Test
    public void case3() {
        int result = solution.largestRectangleArea(new int[]{5,4,3,2,1});
        Assert.assertEquals(9, result);
    }
}
