package com.Basics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class StringConcat {
    public static void main(String args[]){
        String part1 = "Abc";
        String part2 = "Def";
        String resultString = part1+part2;

        System.out.println(resultString);
        String subtracted = resultString.replace(part2,"");

        System.out.println(subtracted);

        List<HashSet<String>> setList = new ArrayList<>();
        //setList.add(new HashSet<String>())
    }
}
