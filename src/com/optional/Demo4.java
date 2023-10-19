package com.optional;
// //polymorphism-  method overriding / dynamic method dispatch
class Computer{

}
class Laptop extends Computer{

}
class A{
    public void show(){
        System.out.println("in A show ");
    }
}

class B extends A{
    public void show(){
        System.out.println("in B show ");
    }
}
class C extends A{
    public void show(){
        System.out.println("in C show ");
    }
}
public class Demo4 {
    public static void main(String[] args) {

       // A obj = new B(); //reference of super class and object of subclass
        A obj=new A();    //once we add show() in class B
        obj.show();

        obj= new B();
        obj.show();

        obj=new C();
        obj.show();
    }

}
