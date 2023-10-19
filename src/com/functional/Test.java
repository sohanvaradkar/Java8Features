package com.functional;

import java.util.Scanner;

public class Test {

    //public int sum()
    public static void main(String[] args) {
        double sum = 0;
        int counter = 0, input = 0;
        System.out.print("Enter a series of values (-1 to quit): ");
        Scanner in = new Scanner(System.in);
        while ((input = in.nextInt()) != -1) {
            if (input != -1) {
                sum += input;
                counter++;
            }
        }
        if (counter > 0) {
            double average = sum / counter;
            System.out.println("The average value is: " + average);
        } else {
            System.out.println("No data was entered.");
    }
}}

