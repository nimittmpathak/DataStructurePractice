package com.InbuiltJavaCollections;
import java.util.HashMap;
import java.util.Map;

public class PracHashMap {

    public static void main(String[] args){
        HashMap<String, Integer> map = new HashMap<>();
        // add elements
        map.put("A",1);
        map.put("B",2);
        map.put("C",3);

        // print size and contents
        System.out.println("Map size:"+map.size());
        System.out.println(map);

        //check if a key present and if present print value
        if(map.containsKey("C")){
            Integer desiredValue = map.get("C");
            System.out.println("The value of key:"+desiredValue);
        }
        //replace hashmap valud B
        System.out.println("Initial hashmap: "+map);
        map.put("B",4);
        System.out.println("After replacing the value of B hashmap: "+map);
        System.out.println("Remove value of Kye C");
        map.remove("C");
        System.out.println("After removing the value of C hashmap: "+map);
        map.put("D",8);
        System.out.println("Traversal of Hashmap");
        for(Map.Entry<String,Integer> e: map.entrySet()){
            System.out.println("Key: "+e.getKey()+" Value: "+e.getValue());
        }


    }
}
