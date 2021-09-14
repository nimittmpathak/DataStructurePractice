package com.CollectionPractice;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
public class StreamAPIOperations {
    public static void main(String[] args){
        //System.out.println(
        IntStream
                .range(1,10)
                //.forEach(System.out::print);
                //.skip(5)
                .forEach(x-> System.out.print(x));
                //.sum());
        System.out.println();
        String[] array = {"Nimitt","Jahnavi","Sss","Sarah","Sarah","Abc","Def"};
        Arrays.stream(array)
                .filter(x-> x.contains("S") || x.contains("N") || x.contains("J"))
                .sorted()
                .distinct()
                .forEach(System.out::println);
        System.out.println("Dealing with collection list");

        ArrayList<String> people = new ArrayList<String>();
        for(String val: array){
            people.add(val);
        }
        ArrayList<String> resultList = new ArrayList<String>();
                people
                    .stream()
                    .filter(x->x.startsWith("s") || x.startsWith("a"))
                    .map(String::toLowerCase)
                    .distinct();


        System.out.println("Printing Result list:");
        System.out.println(resultList);
    }
}
