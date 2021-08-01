package com.CTCISolutions.ArrayAndStrings;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class URLify {
    /*URLify: Write a method to replace all spaces in a string with '%20'. You may assume that the string has sufficient space at the end to hold the additional characters, and that you
    are given the "true" length of the string. (Note: if implementing in Java, please use a character array so that you can perform this operation in place.)
    EXAMPLE
    Input: "Mr John Smith ", 13
    Output: "Mr%20John%20Smith"
    */
    //if not using character array
    public static String replaceJavaString(String str){
        str = str.replace(" ","%20");
        return str;
    }
    public static String replaceSpace(char[] charArray, int trueLength){
        System.out.println("Char array length: "+charArray.length);
        System.out.println("true length: "+trueLength);
        System.out.println(charArray);
        int spaceCount = 0, index, i = 0;
        for(i = 0;i< trueLength; i++){
            if(charArray[i]== ' '){
                    spaceCount++;
            }
        }
        System.out.println("Number of blank space found "+spaceCount);
        index = trueLength + spaceCount * 2;
        System.out.println("Calculated index: "+index);
        char[] resultArray = new char[index];
        if(trueLength < charArray.length){
            resultArray[trueLength] = '\0';
            System.out.println("resultArray[trueLength] = '\\0' implemented");
        }
        for(i = trueLength -1;i>=0;i--){
            if(charArray[i] == ' '){
                resultArray[index-1] = '0';
                resultArray[index-2] = '2';
                resultArray[index-3] = '%';
                index = index -3;
            } else {
                resultArray[index-1] = charArray[i];
                index --;
            }
        }
        return new String(resultArray);

    }

    public static void main(String args[]){
        String input = "Mr John Smith ";
        String input2 = input;
        String resultString = replaceJavaString(input);
        System.out.println(resultString);
        System.out.println("Book Method solution");
        resultString = replaceSpace(input2.toCharArray(),input2.toCharArray().length);
        System.out.println(resultString);
    }
}
