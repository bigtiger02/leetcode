package cn.xhh.leetcode._057;

import java.util.*;

/**
 * Insert interval
 * <a href="https://leetcode-cn.com/problems/insert-interval/">Insert interval</a>
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/4
 */
public class Solution {

    public int[][] insert(int[][] intervals, int[] newInterval) {
        Stack<Integer> stack = new Stack<>();
        int[][] results = new int[intervals.length+1][2];
        int index = 0;
        for (int i = 0; i < intervals.length; i++) {
            if(stack.isEmpty()){
                if(intervals[i][1] < newInterval[0]){
                    results[index++] = intervals[i];
                } else if(intervals[i][0] <= newInterval[0]){
                    stack.push(intervals[i][0]);
                }else{
                    if(newInterval[1] < intervals[i][0]){

                    }
                    stack.push(newInterval[0]);
                }
            }else {
                if(intervals[i][0] > newInterval[1]){
                    results[index++] = new int[]{stack.pop(), newInterval[1]};
                    results[index++] = intervals[i];
                }else{
                    results[index++] = new int[]{stack.pop(), intervals[i][1]};
                }
            }
        }

        return Arrays.copyOfRange(results, 0 ,index);
    }
}
