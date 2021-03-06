package cn.xhh.leetcode._169;

/**
 * Majority element
 * <a href="https://leetcode-cn.com/problems/majority-element/">Majority element</a>
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/29
 */
public class Solution {
    public int majorityElement(int[] nums) {
        int num = nums[0], vote = 0;
        for (int i = 0; i < nums.length; i++) {
            if(vote == 0){
                num = nums[i];
            }
            vote = nums[i] == num ? vote + 1 : vote -1;
        }

        return num;
    }
}
