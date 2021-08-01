package com.leetcode;

public class reverseInt {
    public int reverseMyEffort(int x) {
        boolean constraintResult = checkConstraint(x);
        System.out.println(constraintResult);
        int result = 0;

        if (constraintResult == true) {
            String convertToString = Integer.toString(x);
            //System.out.println(convertToString.length());
            int[] digitArray = new int[convertToString.length()];
            //reversing an array
            int k = 0;
            for (int i = convertToString.length()-1; i >= 0; i--) {
                System.out.println(convertToString.charAt(i) - '0');
                digitArray[k] = convertToString.charAt(i) - '0';
                k++;
            }
            if (digitArray.length > 0) {
                StringBuilder sb = new StringBuilder(256);
                for (int j = 0; j < digitArray.length; j++) {
                    sb.append(digitArray[j]);
                }
                result = Integer.parseInt(sb.toString());
            } else {
                result = digitArray[0];
            }
            return result;
        } else {
            return result;
        }

    }
    public int reverse(int x){
        int reverseInt = 0;
        int roundedDigit = 0;
        while(x != 0){
            roundedDigit = x%10;
            reverseInt = reverseInt * 10 + roundedDigit;
            x = x /10;
        }
        return reverseInt;
    }
    public boolean checkConstraint(int x){
        return (x <= 2147483647) && (x >= -2147483648);
        //return true;
    }
    public static void main(String[] args) {
        reverseInt r = new reverseInt();
        int result = r.reverse(321);
        System.out.println(result);

    }
}





