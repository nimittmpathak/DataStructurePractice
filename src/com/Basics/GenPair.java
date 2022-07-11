package com.Basics;

import java.util.ArrayList;
import java.util.List;

public class GenPair<T,E> {
    T key;
    E value;
    GenPair[] hashMapArray;
    public GenPair(){}

    public GenPair(T k, E v){
        this.key = k;
        this.value = v;
    }

    public void add(T k, E v) {
        GenPair<T,E> item = new GenPair<>(k,v);
        GenPair[] bkpArray = this.hashMapArray;
        GenPair[] newArray;
        int arrayLen = 0;
        if (bkpArray != null) {
            arrayLen = bkpArray.length;
        }
        System.out.println("arrayLen: " + arrayLen);
        if (arrayLen == 0) {
            newArray = new GenPair[1];
        } else {
            newArray = new GenPair[arrayLen + 1];
        }
        System.out.println("New Array length: " + newArray.length);
        if (arrayLen == 0) {
            newArray[0] = item;
        } else {
            for (int i = 0; i < arrayLen + 1; i++) {
                if (i < arrayLen) {
                    newArray[i] = bkpArray[i];
                } else {
                    newArray[i] = item;
                }
            }
        }
        this.hashMapArray = newArray;
    }
    public E getValue(T k){
        if (this.hashMapArray != null){
            for(int i = 0; i < this.hashMapArray.length; i++){
                if(this.hashMapArray[i].key == k){
                    return (E) this.hashMapArray[i].value;
                }
            }
        }
        return null;
    }
    public void printHashMap(){
        System.out.println("Available Hashamap Array:");
        for(int i = 0; i<this.hashMapArray.length; i++){
            System.out.println(this.hashMapArray[i].key +", "+this.hashMapArray[i].value);
        }
        System.out.println("=========================");
    }
}
