package cn.xhh.leetcode._055;

import org.junit.Assert;
import org.junit.Test;

/**
 * JumpGameTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/10
 */
public class JumpGameTest {
    private Solution solution = new Solution();

    @Test
    public void case1() {
        boolean result = solution.canJump(new int[]{2,3,1,1,4});
        Assert.assertEquals(true, result);
    }

    @Test
    public void case2() {
        boolean result = solution.canJump(new int[]{3,2,1,0,4});
        Assert.assertEquals(false, result);
    }
}
