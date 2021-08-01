package com.Sorting;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeSort {
     int[] mergeSort(int[] array){
        int[] helper = new int[array.length];
         for(int i =0; i<array.length; i++) {
             mergeSort(array, helper, 0, array.length);
             array = array;
         }
         return array;
    }
     int[] mergeSort(int[] array, int[] helper, int low, int high){

        int middle = (low + high)/2;
        System.out.println("Middle:"+middle);
        while(middle <= 0){
             //mergeSort(array,helper,low,middle); // sort left half
             //mergeSort(array,helper,middle+1,high); // sort right half
             merge(array,helper,low,middle,high); //merge them
        }
        return array;
    }
     void merge(int[] array, int[] helper, int low, int middle, int high){
        // copy both halves into the helper
        for(int i = low; i <=high; i++){
            helper[i] = array[i];
        }
        System.out.println("Print helper array");
        printArray(helper);
        int helperLeft = low;
        int helperRight = high;
        int current = low;
        System.out.println("Initial Merge: helperLeft: "+helperLeft+" helperRight:" +helperRight+" current: "+current);
        //Iterate through helper array. Compare the left and right half, copying back the smaller element from the two halves into the original array
        while(helperLeft <= middle && helperRight <=high){
            System.out.println("HelperLeft: "+helperLeft+" helperRight:" +helperRight+" current: "+current);
            if(helper[helperLeft] <= helper[helperRight]){
                array[current] = helperLeft;
                helperLeft++;
            } else{ // if right element is smaller than left element
                array[current] = helperRight;
                helperRight++;
            }
            current++;
        }
        // copy the rest of the left side of the array into the target array
        int remaining = middle - helperLeft;
        System.out.println("Remaining: "+remaining);
        for (int i = 0; i <= remaining; i++){
            System.out.println("helperLeft + i:"+helperLeft+","+i);
            array[current + i] = helper[helperLeft + i];
        }
    }
     void printArray(int[] array){
        for(int i: array){
            System.out.print(i+",");
        }
        System.out.println("");
    }

    public static void main(String args[]){
        //int[] arrayInput = {3,10,12,9,11,14,8,13,6,2,5,7,4,1};
        int[] arrayInput = {10,3,12,4};
//        List<Integer> array = new ArrayList<Integer>(arrayInput.length);
//        for(int i: arrayInput){
//            array.add(i);
//        }
        MergeSort m1 = new MergeSort();
        System.out.println("Display Original Array");
        m1.printArray(arrayInput);
        int[] resultArray = m1.mergeSort(arrayInput);
        System.out.println("Display sorted Array");
        m1.printArray(resultArray);
    }
}
