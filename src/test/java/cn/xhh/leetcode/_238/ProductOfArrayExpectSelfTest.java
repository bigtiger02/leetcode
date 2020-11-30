package cn.xhh.leetcode._238;

import org.junit.Assert;
import org.junit.Test;

/**
 * ProductOfArrayExpectSelfTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/1
 */
public class ProductOfArrayExpectSelfTest {
    private Solution solution = new Solution();

    @Test
    public void case1(){
        int[] results = solution.productExceptSelf(new int[]{1,2,3,4});
        Assert.assertArrayEquals(new int[]{24,12,8,6}, results);
    }
}
