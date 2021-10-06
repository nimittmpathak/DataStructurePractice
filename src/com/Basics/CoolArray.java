package com.Basics;

import java.lang.reflect.Array;

public class CoolArray {
    public static void main(String args[]){
        //two type of declaration
        //1.
        int array[]; // --> Initialization
        array = new int[5]; // --> Assignment
        // all together
        int array2[] = new int[5];

        //2.
        int[] array3 = new int[5];
        //where this will be an easier when you will define multiple array for the single type
        int[] array4, array5, array6 = new int[10];
        //or
        int[] array7, array8, array9; //--> Initialization
        // now assignment of all 3 arrays

        array7 = new int[5];
        array8 = new int[5];
        array9 = new int[5];

        //type inference with local variables
        var array10 = array2;



    }
}
