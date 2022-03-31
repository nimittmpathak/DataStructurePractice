package com.CTCISolutions.ArrayAndStrings;

public class IsUnique {
    // following method is having no further data structure to use
    // time complexity for the below O9n) when n is the lenght of the string. The space complexity O(1)
    public static boolean isUniqueChars(String str){
        if(str.length() > 128){
            return false;
        }
        boolean[] charset = new boolean[128];
        for(int i=0; i<str.length(); i++){
            int val = str.charAt(i);
            System.out.println("CharAt: "+i+" -"+val);
            if (charset[val]){
                return false;
            }
            charset[val] = true;
        }
        return true;
    }
    public static boolean isUniqueCharsReducedSpaceUsage(String str){
        int checker = 0;
        for(int i = 0; i<str.length();i++){
            int val = str.charAt(i) - 'a';
            System.out.println("Val: "+val);
            if((checker & (1 << val )) > 0){
                return false;
            }
            checker |= (1 << val);
        }

        return true;
    }
    public static void main(String args[]){
        String input = "bB";
        boolean result = isUniqueChars(input);
        System.out.println(result);
        result = isUniqueCharsReducedSpaceUsage(input);
        System.out.println(result);
    }
}
