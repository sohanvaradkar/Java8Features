package com.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SuplierDemo {
    public static void main(String[] args) {
        Supplier<String> supplier=()-> "Hellow World ";
        System.out.println(supplier.get());

        List<String> list= Arrays.asList("a","b","c");
        System.out.println(list.stream().findAny().orElseGet(()->"Hello World"));
    }
}
