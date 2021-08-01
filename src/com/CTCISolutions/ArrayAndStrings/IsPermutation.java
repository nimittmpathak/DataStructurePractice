package com.CTCISolutions.ArrayAndStrings;

import java.beans.PropertyEditorSupport;

/*
permutation meaning: DOG --> GOD
This method will check whether give two strings are permutation of each other or not where we'll not consider "DOG" "god" and "DOG   " and "GOD" are permutations to each other
* */
public class IsPermutation {
    /*Solution1: If two strings are permutations, then we know they have the same characters, but in different orders. Therefore,sorting the strings will put the characters from two
    permutations in the same order. We just need to compare the sorted versions of the strings.*/
    public static String sort(String inputString){
        char[] content = inputString.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }
    public static boolean isPermutation(String str1, String str2){
        if (sort(str1).equals(sort(str2))){
            return true;
        }
        return false;
    }

    public static void main(String args[]){
        String s1 ="god";
        String s2 ="dog";

        boolean result = isPermutation(s1,s2);
        System.out.println(result);
    }
}
