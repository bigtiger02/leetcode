package cn.xhh.leetcode._043;

import java.util.Arrays;

/**
 * Multiply Strings
 * <a href="https://leetcode-cn.com/problems/multiply-strings/">Multiply Strings</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/19
 */
public class Solution {
    public String multiply(String num1, String num2) {
        if("0".equals(num1) || "0".equals(num2)){
            return "0";
        }
        int[] arr = new int[num1.length() + num2.length()];
        Arrays.fill(arr,0);
        for (int i = num1.length()-1; i >= 0; i--) {
            for (int j = num2.length()-1; j >= 0; j--) {
                int tmp = (num1.charAt(i) -'0') * (num2.charAt(j)-'0') + arr[i+j+1];
                arr[i+j+1] = tmp % 10;
                arr[i+j] += tmp / 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        boolean flag = true;
        int i = 0;
        while(i < arr.length){
            if(flag && 0 != arr[i]){
                flag = false;
            }

            if(!flag){
                sb.append(arr[i]);
            }
            i++;
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }
}
