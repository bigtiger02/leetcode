package cn.xhh.leetcode._013;

import java.util.HashMap;
import java.util.Map;

/**
 * Roman to integer
 * <a href="https://leetcode-cn.com/problems/roman-to-integer/">Roman to integer</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/3
 */
public class Solution {

    private static final Map<String,Integer> romanNumbers = new HashMap<>();
    static{
        romanNumbers.put("I",1);
        romanNumbers.put("II",2);
        romanNumbers.put("IV",4);
        romanNumbers.put("V",5);
        romanNumbers.put("IX",9);
        romanNumbers.put("X",10);
        romanNumbers.put("XL",10);
        romanNumbers.put("L",50);
        romanNumbers.put("XC",90);
        romanNumbers.put("C",100);
        romanNumbers.put("CD",400);
        romanNumbers.put("D",500);
        romanNumbers.put("CM",900);
        romanNumbers.put("M",1000);
    }

    public int romanToInt(String s) {
        if(null == s || "".equals(s)){
            return 0;
        }

        int len = s.length();
        int end = len, sum = 0;
        while(end >= 0){
            int start = end-2 >= 0 ? end-2 : 0;
            Integer num = romanNumbers.get(s.substring(start, end));
            if(null == num){
                start = end-1 >= 0 ? end-1 : 0;
                num = romanNumbers.get(s.substring(start,end));
                end--;
            }else{
                end-=2;
            }

            num = null == num ? 0 : num;
            sum += num;
        }

        return sum;
    }
}
