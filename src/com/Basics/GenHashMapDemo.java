package com.Basics;

public class GenHashMapDemo {
    public static void main(String args[]){
        GenPair<Integer,String> hashMap = new GenPair<>();
        hashMap.add(5,"a");
        GenPair<Integer,Integer> hashMapInt = new GenPair<>();
        hashMapInt.add(1,2);
        hashMap.printHashMap();
        System.out.println("Value for 5 is: "+hashMap.getValue(5));
        hashMapInt.printHashMap();
    }
}
