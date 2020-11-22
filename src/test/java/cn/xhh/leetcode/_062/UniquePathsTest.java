package cn.xhh.leetcode._062;

import org.junit.Assert;
import org.junit.Test;

/**
 * UniquePathsTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/22
 */
public class UniquePathsTest {

    private Solution solution = new Solution();

    @Test
    public void case1(){
        int result = solution.uniquePaths(3,2);
        Assert.assertEquals(3, result);
    }

    @Test
    public void case2(){
        int result = solution.uniquePaths(7,3);
        Assert.assertEquals(28, result);
    }

    @Test
    public void case3(){
        int result = solution.uniquePaths(1,0);
        Assert.assertEquals(0, result);
    }

    @Test
    public void case4(){
        int result = solution.uniquePaths(1,1);
        Assert.assertEquals(1, result);
    }

    @Test
    public void case5(){
        int result = solution.uniquePaths(1,2);
        Assert.assertEquals(1, result);
    }
}
