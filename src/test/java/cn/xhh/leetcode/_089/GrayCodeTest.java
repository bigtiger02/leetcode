package cn.xhh.leetcode._089;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * GrayCodeTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/23
 */
public class GrayCodeTest {
    private Solution solution = new Solution();

    @Test
    public void case1(){
        List<Integer> results = solution.grayCode(2);
        Assert.assertArrayEquals(new Integer[]{0,1,3,2}, results.toArray());
    }

    @Test
    public void case2(){
        List<Integer> results = solution.grayCode(0);
        Assert.assertArrayEquals(new Integer[]{0}, results.toArray());
    }
}
