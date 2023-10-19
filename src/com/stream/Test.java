package com.stream;

public class Test {
    public static void main(String[] args) {
        int percentage = 26;
        if(percentage<30){
            System.out.println("Fail");
        }
        if(percentage>30 && percentage<60)
        {
            System.out.println("Pass");
        }
        if(percentage>60 && percentage<80)
        {
            System.out.println("Average");
        }
        if(percentage>80 && percentage<100)
        {
            System.out.println("Distinction");
        }

        }
}
