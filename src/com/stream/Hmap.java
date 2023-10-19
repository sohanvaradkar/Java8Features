package com.stream;

import java.util.Map;
import java.util.HashMap;

public class Hmap {
    public static void main(String[] args) {
      Map<String,Integer> map= new HashMap<>();
        map.put("Ajay",1);
        map.put("Vijay",2);
        map.put("Sujay",3);
        map.put("jay",4);


        System.out.println("map " +map.remove("Vijay") );
        System.out.println("size " +map.size());
        System.out.println("map " +map.get("Ajay"));
        System.out.println("map " +map.put("Suprabha",8));
        System.out.println("map " +map.put("Suprabha",8));
        System.out.println("map " +map.put("Suprabha",8));
        System.out.println("map " +map.put("Suprabha",8));
        System.out.println("map " +map.put("Suprabha",90));
        /*System.out.println("map " +map.putIfAbsent("Suprabha",8));
        System.out.println("map " +map.putIfAbsent("Suprabha",8));
        System.out.println("map " +map.putIfAbsent("Suprabha",8));
        System.out.println("map " +map.putIfAbsent("Suprabha",8));*/
        System.out.println("size " +map);
        System.out.println("map " +map.containsKey("Suprabha"));
      if(map.containsKey("Suprabha")){
            System.out.println("map" +map.remove("Suprabha"));

        }
    }
}
