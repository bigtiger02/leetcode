package cn.xhh.leetcode._055;

/**
 * Jump game
 * <a href="https://leetcode-cn.com/problems/jump-game/">Jump game</a>
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/10
 */
public class Solution {
    public boolean canJump(int[] nums) {
        if(null == nums || nums.length == 0){
            return true;
        }

        int rightMost = 0;
        for (int i = 0; i < nums.length; i++) {
            if(i<=rightMost){
                rightMost = Math.max(rightMost, i + nums[i]);
                if(rightMost >= nums.length-1){
                    return true;
                }
            }
        }

        return false;
    }
}
