package com.Basics;

public class TwoDimArray {
    public static void main(String args[]){
        // initialization
        int[][] twoDimInit;
        //declaration
        twoDimInit = new int[1][2];
        //Initialization + declaration
        int[][] twoDimAll = new int[5][5];
        int[][] twoDim = {{0,1},{1,1},{2,1},{3,1},{4,1},{5,1}}; //row 5; column 5;

        System.out.println("Array length: "+twoDim.length);
        System.out.println("print first element from row 1 column1");
        System.out.println(twoDim[0][0]);
        twoDimInit[0][0] = 1;
        twoDimInit[0][1] = 2;

        System.out.println(twoDimInit[0][0]);
        System.out.println(twoDimInit[0][1]);


    }
}
