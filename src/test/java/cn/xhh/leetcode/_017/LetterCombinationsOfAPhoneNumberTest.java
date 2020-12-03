package cn.xhh.leetcode._017;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * LetterCombinationsOfAPhoneNumberTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/3
 */
public class LetterCombinationsOfAPhoneNumberTest {
    private Solution solution = new Solution();

    @Test
    public void case1(){
        List<String> results = solution.letterCombinations("23");
        Assert.assertArrayEquals(new String[]{
                "ad","ae","af","bd","be","bf","cd","ce","cf"
        },results.toArray(new String[0]));
    }

    @Test
    public void case2(){
        List<String> results = solution.letterCombinations("7");
        Assert.assertArrayEquals(new String[]{
                "p","q","r","s"
        },results.toArray(new String[0]));
    }
}
