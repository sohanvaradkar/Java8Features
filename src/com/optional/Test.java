package com.optional;
//polymorphism- method overloading
public class Test {
    public void m1(int i){
        System.out.println("int- arg");
    }

    public void m1(float f){
        System.out.println("float-arg");
    }

    public static void main(String[] args)
    {
        Test t= new Test();
        t.m1(10);
        t.m1(10.5f);
        t.m1('a');
        t.m1(10l);
       // t.m1(10.5);     //CE= cannot find symbol  Symbol:method m1(double)  location:class Test
    }
}
