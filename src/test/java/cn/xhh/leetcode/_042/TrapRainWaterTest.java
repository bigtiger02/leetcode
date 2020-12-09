package cn.xhh.leetcode._042;

import org.junit.Assert;
import org.junit.Test;

/**
 * Solution
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/8
 */
public class TrapRainWaterTest {
    private Solution solution = new Solution();

    @Test
    public void case1() {
        int result = solution.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1});
        Assert.assertEquals(6, result);
    }

    @Test
    public void case2() {
        int result = solution.trap(new int[]{4,2,0,3,2,5});
        Assert.assertEquals(9, result);
    }
}
