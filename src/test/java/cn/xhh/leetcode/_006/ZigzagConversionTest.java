package cn.xhh.leetcode._006;

import org.junit.Assert;
import org.junit.Test;

/**
 * ZigzagConversionTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/2
 */
public class ZigzagConversionTest {

    private Solution solution = new Solution();

    @Test
    public void case1(){
        String s = "LEETCODEISHIRING";
        String result = solution.convert(s, 3);
        Assert.assertEquals("LCIRETOESIIGEDHN", result);
    }

    @Test
    public void case2(){
        String s = "LEETCODEISHIRING";
        String result = solution.convert(s, 4);
        Assert.assertEquals("LDREOEIIECIHNTSG", result);
    }
}
