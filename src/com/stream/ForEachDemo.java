package com.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Java");
        list.add("Spring");
        list.add("RestApi");
        list.add("hibernate");
        list.add("JPA");

        list.stream().filter(t->t.startsWith("J")).forEach(System.out::println);

       /* for (String s:list)
            System.out.println(s);*/

        //list.stream().forEach(t-> System.out.println(t));

        Map<Integer,String> map=new HashMap<>();
        map.put(1,"Java");
        map.put(2,"Spring");
        map.put(3,"Hibernate");
        map.put(4,"Rest");

        //map.forEach((key,value)-> System.out.println(key+" :: "+value));
        //map.entrySet().forEach(obj-> System.out.println(obj));

    }
}
