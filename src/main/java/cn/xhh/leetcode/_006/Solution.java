package cn.xhh.leetcode._006;

/**
 * Zigzag Conversion
 * <a href="https://leetcode-cn.com/problems/zigzag-conversion/">Zigzag Conversion</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/2
 */
public class Solution {
    public String convert(String s, int numRows) {
        if(null == s || 0 == numRows){
            return null;
        }

        if(1 == numRows){
            return s;
        }

        StringBuilder[] arr = new StringBuilder[numRows];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new StringBuilder();
        }

        boolean flag = false;
        int currentRow = 0;
        for (int i = 0; i < s.length(); i++) {
            arr[currentRow].append(s.charAt(i));
            if(currentRow + 1 == numRows || currentRow == 0){
                flag = !flag;
            }

            currentRow += flag ? 1: -1;
        }

        StringBuilder sb = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}
