package cn.xhh.leetcode._169;

import org.junit.Assert;
import org.junit.Test;

/**
 * MajorityElementTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/29
 */
public class MajorityElementTest {
    private Solution solution = new Solution();

    @Test
    public void case1(){
        int result = solution.majorityElement(new int[]{3,2,3});
        Assert.assertEquals(3,result);
    }

    @Test
    public void case2(){
        int result = solution.majorityElement(new int[]{2,2,1,1,1,2,2});
        Assert.assertEquals(2,result);
    }

    @Test
    public void case3(){
        int result = solution.majorityElement(new int[]{3,3,4});
        Assert.assertEquals(3,result);
    }
}
