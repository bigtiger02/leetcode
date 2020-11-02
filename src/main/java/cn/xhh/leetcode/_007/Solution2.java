package cn.xhh.leetcode._007;

/**
 * Reverse Integer
 * <a href="https://leetcode-cn.com/problems/reverse-integer/">Reverse Integer</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/2
 */
public class Solution2 {
    public int reverse(int x) {
        String tmp = String.valueOf(Math.abs(x));
        StringBuilder sb = new StringBuilder();
        for (int i = tmp.length() - 1; i >= 0; i--) {
            if(0 == sb.length() && '0' == tmp.charAt(i)){
                continue;
            }
            sb.append(tmp.charAt(i));
        }

        if(0 == sb.length()){
            return 0;
        }

        int value = 0;
        try{
            value = Integer.valueOf(sb.toString());
        }catch (Exception e){
            value = 0;
        }
        return Integer.signum(x) * value;
    }
}
