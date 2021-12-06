package com.CollectionPractice;

import java.util.*;

public class HashMapOperations {
    public static void printHashmap(HashMap input){
        System.out.println("From printHashmap method");
        if(input.isEmpty()){
            System.out.println("Map is empty:"+input);
        } else {
            for(Object obj : input.keySet()){
                System.out.println("key: " + obj + " Value: "+ input.get(obj));
            }
        }

    }
    public static void main(String args[]){
        HashMap<Integer,String> animalsMap = new HashMap<Integer,String>();
        System.out.println("Initial Map:"+animalsMap);
        printHashmap(animalsMap);
        animalsMap.put(1,"Cow");
        animalsMap.put(2,"Buffalo");
        animalsMap.put(3,"Cat");
        animalsMap.put(4,"Dog");
        animalsMap.put(5,"Got");
        System.out.println("After adding values"+animalsMap);
        //converting Hashmap Keys into ArryaList
        List<Integer> keyList = new ArrayList<Integer>(animalsMap.keySet());
        System.out.println("Key arrayList"+keyList);

        //converting Hashmap Values into ArryaList
        List<String> valueList = new ArrayList<String>(animalsMap.values());
        System.out.println("Value arraylist: "+valueList);
        printHashmap(animalsMap);
        //safe use of get method
        if(animalsMap.containsKey(5)){
            System.out.println("Found"+animalsMap.get(5));
        } else {
            System.out.println("Got not found");
        }
        //use of getOrDefault
        System.out.println("Get the value for key 6");
        String result = animalsMap.getOrDefault(6,"Not Found");

        System.out.println(result);
        System.out.println("Get the value for key 5");
        result = animalsMap.getOrDefault(5,"Not Found");
        System.out.println(result);
        // Size of the Hashmap --> Counts of entries (keys)
        System.out.println("Size of animal map:"+animalsMap.size());
        //put() will replace an existing value. But putIfAbsent() will not. It only adds the value to the HasMap if no key currently exists for it
        animalsMap.putIfAbsent(6,"Horse");
        animalsMap.putIfAbsent(7,"Cow");
        System.out.println(animalsMap);
        animalsMap.put(5,"Rabbit");
        System.out.println(animalsMap);

        HashMap<Integer,String> birdsMap = new HashMap<Integer,String>();
        birdsMap.put(1,"Sparrow");
        birdsMap.put(2,"Pigeon");
        birdsMap.put(3,"Peacock");

        // iterating practice in hashmap
        System.out.println("Birds map iteration");
        for(int key : birdsMap.keySet()){
            System.out.println("key: "+ key + " Value: "+ birdsMap.get(key));

        }
        // iterating usign only values from hashmap
        for(String str : birdsMap.values()){
            System.out.println("Only Values: "+str);
        }
        //List of Hash maps
        //different way of iteration
        Iterator it = birdsMap.entrySet().iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        Iterator it1 = animalsMap.entrySet().iterator();
        while(it1.hasNext()){
            System.out.println(it1.next());
        }

        // making list of Maps
        List<HashMap<Integer,String>> hashMapList = new ArrayList<>();
        hashMapList.add(animalsMap);
        hashMapList.add(birdsMap);
        for(HashMap<Integer,String> map : hashMapList){
            for(int key : map.keySet()){
                System.out.println("Key:"+key+" Value: "+map.get(key));
            }
        }
        //Remove duplicate
        HashSet<String> uniqueSet = new HashSet<String>();
        for(HashMap<Integer,String> dupMap: hashMapList){
            for(int mapKey : dupMap.keySet()){
                uniqueSet.add(dupMap.get(mapKey));
            }
        }
        System.out.println("Print Unique Values from Hashset");
        System.out.println(uniqueSet);



    }
}
