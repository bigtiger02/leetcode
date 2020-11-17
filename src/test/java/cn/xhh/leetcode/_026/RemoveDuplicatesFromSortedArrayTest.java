package cn.xhh.leetcode._026;

import org.junit.Assert;
import org.junit.Test;

/**
 * RemoveDuplicatesFromSortedArrayTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/17
 */
public class RemoveDuplicatesFromSortedArrayTest {
    private Solution solution = new Solution();

    @Test
    public void case1(){
        int result = solution.removeDuplicates(new int[]{1,1,2});
        Assert.assertEquals(2, result);
    }

    @Test
    public void case2(){
        int result = solution.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4});
        Assert.assertEquals(5, result);
    }

    @Test
    public void case3(){
        int result = solution.removeDuplicates(new int[]{0,1,2,3,4});
        Assert.assertEquals(5, result);
    }

    @Test
    public void case4(){
        int result = solution.removeDuplicates(new int[]{});
        Assert.assertEquals(0, result);
    }
}
