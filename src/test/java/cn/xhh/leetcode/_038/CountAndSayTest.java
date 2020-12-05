package cn.xhh.leetcode._038;

import org.junit.Assert;
import org.junit.Test;

/**
 * CountAndSayTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/6
 */
public class CountAndSayTest {
    private Solution solution = new Solution();

    @Test
    public void case1() {
        String result = solution.countAndSay(1);
        Assert.assertEquals("1",result);
    }
    @Test
    public void case2() {
        String result = solution.countAndSay(2);
        Assert.assertEquals("11",result);
    }
    @Test
    public void case3() {
        String result = solution.countAndSay(3);
        Assert.assertEquals("21",result);
    }
    @Test
    public void case4() {
        String result = solution.countAndSay(4);
        Assert.assertEquals("1211",result);
    }
}
