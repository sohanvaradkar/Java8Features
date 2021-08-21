package com.lambda;

interface Calculator
{
   // void switchOn();
    // void sum(int num);
    int substract(int num1,int num2);
}
public class CalculatorImpl
{
    public static void main(String[] args) {
        /*Calculator calculator=()-> System.out.println(" switching on ");
        calculator.switchOn();*/

        /*Calculator calculator=(num)-> System.out.println("sum is "+num);
        calculator.sum(20);*/

        Calculator calculator=(num1, num2) ->num1-num2;
        System.out.println(calculator.substract(20,10));

    }
}
