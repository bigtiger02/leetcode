package cn.xhh.leetcode._146;

import java.util.*;

/**
 * Lru Cache
 * <a href="https://leetcode-cn.com/problems/lru-cache/">Lru Cache</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/25
 */
public class LRUCache {
    private final int capacity;
    private final Map<Integer, Integer> data;
    private final  LinkedList<Integer> keys;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        data = new HashMap<>(capacity);
        keys = new LinkedList<>();
    }

    public int get(int key) {
        Integer result = data.get(key);
        if(null == result){
            return -1;
        }

        keys.removeFirstOccurrence(key);
        keys.add(key);
        return result;
    }

    public void put(int key, int value) {
        if(keys.contains(key)){
            data.put(key,value);
            keys.removeFirstOccurrence(key);
            keys.add(key);
            return;
        }

        if(keys.size() >= capacity){
            Integer removeKey = keys.pollFirst();
            data.remove(removeKey);
        }

        data.put(key, value);
        keys.add(key);
    }
}
