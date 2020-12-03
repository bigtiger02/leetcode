package cn.xhh.leetcode._013;

import org.junit.Assert;
import org.junit.Test;

/**
 * RomanToIntegerTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/3
 */
public class RomanToIntegerTest {
    private Solution solution = new Solution();

    @Test
    public void case1(){
        int result = solution.romanToInt("III");
        Assert.assertEquals(3,result);
    }

    @Test
    public void case2(){
        int result = solution.romanToInt("IV");
        Assert.assertEquals(4,result);
    }

    @Test
    public void case3(){
        int result = solution.romanToInt("IX");
        Assert.assertEquals(9,result);
    }

    @Test
    public void case4(){
        int result = solution.romanToInt("LVIII");
        Assert.assertEquals(58,result);
    }

    @Test
    public void case5(){
        int result = solution.romanToInt("MCMXCIV");
        Assert.assertEquals(1994,result);
    }

    @Test
    public void case6(){
        int result = solution.romanToInt("MMMXLV");
        Assert.assertEquals(3045,result);
    }
}
