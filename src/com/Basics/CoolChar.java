package com.Basics;

public class CoolChar {
    public static void main(String args[]){
        char ch1, ch2 = 'y';
        byte num = 8;
        ch1 = 88;
        System.out.println("ch1:"+ch1+" ch2: "+ch2);
        ch1++;// incremental in character by incremengin their ascii value
        System.out.println("ch1:"+ch1);
//Type promotion expression
        int result = num*ch1;
        System.out.println("Byte and char ascii for ch1 multiplied: "+result);
        result = num*ch2;
        System.out.println("Byte and char ascii for ch2 multiplied: "+result);
        //num = num*50; //error can’t assign int to byte
        int result2 = num * 50;
        System.out.println("byte and int multiplication success for int type store"+ result2);
        double d = num*ch1;
        System.out.println(d);
    }

}
