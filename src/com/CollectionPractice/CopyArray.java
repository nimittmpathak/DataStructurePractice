package com.CollectionPractice;
/*Time complexity*/
public class CopyArray {
    int ocount = 0;
    int[] copyArray(int[] array){

        int[] copy = new int[0];
        for(int value: array){
            copy = appendToArray(copy, value);
            ocount++;
           //System.out.println("Ocount in copy array"+ocount);
        }
        return copy;
    }
    int[] appendToArray(int[] array, int value){
        int[] result = new int[array.length+1];
        System.out.println("Size of an array:"+array.length);
        for(int i=0;i <array.length; i++){
            result[i] = array[i];
            ocount++;
            //System.out.println("Ocount in append array"+ocount);
        }
        //add new element
        result[result.length-1] = value;
        return result;
    }
    public static void main(String args[]){
        CopyArray cpArr = new CopyArray();
        int[] inputArray = {1,2,4,6,7,8};
        int[] outputArray = cpArr.copyArray(inputArray);
        for(int i: outputArray){
            System.out.println(i);
        }
        System.out.println("Time complexity is: o("+cpArr.ocount+")");
    }
}
