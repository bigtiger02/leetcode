package cn.xhh.leetcode._135;

import cn.xhh.leetcode._136.Solution;
import org.junit.Assert;
import org.junit.Test;

/**
 * SingleNumberTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/25
 */
public class SingleNumberTest {
    private Solution solution = new Solution();

    @Test
    public void case1(){
        int result = solution.singleNumber(new int[]{2,2,1});
        Assert.assertEquals(1,result);
    }

    @Test
    public void case2(){
        int result = solution.singleNumber(new int[]{4,1,2,1,2});
        Assert.assertEquals(4,result);
    }
}
