package cn.xhh.leetcode._941;

import org.junit.Assert;
import org.junit.Test;

/**
 * ValidMountainArrayTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/3
 */
public class ValidMountainArrayTest {
    private Solution solution = new Solution();

    @Test
    public void case1(){
        boolean result = solution.validMountainArray(new int[]{2,1});
        Assert.assertEquals(false,result);
    }

    @Test
    public void case2(){
        boolean result = solution.validMountainArray(new int[]{3,5,5});
        Assert.assertEquals(false,result);
    }

    @Test
    public void case3(){
        boolean result = solution.validMountainArray(new int[]{0,3,2,1});
        Assert.assertEquals(true,result);
    }

    @Test
    public void case4(){
        boolean result = solution.validMountainArray(new int[]{0,3,3,1});
        Assert.assertEquals(false,result);
    }

    @Test
    public void case5(){
        boolean result = solution.validMountainArray(new int[]{0,3,2,3,1});
        Assert.assertEquals(false,result);
    }

    @Test
    public void case6(){
        boolean result = solution.validMountainArray(new int[]{0,1,2,3,4});
        Assert.assertEquals(false,result);
    }

    @Test
    public void case7(){
        boolean result = solution.validMountainArray(new int[]{0,1,2,3,4,5,6,7,8,9});
        Assert.assertEquals(false,result);
    }

    @Test
    public void case8(){
        boolean result = solution.validMountainArray(new int[]{4,3,2,1});
        Assert.assertEquals(false,result);
    }
}
