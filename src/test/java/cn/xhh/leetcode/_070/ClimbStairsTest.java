package cn.xhh.leetcode._070;

import org.junit.Assert;
import org.junit.Test;

/**
 * ClimbStairsTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/20
 */
public class ClimbStairsTest {

    private Solution solution = new Solution();

    @Test
    public void case1(){
        int result = solution.climbStairs(2);
        Assert.assertEquals(2, result);
    }

    @Test
    public void case2(){
        int result = solution.climbStairs(3);
        Assert.assertEquals(3, result);
    }

    @Test
    public void case3(){
        int result = solution.climbStairs(1);
        Assert.assertEquals(1, result);
    }

    @Test
    public void case4(){
        int result = solution.climbStairs(4);
        Assert.assertEquals(5, result);
    }

    @Test
    public void case5(){
        int result = solution.climbStairs(5);
        Assert.assertEquals(8, result);
    }
}
