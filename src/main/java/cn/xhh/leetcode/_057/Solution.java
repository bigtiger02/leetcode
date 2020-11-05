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
        int left = newInterval[0], right = newInterval[1];
        boolean notUsedFlag = true;
        int[][] results = new int[intervals.length+1][2];
        int index = 0;
        for (int i = 0; i < intervals.length; i++) {
            if(intervals[i][0] > right){
                if(notUsedFlag){
                    results[index++] = new int[]{left, right};
                    notUsedFlag = false;
                }
                results[index++] = intervals[i];
            }else if(intervals[i][1] < left){
                results[index++] = intervals[i];
            }else{
                left = Math.min(left, intervals[i][0]);
                right = Math.max(right, intervals[i][1]);
            }
        }

        if(notUsedFlag){
            results[index++] = new int[]{left, right};
        }
        return Arrays.copyOfRange(results,0,index);
    }

}
