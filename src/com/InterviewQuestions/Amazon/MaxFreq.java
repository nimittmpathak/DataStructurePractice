package com.InterviewQuestions.Amazon;

import java.util.*;

/*
* example input s = bbbbaccc then max occurence b =4 and min a = a then dev (4-1) = 3
* */
public class MaxFreq {
    public static int getMaxFeqDeviation(String s){
        if(s == null || s == ""){
            return 0;
        }
        int calcFreq = 0;
        char charArray[] = s.toCharArray();
        Set<Character> uniqueCharSet = new HashSet<Character>();
        for(char c : charArray){
            uniqueCharSet.add(c);
        }
        Map<Character,Integer> charFreqMap = new HashMap<Character,Integer>();
        int count = 0;
        for(char ch: uniqueCharSet){
            for(int i =0;i<charArray.length;i++){
                if(ch == charArray[i]){
                    count++;
                }
            }
            charFreqMap.put(ch,count);
            count = 0;
        }

        int minFreq = Collections.min(charFreqMap.values());
        int maxFreq = Collections.max(charFreqMap.values());
        calcFreq = maxFreq - minFreq;
        return calcFreq;
    }
    public static int optGetMaxFeqDev(String s){
        if(s == null || s == ""){
            return 0;
        }
        int calcFreq = 0;
        char charArray[] = s.toCharArray();
        Set<Character> uniqueCharSet = new HashSet<Character>();
        for(char c : charArray){
            uniqueCharSet.add(c);
        }
        Map<Character,Integer> charFreqMap = new HashMap<Character,Integer>();
        int count = 0;
        for(int i =0; i < charArray.length ; i++){
            if(charFreqMap.containsKey(charArray[i])){
                int val = charFreqMap.get(charArray[i]);
                charFreqMap.replace(charArray[i],val+1);
            } else {
                charFreqMap.put(charArray[i],0);
            }
        }
        int minFreq = Collections.min(charFreqMap.values());
        int maxFreq = Collections.max(charFreqMap.values());
        calcFreq = maxFreq - minFreq;
        return calcFreq;
    }
    public static void main(String args[]){
        String input = "aaaaaabbyyyuu";
        //int result = MaxFreq.getMaxFeqDeviation(input);
        int result = MaxFreq.optGetMaxFeqDev(input);
        System.out.println(result);
    }
}
