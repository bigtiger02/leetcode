package cn.xhh.leetcode._292;

/**
 * nim game
 * <a href="https://leetcode-cn.com/problems/nim-game/">nim game</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/1
 */
public class Solution {
    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }
}
