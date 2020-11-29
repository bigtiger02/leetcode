package cn.xhh.leetcode._217;

import org.junit.Assert;
import org.junit.Test;

/**
 * ContainsDuplicateTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/29
 */
public class ContainsDuplicateTest {

    private Solution solution = new Solution();

    @Test
    public void case1(){
        boolean result = solution.containsDuplicate(new int[]{1,2,3,1});
        Assert.assertEquals(true, result);
    }

    @Test
    public void case2(){
        boolean result = solution.containsDuplicate(new int[]{1,2,3,4});
        Assert.assertEquals(false, result);
    }

    @Test
    public void case3(){
        boolean result = solution.containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2});
        Assert.assertEquals(true, result);
    }
}
