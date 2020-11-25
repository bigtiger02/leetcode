package cn.xhh.leetcode._146;

import org.junit.Assert;
import org.junit.Test;

/**
 * LruCacheTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/25
 */
public class LruCacheTest {

    @Test
    public void case1(){
        LRUCache lruCache = new LRUCache(2);
        lruCache.put(1,1);
        lruCache.put(2,2);
        Assert.assertEquals(1, lruCache.get(1));
        lruCache.put(3,3);
        Assert.assertEquals(-1, lruCache.get(2));
        lruCache.put(4,4);
        Assert.assertEquals(-1, lruCache.get(1));
        Assert.assertEquals(3, lruCache.get(3));
        Assert.assertEquals(4, lruCache.get(4));
    }
}
