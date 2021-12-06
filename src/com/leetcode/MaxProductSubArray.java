package com.leetcode;

public class MaxProductSubArray {
    public int maxProduct(int[] nums) {
        if (nums.length == 0){
            throw new IllegalArgumentException("Can't pass null Array");
            //return 0;
        }
        int maxProdArray=nums[0];
        int minProdArray=nums[0];
        int result = maxProdArray;
        for(int i=1;i<nums.length;i++){
            int current = nums[i];
            int tmpMaxProdArray = Math.max(current,Math.max(maxProdArray*current,minProdArray*current));
            minProdArray = Math.min(current,Math.min(maxProdArray*current,minProdArray*current));

            maxProdArray = tmpMaxProdArray;

            result = Math.max(maxProdArray, result);
        }
        return result;
    }
    public static void main(String args[]){
        //int inputarr[] = {};
        //int inputarr[] = {-2,0,-1};
        int inputarr[] ={2,3,-2,4};
        MaxProductSubArray maxArray = new MaxProductSubArray();
        int result = maxArray.maxProduct(inputarr);
        System.out.println(result);
    }
}
