package cn.xhh.leetcode._046;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * PermutationsTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/19
 */
public class PermutationsTest {
    private Solution solution = new Solution();

    private void assertEquals(int[][] expects, List<List<Integer>> results){
        boolean flag = true;
        for (int i = 0; i < expects.length; i++) {
            for (int j = 0; j < expects[i].length; j++) {
                if(expects[i][j] != results.get(i).get(j)){
                    flag = false;
                    break;
                }
            }
        }

        Assert.assertEquals(true, flag);
    }
    @Test
    public void case1(){
        List<List<Integer>> results = solution.permute(new int[]{1,2,3});
        assertEquals(new int[][]{
            {1,2,3},{1,3,2},{2,1,3},{2,3,1},{3,1,2},{3,2,1}
        }, results);
    }
}
