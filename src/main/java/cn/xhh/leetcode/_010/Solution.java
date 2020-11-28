package cn.xhh.leetcode._010;

/**
 * Regular expression matching
 * <a href="https://leetcode-cn.com/problems/regular-expression-matching/">Regular expression matching</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/27
 */
public class Solution {
    public boolean isMatch(String s, String p) {
        if(null == s || null == p){
            return false;
        }

        int slen = s.length();
        int plen = p.length();

        if(slen == 0 || plen == 0 || '*' == p.charAt(0)){
            return false;
        }

        int i = slen-1, j = plen-1;
        String lastPattern = "";
        while(i >= 0 && j >= 0){
            char c = s.charAt(i);
            char pc = p.charAt(j);
            if(c == pc || '.' == pc){
                lastPattern = s.substring(i,i+1);
                i--;
                j--;
            }else if('*' == pc && j-1 >= 0){
                int end = i+1;
                char pp = p.charAt(j-1);
                while(i >= 0 && (pp == s.charAt(i) || pp == '.')){
                    i--;
                }
                int start = i < 0 ? 0 : i;
                lastPattern = s.substring(start,end);
                j -= 2;
            }else{
                return false;
            }
        }

        //可能为空去掉重复部分
        while(j>=0 && p.charAt(j) == '*'){
            j-=2;
        }
        //表明中间一部分被其他模式吃掉，需要判断剩余模式是否和最后一种模式匹配
        if(j >= 0 && lastPattern != null && lastPattern.length() > 0){
            return isMatch(lastPattern, p.substring(0,j+1));
        }

        return i < 0 && j < 0;
    }
}
