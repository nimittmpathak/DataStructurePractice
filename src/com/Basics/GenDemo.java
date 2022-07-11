package com.Basics;

import java.util.ArrayList;
import java.util.List;

public class GenDemo {
    public static void main(String args[]){
        BasicsOfGenerics<String> stringGen = new BasicsOfGenerics<>("Hello");
        List<Integer> listDemo = new ArrayList<Integer>();
        listDemo.add(1);
        listDemo.add(2);
        BasicsOfGenerics<List> listGen = new BasicsOfGenerics<>(listDemo);
        System.out.println(stringGen.getType());
        System.out.println(listGen.getType());

    }
}
