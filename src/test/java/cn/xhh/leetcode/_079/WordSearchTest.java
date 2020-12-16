package cn.xhh.leetcode._079;

import org.junit.Assert;
import org.junit.Test;

/**
 * WordSearchTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/16
 */
public class WordSearchTest {
    private Solution solution = new Solution();

    @Test
    public void case1() {
        boolean result = solution.exist(new char[][]{
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        },"ABCCED");
        Assert.assertEquals(true, result);
    }

    @Test
    public void case2() {
        boolean result = solution.exist(new char[][]{
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        },"SEE");
        Assert.assertEquals(true, result);
    }

    @Test
    public void case3() {
        boolean result = solution.exist(new char[][]{
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        },"ABCB");
        Assert.assertEquals(false, result);
    }

    @Test
    public void case4() {
        boolean result = solution.exist(new char[][]{
                {'b','a','a','b','a','b'},
                {'a','b','a','a','a','a'},
                {'a','b','a','a','a','b'},
                {'a','b','a','b','b','a'},
                {'a','a','b','b','a','b'},
                {'a','a','b','b','b','a'},
                {'a','a','b','a','a','b'}
        },"aabbbbabbaababaaaabababbaaba");
        Assert.assertEquals(true, result);
    }
}
