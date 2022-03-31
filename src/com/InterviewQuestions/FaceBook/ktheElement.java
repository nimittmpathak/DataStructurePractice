package com.InterviewQuestions.FaceBook;

import java.sql.Array;
import java.util.ArrayList;

//Given locations of shops and facebook user, return the k clossest to the user
//[[2,4],[5,6],[7,8],[3,7],[8,9]] --> Locations
//[5,7] -- User location
// k --> let us say 3
public class ktheElement {
    public static void findKthClose(ArrayList<ArrayList<Integer>> locationList, ArrayList<ArrayList<Integer>> userlocation, int k){
        if(locationList == null){
            //return userlocation.toArray(new int[1][1]);
        }
        ArrayList<ArrayList<Integer>> location = new ArrayList<>();
        location.add(new ArrayList<>());
        ArrayList<Integer> distanceList = new ArrayList<>();
        for(int i=0; i<locationList.size();i++){
            for(int j=0;j<2;j++){
                location.get(0).add(j);
            }
            distanceList.add(calcDistance(location,userlocation));
        }
        for(int dist : distanceList){
            System.out.println("Dist:"+dist);
        }
        // userlocation.toArray(new int[0][0]);
    }
    public static int calcDistance(ArrayList<ArrayList<Integer>> location, ArrayList<ArrayList<Integer>> userlocation){
        return Math.abs((location.get(0).get(0)*location.get(0).get(1)) - (userlocation.get(0).get(0) *userlocation.get(0).get(1)));
    }
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> locationList = new ArrayList<>();
        ArrayList<ArrayList<Integer>> userLocation = new ArrayList<>();
        for(int i=0;i<5;i++){
            locationList.add(new ArrayList<>());
        }
        //[[2,4],[5,6],[7,8],[3,7],[8,9]] --> Locations
        locationList.get(0).add(2);
        locationList.get(0).add(4);
        locationList.get(1).add(6);
        locationList.get(1).add(7);
        locationList.get(2).add(8);
        locationList.get(2).add(3);
        locationList.get(3).add(7);
        locationList.get(3).add(8);
        locationList.get(4).add(9);
        locationList.get(4).add(5);

        userLocation.add(new ArrayList<>());
        userLocation.get(0).add(3);
        userLocation.get(0).add(5);

        findKthClose(locationList,userLocation,3);
    }
}
