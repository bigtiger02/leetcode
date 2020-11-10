package cn.xhh.leetcode._1620;

import java.util.Arrays;

/**
 * Coordinate with maximum network quality
 * <a href="https://leetcode-cn.com/problems/coordinate-with-maximum-network-quality/">Coordinate with maximum network quality</a>
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/11
 */
public class Solution {
    public int[] bestCoordinate(int[][] towers, int radius) {
        if(null == towers || towers.length == 0 || 0 == radius){
            return new int[]{0,0};
        }

        if(towers.length == 1){
            return towers[0][2] == 0 ? new int[]{0,0}
                : Arrays.copyOfRange(towers[0],0,2);
        }

        //寻找矩形搜索范围
        int minX = towers[0][0], minY = towers[0][1], maxX = towers[0][0], maxY = towers[0][1];
        for (int i = 1; i < towers.length; i++) {
            minX = Math.min(minX, towers[i][0]);
            minY = Math.min(minY, towers[i][1]);
            maxX = Math.max(maxX, towers[i][0]);
            maxY = Math.max(maxY, towers[i][1]);
        }

        maxX = Math.min(maxX, 50);
        maxY = Math.min(maxY, 50);

        //遍历搜索矩形内的所有点
        int maxQuality = 0;
        int[] resultAxis = new int[]{minX,minY};
        for (int x = minX; x <= maxX; x++) {
            for (int y = minY; y <= maxY; y++) {
                int totalQuality = getSignal(towers, x, y , radius);

                if(totalQuality > maxQuality) {
                    maxQuality = totalQuality;
                    resultAxis[0] = x;
                    resultAxis[1] = y;
                    continue;
                }

                if(totalQuality == maxQuality){
                    if(x < resultAxis[0]){
                        resultAxis[0] = x;
                        resultAxis[1] = y;
                    }else if(resultAxis[0] == x && y < resultAxis[1]){
                        resultAxis[0] = x;
                        resultAxis[1] = y;
                    }
                }
            }
        }

        return resultAxis;
    }

    private int getSignal(int[][] towers, int x, int y, int radius) {
        if(0 == radius){
            return 0;
        }

        int totalSignal = 0;
        for (int i = 0; i < towers.length; i++) {
            double distance = Math.sqrt(Math.pow(towers[i][0] - x, 2) + Math.pow(towers[i][1] - y, 2));
            if(distance <= radius){
                totalSignal += Math.floor(towers[i][2] / (1 + distance));
            }
        }
        return totalSignal;
    }
}
