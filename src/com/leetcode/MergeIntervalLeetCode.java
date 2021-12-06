package com.leetcode;

import java.util.Arrays;
import java.util.LinkedList;
// your input [[1,3],[2,6],[8,10],[15,18]]
public class MergeIntervalLeetCode {
    public int[][] merge(int[][] intervals) {

        System.out.println("IntervalLength:"+intervals.length);
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0],b[0]));

        //declare a linked list for dynamic array
        LinkedList<int[]> mergedList = new LinkedList<>();
        for(int[] interval : intervals){
            System.out.println("interval iteration at 0:"+interval[0]);
            System.out.println("interval iteration at 1:"+interval[1]);
            if(mergedList.isEmpty() || mergedList.getLast()[1] < interval[0]){
                mergedList.add(interval);
                System.out.println("Added to Merged:"+mergedList.getLast()[0]);
                System.out.println("Added to Merged:"+mergedList.getLast()[1]);
            } else {
                mergedList.getLast()[1] = Math.max(mergedList.getLast()[1],interval[1]);
                System.out.println("else Added to Merged:"+mergedList.getLast()[0]);
                System.out.println("else Added to Merged:"+mergedList.getLast()[1]);
            }
        }

        return mergedList.toArray(new int[mergedList.size()][]);
    }
}
