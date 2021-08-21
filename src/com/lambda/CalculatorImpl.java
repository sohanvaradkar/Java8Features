package com.lambda;

interface Calculator
{
    void switchOn();
}
public class CalculatorImpl
{
    public static void main(String[] args) {
        Calculator calculator=()-> System.out.println(" switching on ");
        calculator.switchOn();
    }
}
