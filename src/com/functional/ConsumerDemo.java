package com.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {

        Consumer<Integer> consumer=t-> System.out.println("Print "+t);
        consumer.accept(20);

        List<Integer> num= Arrays.asList(1,2,3,4,5);
        num.stream().forEach(t-> System.out.println("Print "+t));
    }
}
