package cn.xhh.leetcode._033;

import org.junit.Assert;
import org.junit.Test;

/**
 * SearchInRotatedSortedArrayTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/18
 */
public class SearchInRotatedSortedArrayTest {
    private Solution solution = new Solution();

    @Test
    public void case1(){
        int result = solution.search(new int[]{4,5,6,7,0,1,2}, 0);
        Assert.assertEquals(4, result);
    }

    @Test
    public void case2(){
        int result = solution.search(new int[]{4,5,6,7,0,1,2}, 3);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void case3(){
        int result = solution.search(new int[]{1}, 0);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void case4(){
        int result = solution.search(new int[]{4,5,6,7,0,1}, 3);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void case5(){
        int result = solution.search(new int[]{4,5,6,7,0,1}, 3);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void case6(){
        int result = solution.search(new int[]{6,7,0,1,4,5}, 3);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void case7(){
        int result = solution.search(new int[]{3,2}, 0);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void case8(){
        int result = solution.search(new int[]{3,2,1}, 0);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void case9(){
        int result = solution.search(new int[]{3,5,1}, 5);
        Assert.assertEquals(1, result);
    }
}
