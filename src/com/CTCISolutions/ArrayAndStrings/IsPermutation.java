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
    public static boolean isPermutationEfficient(String str1, String str2){
        if (str1.length() != str2.length()){
            return false;
        }
        int[] letters = new int[128]; // assumption
        char[] charArray = str1.toCharArray();
        int count = 0;
        for (char c: charArray) {
            System.out.print(c+", ");
            letters[c]++;
            System.out.println(letters[count]);
            count++;
        }
        for (int i =0 ;i<str2.length();i++){
            System.out.println("string 1 charat:"+(int)str1.charAt(i));
            int c = (int) str2.charAt(i);
            System.out.print(c+",");
            System.out.println(letters[c]);
            letters[c]--;
            System.out.print(c+",");
            System.out.println(letters[c]);
            if (letters[c] < 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String args[]){
        String s1 ="gooooood";
        String s2 ="dooogggg";

        //boolean result = isPermutation(s1,s2);
        boolean result = isPermutationEfficient(s1,s2);
        System.out.println(result);
    }
}
