package com.leetcode;

public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int maximumSubArray = Integer.MIN_VALUE;

        for (int i = 0; i< nums.length;i++){
            int currentSbArry = 0;
            for(int j=i;j<nums.length;j++){
                currentSbArry += nums[j];
                maximumSubArray = Math.max(maximumSubArray,currentSbArry);
            }
        }
        return maximumSubArray;
    }
    public static void main(String args[]){
        //int inputarr[] = {-2,1,-3,4,-1,2,1,-5,4};
        int inputarr[] ={-2, 1, -3, 4, -1, 2, 1, -5, 4};
        MaxSubArray maxArray = new MaxSubArray();
        int result = maxArray.maxSubArray(inputarr);
        System.out.println(result);
    }
}
