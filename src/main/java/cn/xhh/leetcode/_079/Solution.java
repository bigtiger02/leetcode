package cn.xhh.leetcode._079;

/**
 * Word search
 * <a href="https://leetcode-cn.com/problems/word-search/">Word search</a>
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/16
 */
public class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length, n = board[0].length;
        boolean[][] visitFlags = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                visitFlags[i][j] = false;
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if(dfs(board,word,0,i,j,visitFlags)){
                    return true;
                }
            }
        }

        return false;
    }

    private static boolean dfs(char[][] board, String word, int wordIndex, int i, int j,
                               boolean[][] visitFlags){
        if (i < 0 || j < 0 || i >= board.length || j >= board[i].length){
            return false;
        }

        if(visitFlags[i][j]){
            return false;
        }

        if(wordIndex == word.length()){
            return true;
        }

        char c = word.charAt(wordIndex);
        if(board[i][j] != c){
            return false;
        }

        visitFlags[i][j] = true;
        if(dfs(board, word, wordIndex+1,i+1, j, visitFlags)
            || dfs(board, word, wordIndex+1,i-1, j, visitFlags)
            || dfs(board, word, wordIndex+1,i, j+1, visitFlags)
            || dfs(board, word, wordIndex+1,i, j-1, visitFlags) ){
            return true;
        }
        visitFlags[i][j] = false;
        return false;
    }
}
