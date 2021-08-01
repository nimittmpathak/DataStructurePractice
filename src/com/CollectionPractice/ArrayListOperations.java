package com.CollectionPractice;

import java.util.ArrayList;

public class ArrayListOperations {
    public static void main(String args[]){
        int[] intArray = {1,2,3,4,5};

        ArrayList<Integer> a1ArrayList = new ArrayList<>();
        for(int i: intArray){
            a1ArrayList.add(i);
        }
        System.out.println(a1ArrayList);

        // Display particular indexed item
        System.out.println(a1ArrayList.get(0));
        // set item at first place
        a1ArrayList.set(0,6);
        System.out.println(a1ArrayList);


    }
}
