package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// your input [[1,3],[2,6],[8,10],[15,18]]
public class MergeIntervalMyTry {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        System.out.println("IntervalLength:"+intervals.length);
        if(intervals.length == 0){
            throw new IllegalArgumentException("Cant handle Empty Array");
        } else if(intervals.length == 1){
            return intervals;
        }
        List<List<Integer>> tempResult = new ArrayList<>(intervals.length);
        int startLimit = Math.min(intervals[0][0],intervals[1][0]);
        int endLimit = Math.max(intervals[0][1],intervals[1][1]);
        System.out.println("Start:End"+startLimit+":"+endLimit);
        Integer count = 0;
        for (int i = 0; i < intervals.length;i++){
            if(i+1 == intervals.length ){
                System.out.println("hit");
                tempResult.add(new ArrayList());
                tempResult.get(count).add(intervals[i][0]);
                tempResult.get(count).add(intervals[i][1]);
                count++;
                break;
            }
            startLimit = Math.min(intervals[i][0],intervals[i+1][0]);
            endLimit = Math.max(intervals[i][1],intervals[i+1][1]);
            if(intervals[i][1] >= startLimit && intervals[i][1] >= intervals[i+1][0] && intervals[i+1][0] <= endLimit){
                System.out.println("True");
                tempResult.add(new ArrayList());
                tempResult.get(count).add(startLimit);
                tempResult.get(count).add(endLimit);
                count++;
                i++;

            } else
            {
                System.out.println("False");

                tempResult.add(new ArrayList());
                tempResult.get(count).add(intervals[i][0]);
                tempResult.get(count).add(intervals[i][1]);
                count++;
            }
            System.out.println(intervals[count][0]);
            System.out.println(intervals[count][1]);
            System.out.println("Iteration over count:"+count);
        }
        int[][] finalresult = new int[count][2];

        for(int j=0;j<count;j++){
            finalresult[j][0] = tempResult.get(j).get(0);
            finalresult[j][1] = tempResult.get(j).get(1);
        }
        return finalresult;
    }
}
