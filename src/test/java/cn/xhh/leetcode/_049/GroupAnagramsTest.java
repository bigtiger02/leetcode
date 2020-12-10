package cn.xhh.leetcode._049;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * GroupAnagramsTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/10
 */
public class GroupAnagramsTest {
    private Solution solution = new Solution();

    @Test
    public void case1() {
        List<List<String>> results = solution.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        boolean flag = assertEquals(new String[][]{
                                {"ate","eat","tea"},
                                {"nat","tan"},
                                {"bat"}
                            }, results);
        Assert.assertEquals(true, flag);
    }

    private boolean assertEquals(String[][] arr, List<List<String>> results) {
        if(arr.length != results.size()){
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].length != results.get(i).size()){
                return false;
            }

            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] != results.get(i).get(j)){
                    return false;
                }
            }
        }

        return true;
    }
}
