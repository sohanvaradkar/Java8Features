package com.lambda;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"Java");
        map.put(2,"Spring");
        map.put(3,"Hibernate");
        map.put(4,"Rest");
        map.put(5,"Spring");
        map.put(6,"Hibernate");
        map.put(7,"Rest");
        map.put(8,"Spring");
        map.put(9,"Hibernate");
        map.put(10,"Rest");
        map.put(11,"Hibernate");
        map.put(12,"Rest");
        map.put(13,"Rest");

        System.out.println("map "+map.toString());
    }
}
