package cn.xhh.leetcode._005;

import org.junit.Assert;
import org.junit.Test;

/**
 * LongestPalidromeTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/10/31
 */
public class LongestPalindromeTest2 {

    private Solution2 solution = new Solution2();

    @Test
    public void case1(){
        String str = "babad";
        String result = solution.longestPalindrome(str);
        Assert.assertEquals("bab", result);
    }

    @Test
    public void case2(){
        String str = "cbbd";
        String result = solution.longestPalindrome(str);
        Assert.assertEquals("bb", result);
    }

    @Test
    public void case3(){
        String str = "a";
        String result = solution.longestPalindrome(str);
        Assert.assertEquals("a", result);
    }

    @Test
    public void case4(){
        String str = "aba";
        String result = solution.longestPalindrome(str);
        Assert.assertEquals("aba", result);
    }

    @Test
    public void case5(){
        String str = "abcd";
        String result = solution.longestPalindrome(str);
        Assert.assertEquals("a", result);
    }

    @Test
    public void case6(){
        String str = "bb";
        String result = solution.longestPalindrome(str);
        Assert.assertEquals("bb", result);
    }


    @Test
    public void case7(){
        String str = "aaaa";
        String result = solution.longestPalindrome(str);
        Assert.assertEquals("aaaa", result);
    }

    @Test
    public void case8(){
        String str = "ccc";
        String result = solution.longestPalindrome(str);
        Assert.assertEquals("ccc", result);
    }

    @Test
    public void case9(){
        String str = "accc";
        String result = solution.longestPalindrome(str);
        Assert.assertEquals("ccc", result);
    }

    @Test
    public void case10(){
        String str = "aacabdkacaa";
        String result = solution.longestPalindrome(str);
        Assert.assertEquals("aca", result);
    }

    @Test
    public void case11(){
        String str = "azwdzwmwcqzgcobeeiphemqbjtxzwkhiqpbrprocbppbxrnsxnwgikiaqutwpftbiinlnpyqstkiqzbggcsdzzjbrkfmhgtnbujzszxsycmvipjtktpebaafycngqasbbhxaeawwmkjcziybxowkaibqnndcjbsoehtamhspnidjylyisiaewmypfyiqtwlmejkpzlieolfdjnxntonnzfgcqlcfpoxcwqctalwrgwhvqvtrpwemxhirpgizjffqgntsmvzldpjfijdncexbwtxnmbnoykxshkqbounzrewkpqjxocvaufnhunsmsazgibxedtopnccriwcfzeomsrrangufkjfzipkmwfbmkarnyyrgdsooosgqlkzvorrrsaveuoxjeajvbdpgxlcrtqomliphnlehgrzgwujogxteyulphhuhwyoyvcxqatfkboahfqhjgujcaapoyqtsdqfwnijlkknuralezqmcryvkankszmzpgqutojoyzsnyfwsyeqqzrlhzbc";
        String result = solution.longestPalindrome(str);
        Assert.assertEquals("sooos", result);
    }

    @Test
    public void case12(){
        String str = "bppbsooosdsdas";
        String result = solution.longestPalindrome(str);
        Assert.assertEquals("sooos", result);
    }

    @Test
    public void case13(){
        String str = "ccd";
        String result = solution.longestPalindrome(str);
        Assert.assertEquals("cc", result);
    }

    @Test
    public void case14(){
        String str = "aaaabbbbbbbbbbccccccccccddddddddddeeeeeeeeeeffffffffffgggggggggghhhhhhhhhhiiiiiiiiiijjjjjjjjjjkkkkkkkkkkllllllllllmmmmmmmmmmnnnnnnnnnnooooooooooppppppppppqqqqqqqqqqrrrrrrrrrrssssssssssttttttttttuuuuuuuuuuvvvvvvvvvvwwwwwwwwwwxxxxxxxxxxyyyyyyyyyyzzzzzzzzzzyyyyyyyyyyxxxxxxxxxxwwwwwwwwwwvvvvvvvvvvuuuuuuuuuuttttttttttssssssssssrrrrrrrrrrqqqqqqqqqqppppppppppoooooooooonnnnnnnnnnmmmmmmmmmmllllllllllkkkkkkkkkkjjjjjjjjjjiiiiiiiiiihhhhhhhhhhggggggggggffffffffffeeeeeeeeeeddddddddddccccccccccbbbbbbbbbbaaaaaaaabbbbbbbbbbccccccccccddddddddddeeeeeeeeeeffffffffffgggggggggghhhhhhhhhhiiiiiiiiiijjjjjjjjjjkkkkkkkkkkllllllllllmmmmmmmmmmnnnnnnnnnnooooooooooppppppppppqqqqqqqqqqrrrrrrrrrrssssssssssttttttttttuuuuuuuuuuvvvvvvvvvvwwwwwwwwwwxxxxxxxxxxyyyyyyyyyyzzzzzzzzzzyyyyyyyyyyxxxxxxxxxxwwwwwwwwwwvvvvvvvvvvuuuuuuuuuuttttttttttssssssssssrrrrrrrrrrqqqqqqqqqqppppppppppoooooooooonnnnnnnnnnmmmmmmmmmmllllllllllkkkkkkkkkkjjjjjjjjjjiiiiiiiiiihhhhhhhhhhggggggggggffffffffffeeeeeeeeeeddddddddddccccccccccbbbbbbbbbbaaaa";
        String result = solution.longestPalindrome(str);
        Assert.assertEquals("aaaabbbbbbbbbbccccccccccddddddddddeeeeeeeeeeffffffffffgggggggggghhhhhhhhhhiiiiiiiiiijjjjjjjjjjkkkkkkkkkkllllllllllmmmmmmmmmmnnnnnnnnnnooooooooooppppppppppqqqqqqqqqqrrrrrrrrrrssssssssssttttttttttuuuuuuuuuuvvvvvvvvvvwwwwwwwwwwxxxxxxxxxxyyyyyyyyyyzzzzzzzzzzyyyyyyyyyyxxxxxxxxxxwwwwwwwwwwvvvvvvvvvvuuuuuuuuuuttttttttttssssssssssrrrrrrrrrrqqqqqqqqqqppppppppppoooooooooonnnnnnnnnnmmmmmmmmmmllllllllllkkkkkkkkkkjjjjjjjjjjiiiiiiiiiihhhhhhhhhhggggggggggffffffffffeeeeeeeeeeddddddddddccccccccccbbbbbbbbbbaaaaaaaabbbbbbbbbbccccccccccddddddddddeeeeeeeeeeffffffffffgggggggggghhhhhhhhhhiiiiiiiiiijjjjjjjjjjkkkkkkkkkkllllllllllmmmmmmmmmmnnnnnnnnnnooooooooooppppppppppqqqqqqqqqqrrrrrrrrrrssssssssssttttttttttuuuuuuuuuuvvvvvvvvvvwwwwwwwwwwxxxxxxxxxxyyyyyyyyyyzzzzzzzzzzyyyyyyyyyyxxxxxxxxxxwwwwwwwwwwvvvvvvvvvvuuuuuuuuuuttttttttttssssssssssrrrrrrrrrrqqqqqqqqqqppppppppppoooooooooonnnnnnnnnnmmmmmmmmmmllllllllllkkkkkkkkkkjjjjjjjjjjiiiiiiiiiihhhhhhhhhhggggggggggffffffffffeeeeeeeeeeddddddddddccccccccccbbbbbbbbbbaaaa", result);
    }

    @Test
    public void case15(){
        String str = "aabbccccbbaa";
        String result = solution.longestPalindrome(str);
        Assert.assertEquals("aabbccccbbaa", result);
    }

    @Test
    public void case16(){
        String str = "ccbbccccbbaa";
        String result = solution.longestPalindrome(str);
        Assert.assertEquals("bbccccbb", result);
    }

    @Test
    public void case17(){
        String str = "ccbbccccccccbbaa";
        String result = solution.longestPalindrome(str);
        Assert.assertEquals("bbccccccccbb", result);
    }

    @Test
    public void case18(){
        String str = "xaabacxcabaaxcabaax";
        String result = solution.longestPalindrome(str);
        Assert.assertEquals("xaabacxcabaax", result);
    }

    @Test
    public void case19(){
        String str = "aaaabaaa";
        String result = solution.longestPalindrome(str);
        Assert.assertEquals("aaabaaa", result);
    }

    @Test
    public void case20(){
        String str = "ffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggg";
        String result = solution.longestPalindrome(str);
        Assert.assertEquals("ffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff", result);
    }
}
