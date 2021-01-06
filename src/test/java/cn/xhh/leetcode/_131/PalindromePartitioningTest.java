package cn.xhh.leetcode._131;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * PalindromePartitioningTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2021/1/6
 */
public class PalindromePartitioningTest {

    private final Solution solution = new Solution();

    private void assertEquals(String[][] expects, List<List<String>> results){
        Assert.assertEquals(expects.length,results.size());
        for (int i = 0; i < expects.length; i++) {
            Assert.assertEquals(expects[i].length, results.get(i).size());
            Assert.assertArrayEquals(expects[i],results.get(i).toArray(new String[0]));
        }
    }

    @Test
    public void case1() {
        List<List<String>> results = solution.partition("aab");
        assertEquals(new String[][]{
                {"a","a","b"},
                {"aa","b"}
        },results);
    }
}
