package cn.xhh.leetcode._870;

import java.util.*;

/**
 * Advantage shuffle
 * <a href="https://leetcode-cn.com/problems/advantage-shuffle/">Advantage shuffle</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/15
 */
public class Solution {
    public int[] advantageCount(int[] A, int[] B) {
        if(null == A || A.length < 2){
            return A;
        }

        TreeMap<Integer,Integer> dataMap = new TreeMap<Integer,Integer>();
        for (int i = 0; i < A.length; i++) {
            Integer count = dataMap.get(A[i]);
            count = count == null ? 1 : count+1;
            dataMap.put(A[i],count);
        }

        int[] results = new int[A.length];
        for (int i = 0; i < B.length; i++) {
            Map.Entry<Integer,Integer> entry = dataMap.higherEntry(B[i]);
            entry = entry == null ? dataMap.firstEntry() : entry;
            if(entry.getValue() > 1){
                dataMap.put(entry.getKey(), entry.getValue()-1);
            }else{
                dataMap.remove(entry.getKey());
            }
            results[i] = entry.getKey();
        }
        return results;
    }
}
