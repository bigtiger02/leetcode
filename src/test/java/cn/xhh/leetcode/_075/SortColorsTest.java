package cn.xhh.leetcode._075;

import org.junit.Assert;
import org.junit.Test;

/**
 * SortColorsTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/15
 */
public class SortColorsTest {
    private Solution solution = new Solution();

    @Test
    public void case1() {
        int[] nums = {2,0,1};
        solution.sortColors(nums);
        Assert.assertArrayEquals(new int[]{0,1,2},nums);
    }
}
