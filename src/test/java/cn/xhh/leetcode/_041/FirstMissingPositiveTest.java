package cn.xhh.leetcode._041;

import org.junit.Assert;
import org.junit.Test;

/**
 * FirstMissingPositiveTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/6
 */
public class FirstMissingPositiveTest {
    private Solution solution = new Solution();

    @Test
    public void case1() {
        int result = solution.firstMissingPositive(new int[]{1,2,0});
        Assert.assertEquals(3, result);
    }

    @Test
    public void case2() {
        int result = solution.firstMissingPositive(new int[]{3,4,-1,1});
        Assert.assertEquals(2, result);
    }

    @Test
    public void case3() {
        int result = solution.firstMissingPositive(new int[]{7,8,9,11,12});
        Assert.assertEquals(1, result);
    }
}
