package cn.xhh.leetcode._016;

import org.junit.Assert;
import org.junit.Test;

/**
 * Sum3ClosestTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/16
 */
public class Sum3ClosestTest {

    private Solution solution = new Solution();

    @Test
    public void case1(){
        int[] nums = {-1,2,1,-4};
        int result = solution.threeSumClosest(nums, 1);
        Assert.assertEquals(2, result);
    }

    @Test
    public void case2(){
        int[] nums = {-1,0,1};
        int result = solution.threeSumClosest(nums, 1);
        Assert.assertEquals(0, result);
    }

    @Test
    public void case4(){
        int[] nums = {-2,0,1};
        int result = solution.threeSumClosest(nums, -1);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void case5(){
        int[] nums = {-2,0,1,3,4,5};
        int result = solution.threeSumClosest(nums, 3);
        Assert.assertEquals(3, result);
    }

    @Test
    public void case6(){
        int[] nums = {0,1,2};
        int result = solution.threeSumClosest(nums, 0);
        Assert.assertEquals(3, result);
    }

    @Test
    public void case7(){
        int[] nums = {-1,0,1,1,55};
        int result = solution.threeSumClosest(nums, 3);
        Assert.assertEquals(2, result);
    }
}
