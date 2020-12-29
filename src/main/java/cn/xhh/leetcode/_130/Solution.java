package cn.xhh.leetcode._130;

/**
 * surrounded-regions
 * <a href="https://leetcode-cn.com/problems/surrounded-regions/">surrounded-regions</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/29
 */
public class Solution {
    int horizontal, vertical;

    public void solve(char[][] board) {
        vertical = board.length;
        if(vertical == 0){
            return;
        }

        horizontal = board[0].length;

        //从垂直边开始标记
        for (int i = 0; i < vertical; i++) {
            dfs(board, i, 0);
            dfs(board,i, horizontal-1);
        }

        //从水平边开始标记
        for (int i = 1; i < horizontal-1; i++) {
            dfs(board,0, i);
            dfs(board,vertical-1, i);
        }

        //清除
        for (int i = 0; i < vertical; i++) {
            for (int j = 0; j < horizontal; j++) {
                board[i][j] = board[i][j] == 'A' ? 'O' : 'X';
            }
        }
    }

    private void dfs(char[][] board, int x, int y){
        if(x < 0 || x >= vertical || y < 0 || y >= horizontal){
            return;
        }

        if('X' == board[x][y] || 'A' == board[x][y]){
            return;
        }

        board[x][y] = 'A';
        dfs(board,x+1, y);
        dfs(board,x-1, y);
        dfs(board, x, y+1);
        dfs(board, x, y-1);
    }
}
