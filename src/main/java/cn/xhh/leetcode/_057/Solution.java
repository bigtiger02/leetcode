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
        List<Integer[]> list = new LinkedList<>();
        int t = 0, index = 0;
        while(t < intervals.length * 2){
            int i = t/2,j = t%2;
            //入栈
            if(stack.isEmpty()){
                if(index < 2){
                    if(intervals[i][j] > newInterval[index]){
                        stack.push(newInterval[index++]);
                    }else if(intervals[i][j] < newInterval[index]){
                        stack.push(intervals[i][j]);
                        t++;
                    }else {
                        stack.push(newInterval[index++]);
                        t++;
                    }
                }else{
                    stack.push(intervals[i][j]);
                    t++;
                }
            }else{
                if(index < 2){
                    if(intervals[i][j] < newInterval[index]){
                        list.add(new Integer[]{stack.pop(), newInterval[index++]});
                        t++;
                    }else if(intervals[i][j] > newInterval[index]){
                        list.add(new Integer[]{stack.pop(), intervals[i][j]});
                        t++;
                        index++;
                    }else {
                        t++;
                    }
                }else{
                    if(j == 0){
                        list.add(new Integer[]{stack.pop(), intervals[i][j+1]});
                        t+=2;
                    }else {
                        list.add(new Integer[]{stack.pop(), intervals[i][j]});
                        t++;
                    }
                }
            }
        }
        
        int[][] results = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            Integer[] tmp = list.get(i);
            System.out.println(tmp[0] + "," + tmp[1]);
            results[i][0] = tmp[0];
            results[i][1] = tmp[1];
        }
        return results;
    }
}
