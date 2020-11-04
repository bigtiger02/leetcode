package cn.xhh.leetcode._057;

import org.junit.Assert;
import org.junit.Test;

/**
 * InsertIntervalTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/4
 */
public class InsertIntervalTest {

    private Solution solution = new Solution();

    @Test
    public void case1(){
        int[][] results = solution.insert(new int[][]{{1,3},{6,9}},new int[]{2,5});
        assertSuccess(new int[][]{{1,5},{6,9}},results);
    }

    @Test
    public void case2(){
        int[][] results = solution.insert(new int[][]{{1,2},{3,5},{6,7},{8,10},{12,16}},new int[]{4,8});
        assertSuccess(new int[][]{{1,2},{3,10},{12,16}},results);
    }

    private void assertSuccess(int[][] expects, int[][] results){
        boolean flag = true;
        for (int i = 0; i < expects.length; i++) {
            for (int j = 0; j < expects[i].length; j++) {
                if(expects[i][j] != results[i][j]){
                    flag = false;
                    break;
                }
            }
        }
        Assert.assertTrue(flag);
    }
}
