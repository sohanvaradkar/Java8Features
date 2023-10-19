package com.wrapper;

public class Demo {
    public static void main(String args[]){

        int num=7;
//      Integer num1= new Integer(num);  //boxing
        Integer num1= num;  //auto-boxing -when you stored object into the primitive type automatically //Integer is wrapper calss which acts as wrapper around primitive type provie varioys fratur one is parseint

        int num2= num1.intValue();   //unboxing -getting value from object type to primitive type
//        int num2=num1;                         //auto-unboxing -when you takeout the primitive value from object automatically
        System.out.println(num2);

        String str ="12";
        int num3 = Integer.parseInt(str); //take the sring & convert itinto integer
        System.out.println(num3*2);
    }
}
