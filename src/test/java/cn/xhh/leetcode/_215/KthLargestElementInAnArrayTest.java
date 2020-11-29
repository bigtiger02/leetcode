package cn.xhh.leetcode._215;

import org.junit.Assert;
import org.junit.Test;

/**
 * KthLargestElementInAnArrayTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/29
 */
public class KthLargestElementInAnArrayTest {
    private Solution solution = new Solution();

    @Test
    public void case1(){
        int result = solution.findKthLargest(new int[]{3,2,1,5,6,4},2);
        Assert.assertEquals(5, result);
    }

    @Test
    public void case2(){
        int result = solution.findKthLargest(new int[]{3,2,3,1,2,4,5,5,6},4);
        Assert.assertEquals(4, result);
    }
}
