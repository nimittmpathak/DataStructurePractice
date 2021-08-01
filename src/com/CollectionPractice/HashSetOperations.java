package com.CollectionPractice;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetOperations {
    public static void main(String args[]){
        int[] arr = {1,1,5,5,6,7,9,10};

        HashSet<Integer> set = new HashSet<Integer>();
        for(int i: arr){
            set.add(i);
        }
        System.out.println(set);
        for(int i: set){
            System.out.print(i+", ");
        }
        System.out.println();

        Iterator<Integer> it = set.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+", ");
        }
    }
}
