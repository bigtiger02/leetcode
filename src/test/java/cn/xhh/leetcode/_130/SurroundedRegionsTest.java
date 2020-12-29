package cn.xhh.leetcode._130;

import org.junit.Test;

/**
 * SurroundedRegionsTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/29
 */
public class SurroundedRegionsTest {
    private final Solution solution = new Solution();

    @Test
    public void case1() {
        char[][] board = new char[][]{
                {'X','X','X','X'},
                {'X','O','O','X'},
                {'X','X','O','X'},
                {'X','O','X','X'}
        };
        solution.solve(board);
        System.out.println(board);
    }
}
