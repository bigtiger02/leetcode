package cn.xhh.leetcode._015;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Sum3Test
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/15
 */
public class Sum3Test {

    private Solution solution = new Solution();

    private void assertEquals(int[][] expects, List<List<Integer>> result){
        boolean flag = true;
        for (int i = 0; i < expects.length; i++) {
            for (int j = 0; j < expects[i].length; j++) {
                if(expects[i][j] != result.get(i).get(j)){
                    flag = false;
                    break;
                }
            }
            if(!flag){
                break;
            }
        }

        Assert.assertEquals(true, flag);
    }

    @Test
    public void case1(){
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = solution.threeSum(nums);

        int[][] expects = {
            {-1,-1,2},
            {-1,0,1}
        };
        assertEquals(expects, result);
    }

    @Test
    public void case2(){
        int[] nums = {};
        List<List<Integer>> result = solution.threeSum(nums);

        int[][] expects = {};
        assertEquals(expects, result);
    }

    @Test
    public void case3(){
        int[] nums = {1};
        List<List<Integer>> result = solution.threeSum(nums);

        int[][] expects = {};
        assertEquals(expects, result);
    }

    @Test
    public void case4(){
        int[] nums = {1,2};
        List<List<Integer>> result = solution.threeSum(nums);

        int[][] expects = {};
        assertEquals(expects, result);
    }

    @Test
    public void case5(){
        int[] nums = {1,2,3};
        List<List<Integer>> result = solution.threeSum(nums);

        int[][] expects = {};
        assertEquals(expects, result);
    }

    @Test
    public void case6(){
        int[] nums = {1,0,-1};
        List<List<Integer>> result = solution.threeSum(nums);

        int[][] expects = {
                {-1,0,1}
        };
        assertEquals(expects, result);
    }

    @Test
    public void case7(){
        int[] nums = {0,0,0};
        List<List<Integer>> result = solution.threeSum(nums);

        int[][] expects = {
            {0,0,0}
        };
        assertEquals(expects, result);
    }

    @Test
    public void case8(){
        int[] nums = {1,1,0,0,0,-1,-1,2};
        List<List<Integer>> result = solution.threeSum(nums);

        int[][] expects = {
                {-1,-1,2},
                {-1,0,1},
                {0,0,0}
        };
        assertEquals(expects, result);
    }

    @Test
    public void case9(){
        int[] nums = {-2,0,1,1,2};
        List<List<Integer>> result = solution.threeSum(nums);

        int[][] expects = {
            {-2,0,2},
            {-2,1,1}
        };
        assertEquals(expects, result);
    }

    @Test
    public void case10(){
        int[] nums = {-1,0,1,2,-1,-4,-2,-3,3,0,4};
        List<List<Integer>> result = solution.threeSum(nums);

        int[][] expects = {
                {-4,0,4},
                {-4,1,3},
                {-3,-1,4},
                {-3,0,3},
                {-3,1,2},
                {-2,-1,3},
                {-2,0,2},
                {-1,-1,2},
                {-1,0,1}
        };
        assertEquals(expects, result);
    }

    @Test
    public void case11(){
        int[] nums = {-2,-3,0,0,2};
        List<List<Integer>> result = solution.threeSum(nums);

        int[][] expects = {
                {-2,0,2}
        };
        assertEquals(expects, result);
    }
}
