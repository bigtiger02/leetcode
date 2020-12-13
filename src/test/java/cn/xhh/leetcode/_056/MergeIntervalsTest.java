package cn.xhh.leetcode._056;
import org.junit.Assert;
import org.junit.Test;

/**
 * MergeIntervalsTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/13
 */
public class MergeIntervalsTest {
    private Solution solution = new Solution();

    @Test
    public void case1() {
        int[][] results = solution.merge(new int[][]{
                {1,3},{2,6},{8,10},{15,18}
        });

        assertEquals(new int[][]{{1,6},{8,10},{15,18}},results);
    }

    @Test
    public void case2() {
        int[][] results = solution.merge(new int[][]{
                {1,4},{4,5}
        });

        assertEquals(new int[][]{{1,5}},results);
    }

    private void assertEquals(int[][] expects, int[][] results) {
        Assert.assertEquals(expects.length, results.length);
        for (int i = 0; i < expects.length; i++) {
            Assert.assertArrayEquals(expects[i], results[i]);
        }
    }
}
