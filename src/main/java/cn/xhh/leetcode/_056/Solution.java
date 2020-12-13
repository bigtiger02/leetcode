package cn.xhh.leetcode._056;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Merge intervals
 * <a href="https://leetcode-cn.com/problems/merge-intervals/">Merge intervals</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/13
 */
public class Solution {
    public int[][] merge(int[][] intervals) {
        if(null == intervals || intervals.length < 2){
            return intervals;
        }

        Arrays.sort(intervals, (arr1,arr2)->{
            int val = Integer.compare(arr1[0], arr2[0]);
            if(val != 0){
                return val;
            }

            return Integer.compare(arr1[1], arr1[2]);
        });

        List<int[]> list = new ArrayList<>();
        int index = 0, len = intervals.length;
        while(index < len){
            int start = intervals[index][0];
            int end = intervals[index][1];
            int j = index + 1;
            while(j < len && end >= intervals[j][0]){
                end = Math.max(end,intervals[j][1]);
                j++;
            }

            list.add(new int[]{start, end});
            index = j;
        }

        int[][] results = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            results[i] = list.get(i);
        }
        return results;
    }
}
