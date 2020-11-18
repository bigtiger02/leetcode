package cn.xhh.leetcode._043;

/**
 * Multiply Strings
 * <a href="https://leetcode-cn.com/problems/multiply-strings/">Multiply Strings</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/19
 */
public class Solution1 {
    public String multiply(String num1, String num2) {
        if(num2.length() < num1.length()){
            return multiply(num2, num1);
        }

        if("0".equals(num1) || "0".equals(num2)){
            return "0";
        }

        String result = "0";
        for (int i = num2.length()-1; i >= 0; i--) {
            int c2 = num2.charAt(i) - '0';
            if(c2 == 0){
                continue;
            }

            StringBuilder sb = new StringBuilder();
            int tmp = 0;
            for (int j = num1.length()-1; j >= 0 ; j--) {
                int c1 = num1.charAt(j) - '0';
                int r = c1 * c2 + tmp;
                char c = (char)(r % 10 + '0');
                sb.insert( 0, c);
                tmp = r / 10;
            }

            while(tmp != 0){
                char c = (char)(tmp % 10 + '0');
                sb.insert( 0, c);
                tmp = tmp / 10;
            }

            for (int j = i; j < num2.length()-1; j++) {
                sb.append('0');
            }

            result = sum(result, sb.toString());
        }

        return result;
    }

    private String sum(String num1, String num2){
        if(num1.length() < num2.length()){
            return sum(num2, num1);
        }

        StringBuilder sb = new StringBuilder();
        int tmp = 0;
        for (int i = num1.length()-1; i >= 0; i--) {
            int c1 = num1.charAt(i) - '0';
            int index = num2.length() - num1.length() + i;
            int c2 = index < 0 ? 0 : num2.charAt(index) - '0';
            int result = c1 + c2 + tmp;
            char c = (char)(result % 10 + '0');
            sb.insert( 0, c);
            tmp = result / 10;
        }

        while(tmp != 0){
            char c = (char)(tmp % 10 + '0');
            sb.insert( 0, c);
            tmp = tmp / 10;
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }
}
