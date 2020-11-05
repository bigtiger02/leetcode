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

    @Test
    public void case3(){
        int[][] results = solution.insert(new int[][]{{1,2},{3,4}},new int[]{-1,0});
        assertSuccess(new int[][]{{-1,0},{1,2},{3,4}},results);
    }

    @Test
    public void case4(){
        int[][] results = solution.insert(new int[][]{{1,2},{3,4}},new int[]{5,6});
        assertSuccess(new int[][]{{1,2},{3,4},{5,6}},results);
    }

    @Test
    public void case5(){
        int[][] results = solution.insert(new int[][]{{1,2},{5,6}},new int[]{3,4});
        assertSuccess(new int[][]{{1,2},{3,4},{5,6}},results);
    }

    @Test
    public void case6(){
        int[][] results = solution.insert(new int[][]{{1,2},{3,4},{5,6},{7,8}},new int[]{2,4});
        assertSuccess(new int[][]{{1,4},{5,6},{7,8}},results);
    }

    @Test
    public void case7(){
        int[][] results = solution.insert(new int[][]{{1,3},{4,6},{7,9}},new int[]{2,4});
        assertSuccess(new int[][]{{1,6},{7,9}},results);
    }

    @Test
    public void case8(){
        int[][] results = solution.insert(new int[][]{},new int[]{2,4});
        assertSuccess(new int[][]{{2,4}},results);
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
