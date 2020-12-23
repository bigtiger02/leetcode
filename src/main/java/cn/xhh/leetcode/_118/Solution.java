package cn.xhh.leetcode._118;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * pascals-triangle
 * <a href="https://leetcode-cn.com/problems/pascals-triangle/">pascals-triangle</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/24
 */
public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> results = new ArrayList<>();
        if(numRows == 0){
            return results;
        }

        int row = 1;
        while(row <= numRows){
            List<Integer> arr = new ArrayList<>();
            for (int i = 0; i < row; i++) {
                if(i == 0 || i == row-1){
                    arr.add(1);
                }else{
                    int pre1 = results.get(row-2).get(i-1);
                    int pre2 = results.get(row-2).get(i);
                    arr.add(i,pre1 + pre2);
                }
            }

            results.add(arr);
            row++;
        }

        return results;
    }

    public static void main(String[] args) {
        new Solution().generate(5);
    }
}
