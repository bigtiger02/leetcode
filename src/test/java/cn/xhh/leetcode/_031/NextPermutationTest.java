package cn.xhh.leetcode._031;

import org.junit.Assert;
import org.junit.Test;

/**
 * Next Permutation Test
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/10
 */
public class NextPermutationTest {

    private Solution solution = new Solution();

    @Test
    public void case1(){
        int[] arr = new int[]{1,2,3};
        solution.nextPermutation(arr);
        Assert.assertArrayEquals(new int[]{1,3,2}, arr);
    }

    @Test
    public void case2(){
        int[] arr = new int[]{3,2,1};
        solution.nextPermutation(arr);
        Assert.assertArrayEquals(new int[]{1,2,3}, arr);
    }

    @Test
    public void case3(){
        int[] arr = new int[]{1,1,5};
        solution.nextPermutation(arr);
        Assert.assertArrayEquals(new int[]{1,5,1}, arr);
    }

    @Test
    public void case4(){
        int[] arr = new int[]{};
        solution.nextPermutation(arr);
        Assert.assertArrayEquals(new int[]{}, arr);
    }

    @Test
    public void case5(){
        int[] arr = new int[]{1};
        solution.nextPermutation(arr);
        Assert.assertArrayEquals(new int[]{1}, arr);
    }

    @Test
    public void case6(){
        int[] arr = new int[]{1,1};
        solution.nextPermutation(arr);
        Assert.assertArrayEquals(new int[]{1,1}, arr);
    }

    @Test
    public void case7(){
        int[] arr = new int[]{1,2};
        solution.nextPermutation(arr);
        Assert.assertArrayEquals(new int[]{2,1}, arr);
    }

    @Test
    public void case8(){
        int[] arr = new int[]{2,1};
        solution.nextPermutation(arr);
        Assert.assertArrayEquals(new int[]{1,2}, arr);
    }

    @Test
    public void case9(){
        int[] arr = null;
        solution.nextPermutation(arr);
        Assert.assertArrayEquals(null, arr);
    }

    @Test
    public void case10(){
        int[] arr = new int[]{1,3,3,1};
        solution.nextPermutation(arr);
        Assert.assertArrayEquals(new int[]{3,1,1,3}, arr);
    }

    @Test
    public void case11(){
        int[] arr = new int[]{1,3,2,1};
        solution.nextPermutation(arr);
        Assert.assertArrayEquals(new int[]{2,1,1,3}, arr);
    }

    @Test
    public void case12(){
        int[] arr = new int[]{1,3,1,2};
        solution.nextPermutation(arr);
        Assert.assertArrayEquals(new int[]{1,3,2,1}, arr);
    }

    @Test
    public void case13(){
        int[] arr = new int[]{3,1,2,3};
        solution.nextPermutation(arr);
        Assert.assertArrayEquals(new int[]{3,1,3,2}, arr);
    }

    @Test
    public void case14(){
        int[] arr = new int[]{3,1,2,3,1,2,3};
        solution.nextPermutation(arr);
        Assert.assertArrayEquals(new int[]{3,1,2,3,1,3,2}, arr);
    }

    @Test
    public void case15(){
        int[] arr = new int[]{100,99,98,97,96,95,94,93,92,91,90,89,88,87,86,85,84,83,82,81,80,79,78,77,76,75,74,73,72,71,70,69,68,67,66,65,64,63,62,61,60,59,58,57,56,55,54,53,52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};
        solution.nextPermutation(arr);
        Assert.assertArrayEquals(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100}, arr);
    }
}
