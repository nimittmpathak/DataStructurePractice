package com.Searching;
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class BinarySearch {
    public int BinarySearchMethod(int[] inputArray, int x){
        Arrays.sort(inputArray);
        System.out.println("Sorted Array");
        for(int i : inputArray){
            System.out.println(i);
        }

        int low = 0;
        System.out.println("low: "+low);
        int high = inputArray.length - 1;
        System.out.println("high: "+high);
        int mid = (low + high) /2;
        int count = 0;
        while(count <= high){
            if(inputArray[mid] < x ){
                mid++;
            }
            else if (inputArray[mid] > x){
                mid--;
            }
            else{
                return inputArray[mid];
            }
            System.out.println("loop Count: "+count);
            count++;
        }

        return -1;
    }

    public int BinarySearchRecursive(int[] inputArray, int x, int low, int high){
        return -1;
    }

    public static void main(String args[]){
//        List<Integer> arrLst = Arrays.asList(5,7,1,4,7,10,2,8,11,78,87);
//        ArrayList<Integer> inputArray = new ArrayList<>();
//        inputArray.addAll(arrLst);
        int[] inputArray = {5,7,1,4,7,10,2,8,11,78,87};
        System.out.println("print unsorted list from main method");
        for(int i : inputArray){
            System.out.print(i);
        }
        BinarySearch b = new BinarySearch();
        int result = b.BinarySearchMethod(inputArray,13);
        if (result != -1){
            System.out.println("Element Found"+result);
        }
        else{
            System.out.println(result);
        }

    }
}
