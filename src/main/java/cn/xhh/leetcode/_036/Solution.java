package cn.xhh.leetcode._036;

import java.util.HashSet;
import java.util.Set;

/**
 * valid sudoku
 * <a href="https://leetcode-cn.com/problems/valid-sudoku/">valid sudoku</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/6
 */
public class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] columns = new HashSet[9];
        Set<Character>[] boxes = new HashSet[9];
        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            columns[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char num = board[i][j];
                if('.' == num){
                    continue;
                }

                int boxIndex = i/3*3+j/3;
                if(rows[i].contains(num)
                        || columns[j].contains(num)
                        || boxes[boxIndex].contains(num)){
                    return false;
                }
                rows[i].add(num);
                columns[j].add(num);
                boxes[boxIndex].add(num);
            }
        }

        return true;
    }
}
