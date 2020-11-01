package cn.xhh.leetcode._005;

/**
 * Longest palindromic substring
 * <a href="https://leetcode-cn.com/problems/longest-palindromic-substring/">Longest palindromic substring</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/10/31
 */
public class Solution2 {

    public String longestPalindrome(String s) {
        if(null == s || s.length() <= 1){
            return s;
        }

        //先判断一下整个字符串，如若为回文则无需再判断
        if(isPalindrome(s, 0 , s.length())){
            return s;
        }

        int fLeft = 0, fRight = 1;
        if(s.charAt(0) == s.charAt(1)){
            int right = 1;
            while( right < s.length() && s.charAt(0) == s.charAt(right)){
                fLeft = 0;
                fRight = right + 1;
                right = right + 1;
            }
        }

        //长度检测
        if(fRight - fLeft == s.length() - 1){
            return s.substring(fLeft, fRight);
        }

        for (int i = 1; i < s.length()-1; i++) {
            //找出潜在中心点
            if(s.charAt(i) != s.charAt(i + 1)
                    && s.charAt(i - 1) != s.charAt(i + 1)){
                continue;
            }

            //由于只需要找出最大长度回文，则可以跳过一些判断
            //以中心点为轴，当前最大长度为臂，计算左右下标
            int left = 0 , right = 0;
            int resultLen = fRight - fLeft;
            boolean allSame = false;
            if(s.charAt(i - 1) == s.charAt(i + 1)){
                // 2, 3 [1,4) 2, 4 [0,6)
                int maxLen = resultLen % 2 == 0 ? resultLen + 1 : resultLen + 2;
                left = Math.max(i - maxLen/2, 0);
                right = Math.min(i + maxLen/2 + 1, s.length());
                allSame = s.charAt(i) == s.charAt(i+1);
            }else if(s.charAt(i) == s.charAt(i + 1)){
                // 2, 3 [1,5) 2, 4 [1,5)
                int maxLen = resultLen % 2 == 0 ? resultLen + 2 : resultLen + 1;
                left = Math.max(i - maxLen/2 + 1, left);
                right = Math.min(i + maxLen/2 + 1, s.length());
            }

            //排除掉一些分支，出现变动一般出现在边界下，表明最多只能向左或向右移动1个位置
            if(right - left < resultLen){
                continue;
            }

            /*
             * 先检查一下字符串有无可能为回文，如若非回文并且为类似 **aaa** 模式，则尝试左右微调整一下
             * 例如 ccbbccccbbaa
             * 看有无可能转换模式匹配，如若不为回文则无需再检测
             */
            if(!isPalindrome(s, left, right)){
                //尝试左右移动
                if(allSame && isPalindrome(s, left, right-1)){
                    right--;
                }else if(allSame && isPalindrome(s, left+1, right)){
                    left++;
                }else{
                    continue;
                }
            }

            //向左右扩散尝试找出最大回文
            while(left >= 0 && right <= s.length()){
                if(s.charAt(left) == s.charAt(right-1)){
                    if(resultLen < right - left){
                        fLeft = left;
                        fRight = right;
                    }
                    allSame = allSame && s.charAt(left) == s.charAt(i);
                    left--;
                    right++;
                }else if(allSame && s.charAt(i) == s.charAt(right-1)){//如果全都一样则尝试改变匹配模式
                    if(resultLen < right - left - 1){
                        fLeft = left + 1;
                        fRight = right;
                    }
                    right++;
                }else if(allSame && s.charAt(left) == s.charAt(i)){//如果全都一样则尝试改变匹配模式
                    if(resultLen < right - left - 1){
                        fLeft = left;
                        fRight = right - 1;
                    }
                    left--;
                }else{
                    break;
                }
            }
        }

        return s.substring(fLeft, fRight);
    }

    private boolean isPalindrome(String s, int left, int right){
        if(right - left == 1){
            return true;
        }

        while(left < right){
            if(s.charAt(left) != s.charAt(right - 1)){
                return false;
            }else{
                left++;
                right--;
            }
        }

        return true;
    }
}
