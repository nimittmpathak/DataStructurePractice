package com.Basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class JavaGen {
    public static <T> List<T> fromArrayToList(T[] a) {
        List<T> res = new ArrayList<T>();
        res = Arrays.stream(a).collect(Collectors.toList());
        return res;
    }
    public static void main(String args[]){

        Integer[] intArray = {5,6,7,89,10};
        String[] strArray = {"ABCDEFGH"};
        List<Integer> intList = fromArrayToList(intArray);
        List<String> stringList = fromArrayToList(strArray);

        System.out.println(intList);
        System.out.println(stringList);
    }

}
