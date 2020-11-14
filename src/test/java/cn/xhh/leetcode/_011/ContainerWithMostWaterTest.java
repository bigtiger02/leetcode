package cn.xhh.leetcode._011;

import org.junit.Assert;
import org.junit.Test;

/**
 * ContainerWithMostWaterTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/14
 */
public class ContainerWithMostWaterTest {
    private Solution solution = new Solution();

    @Test
    public void case1(){
        int result = solution.maxArea(new int[]{1,8,6,2,5,4,8,3,7});
        Assert.assertEquals(49, result);
    }

    @Test
    public void case2(){
        int result = solution.maxArea(new int[]{1,1});
        Assert.assertEquals(1, result);
    }

    @Test
    public void case3(){
        int result = solution.maxArea(new int[]{4,3,2,1,4});
        Assert.assertEquals(16, result);
    }

    @Test
    public void case4(){
        int result = solution.maxArea(new int[]{1,2,1});
        Assert.assertEquals(2, result);
    }

    @Test
    public void case5(){
        int result = solution.maxArea(new int[]{0,1});
        Assert.assertEquals(0, result);
    }
}
