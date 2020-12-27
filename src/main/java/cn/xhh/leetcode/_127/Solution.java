package cn.xhh.leetcode._127;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * word ladder
 * <a href="https://leetcode-cn.com/problems/word-ladder/>word ladder</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/27
 */
public class Solution {

    private Set<String> words = new HashSet<>();
    private Set<String> visited = new HashSet<>();
    private Set<String> beginVisited = new HashSet<>();
    private Set<String> endVisited = new HashSet<>();

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(null == wordList || wordList.isEmpty()){
            return 0;
        }

        if(!wordList.contains(endWord)){
            return 0;
        }

        for (String word : wordList) {
            words.add(word);
        }

        beginVisited.add(beginWord);
        endVisited.add(endWord);

        int step = 1;
        while(!beginVisited.isEmpty() && !endVisited.isEmpty()){
            if(beginVisited.size() < endVisited.size()){
                Set<String> tmp = endVisited;
                endVisited = beginVisited;
                beginVisited = tmp;
            }

            Set<String> nextVisited = new HashSet<>();
            for (String word : beginVisited) {
                if(broadcast(word, nextVisited)){
                    return step+1;
                }
            }

            beginVisited = nextVisited;
            step++;
        }

        return 0;
    }

    private boolean broadcast(String word, Set<String> nextVisited) {
        char[] arr = word.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            char origin = arr[i];
            for (char c = 'a'; c <= 'z'; c++) {
                if(origin == c){
                    continue;
                }
                arr[i] = c;
                String nextWord = new String(arr);
                if(words.contains(nextWord)){
                    if(endVisited.contains(nextWord)){
                        return true;
                    }

                    if(!visited.contains(nextWord)){
                        nextVisited.add(nextWord);
                        visited.add(nextWord);
                    }
                }
            }
            arr[i] = origin;
        }
        return false;
    }
}
