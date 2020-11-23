package cn.xhh.leetcode._078;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * SubsetsTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/23
 */
public class SubsetsTest {

    private Solution solution = new Solution();

    private void assertEquals(Integer[][] expects, List<List<Integer>> results){
        Assert.assertEquals(expects.length, results.size());

        for (int i = 0; i < expects.length; i++) {
            Assert.assertArrayEquals(expects[i], results.get(i).toArray(new Integer[0]));
        }
    }

    @Test
    public void case1(){
        List<List<Integer>> results = solution.subsets(new int[]{1,2,3});
        Integer[][] expects = {{1,2,3},{1,2},{1,3},{1},{2,3},{2},{3},{}};
        assertEquals(expects, results);
    }

    @Test
    public void case2(){
        List<List<Integer>> results = solution.subsets(new int[]{});
        Integer[][] expects = {{}};
        assertEquals(expects, results);
    }

    @Test
    public void case3(){
        List<List<Integer>> results = solution.subsets(new int[]{1});
        Integer[][] expects = {{1},{}};
        assertEquals(expects, results);
    }
}
