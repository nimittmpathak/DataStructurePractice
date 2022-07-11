package com.CollectionPractice;

public class CustomeHashmap {
    // Get value --> Key
    // Delete entry --> Key
    // Add Entry --> Key,Value
    private int key;
    private int value;
    private int [][] genHashMapArray;

    public void setHashMap(int key, int value){
        int [][] bkpArray = this.genHashMapArray;
        int [][] newArray;
        int arrayLen = 0;
        if(bkpArray != null) {
            arrayLen = bkpArray.length;
        }
        System.out.println("arrayLen: "+ arrayLen);
        if(arrayLen == 0){
            newArray = new int[1][2];
        } else {
            newArray = new int[arrayLen+1][2];
        }
        System.out.println("New Array length: "+ newArray.length);
        if(arrayLen == 0){
            newArray[0][0] = key;
            newArray[0][1] = value;
        } else {
            for(int i = 0; i < arrayLen+1; i++){
                for(int j =0; j < 2; j++){
                    if(i < arrayLen){
                        newArray[i][j] = bkpArray[i][j];
                    } else {
                        if(j==0){
                            newArray[i][j] = key;
                        } else {
                            newArray[i][j] = value;
                        }
                    }
                }
            }
        }

        this.genHashMapArray = newArray;
    }

    public int getHashValue(int key){
        if (this.genHashMapArray != null){
            for(int i = 0; i < this.genHashMapArray.length; i++){
                if(this.genHashMapArray[i][0] == key){
                    return this.genHashMapArray[i][1];
                }
            }
        }
        return Integer.MIN_VALUE;
    }
    public void deleteKey(int key){
        int[][] newArray;
        if (this.getHashValue(key) != Integer.MIN_VALUE){
            newArray = new int[this.genHashMapArray.length-1][2];
            for(int i=0, j=0; i < this.genHashMapArray.length-1; i++,j++){
                System.out.println("Debug with i: "+this.genHashMapArray[i][0]);
                System.out.println("Debug with j: "+this.genHashMapArray[j][0]);
                if(key == this.genHashMapArray[i][0]){
                    j++;
                }
                newArray[i][0] = this.genHashMapArray[j][0];
                newArray[i][1] = this.genHashMapArray[j][1];
            }
            this.genHashMapArray = newArray;
            System.out.println("Array item deleted successfully for the key: "+key);
        } else {
            System.out.println("Item not found");
        }

    }
    public void printHashMap(){
        System.out.println("Available Hashamap Array:");
        for(int i = 0; i<this.genHashMapArray.length; i++){
                System.out.println(this.genHashMapArray[i][0]+", "+this.genHashMapArray[i][1]);
        }
        System.out.println("=========================");
    }
    public static void main(String args[]){
        CustomeHashmap cmap = new CustomeHashmap();
        cmap.setHashMap(1,2);
        cmap.setHashMap(3,4);
        cmap.setHashMap(5,6);
        System.out.println("After adding");
        cmap.printHashMap();

        System.out.println("Value for key"+" 5 is "+cmap.getHashValue(5));
        cmap.deleteKey(1);
        cmap.printHashMap();


    }

}
