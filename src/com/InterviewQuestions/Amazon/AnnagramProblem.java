package com.InterviewQuestions.Amazon;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class AnnagramProblem {
    // input[star,rats,book,kobo,ring,tasr]
    // output [star,rats,book,kobo,tasr]
    public ArrayList<String> findAnnagram(ArrayList<String> inputList){
        System.out.println("Entered in method");
        ArrayList<String> resultList = new ArrayList<>();
        for(String word : inputList){
            char[] wordCharArray = word.toCharArray();
            Arrays.sort(wordCharArray);
            for(String innerWord : inputList){
                if(innerWord == word){
                    //System.out.println("word: " +word+ " and innerword: " +innerWord+ "continued");
                    continue;
                }
                char[] innerWordCharArray = innerWord.toCharArray();
                Arrays.sort(innerWordCharArray);
                //System.out.println("innerSortedArrayPrinting");
//                for(char c : innerWordCharArray)
//                {
//                    System.out.print(c);
//                }
                String wordString = String.valueOf(wordCharArray);
                String innerWordString = String.valueOf(innerWordCharArray);
                System.out.print(" WordString: "+ wordString +" and innerWordString "+ innerWordString);
                if(wordString.equals(innerWordString) ){
                    resultList.add(word);
                }

            }
        }
        return resultList;
    }
    public static void main(String args[]){
        AnnagramProblem an = new AnnagramProblem();
        String[] inputArray = {"star","rats","book","kobo","ring","tasr"};
        ArrayList<String> inputList = new ArrayList<>();
        for(String str: inputArray){
            //System.out.print(" adding: "+str);
            inputList.add(str);
        }
        ArrayList<String> resultItems = new ArrayList<>();
        resultItems = an.findAnnagram(inputList);
        for(String s : resultItems){
            System.out.println(s);
        }

    }
}
