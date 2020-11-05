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
        int left = 0, right = intervals.length - 1;

        while(left <= right){
            if(intervals[left][1] < newInterval[0]){
                left++;
            }else if(intervals[right][0] > newInterval[1]){
                right--;
            }else{
                break;
            }
        }

        //完全在左边
        int[][] results = new int[intervals.length - right + left][2];
        int index = 0;
        if(-1 == right){
            results[index++] = newInterval;
            for (int i = 0; i < intervals.length; i++) {
                results[index++] = intervals[i];
            }
            return results;
        }

        //完全在最右边
        if(intervals.length == left){
            for (int i = 0; i < intervals.length; i++) {
                results[index++] = intervals[i];
            }
            results[index++] = newInterval;
            return results;
        }

        //合并数组,左右指针距离即为减少的数组长度
        for (int i = 0; i < left; i++) {
            results[index++] = intervals[i];
        }
        int leftValue = Math.min(intervals[left][0], newInterval[0]);
        int rightValue = Math.max(intervals[right][1], newInterval[1]);
        results[index++] = new int[]{leftValue, rightValue};
        for (int i = right+1; i < intervals.length; i++) {
            results[index++] = intervals[i];
        }

        return results;
    }

}
