package cn.xhh.leetcode._089;

import java.util.ArrayList;
import java.util.List;

/**
 * Gray code
 * <a href="https://leetcode-cn.com/problems/gray-code/">Gray Code</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/23
 */
public class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> results = new ArrayList<>();
        results.add(0);

        for (int i = 0; i < n; i++) {
            int len = 1 << i;
            for (int j = len-1; j >= 0; j--) {
                int num = results.get(j) ^ len;
                results.add(num);
            }
        }

        return results;
    }
}
