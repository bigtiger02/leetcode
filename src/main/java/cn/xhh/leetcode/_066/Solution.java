package cn.xhh.leetcode._066;

/**
 * Plus one
 * <a href="https://leetcode-cn.com/problems/plus-one/">Plus one</a>
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/4
 */
public class Solution {
    public int[] plusOne(int[] digits) {
        int left = 1;
        for (int i = digits.length-1; i >= 0 ; i--) {
            int sum = left + digits[i];
            digits[i] = sum % 10;
            left = sum / 10;
            if(left == 0){
                break;
            }
        }

        if(left == 0){
            return digits;
        }

        int[] arr = new int[digits.length+1];
        arr[0] = left;
        for (int i = 0; i < digits.length; i++) {
            arr[i+1] = digits[i];
        }

        return arr;
    }

}
