package cn.xhh.leetcode._036;

import org.junit.Assert;
import org.junit.Test;

/**
 * ValidSukoduTest
 *
 * @author <a href='mailto:bigtiger02@gmail.com'>xhh</a>
 * @date 2020/12/6
 */
public class ValidSudokuTest {

    private Solution solution = new Solution();

    @Test
    public void case1() {
        boolean result = solution.isValidSudoku(new char[][]{
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        });
        Assert.assertEquals(true, result);
    }


    @Test
    public void case2() {
        boolean result = solution.isValidSudoku(new char[][]{
                {'8','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        });
        Assert.assertEquals(false, result);
    }
}
