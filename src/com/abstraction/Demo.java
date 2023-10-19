package com.abstraction;

abstract  class  Car{
    public abstract void drive();
    public abstract  void fly();


    public void run(){
        System.out.println("running");
    }
}

 abstract class Wagnor extends Car{

    public void drive()
    {
        System.out.println("driving");
    }
     public void run(){
         System.out.println(" Wagnor running");
     }
}

class UpdatedWagnor extends Wagnor{
public void fly()
{
    System.out.println("flying");
}
    public void run(){
        System.out.println(" UpdatedWagnor running");
    }
}
public class Demo {
    public static void main(String[] args) {
        Wagnor obj = new UpdatedWagnor();
        obj.drive();
        obj.run();
        obj.fly();
    }
}
