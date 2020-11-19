package cn.xhh.leetcode._053;

import org.junit.Assert;
import org.junit.Test;

/**
 * MaximumSubArrayTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/18
 */
public class MaximumSubArrayTest {
    private Solution solution = new Solution();

    @Test
    public void case1(){
        int result = solution.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
        Assert.assertEquals(6, result);
    }

    @Test
    public void case2(){
        int result = solution.maxSubArray(new int[]{1});
        Assert.assertEquals(1, result);
    }

    @Test
    public void case3(){
        int result = solution.maxSubArray(new int[]{1,-5,2});
        Assert.assertEquals(2, result);
    }

    @Test
    public void case4(){
        int result = solution.maxSubArray(new int[]{1,7,-5,2,5});
        Assert.assertEquals(10, result);
    }

}
