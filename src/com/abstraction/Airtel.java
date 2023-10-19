package com.abstraction;


  interface A
{
    void call();
    void internet();

}
interface  B
{
    void call();
    void internet();
}

class Jio implements A,B{

     public void call(){
         //System.out.println("Jio Calling Implemented");

     }
    public void internet(){
        System.out.println("Vi Internent implemented");
    }

}

/* class Vi implements Sim{

     public void call(){
         System.out.println("Jio Calling Implemented");
     }
     public void internet(){
         System.out.println("Vi Internent implemented");
     }
    public void message(){
        System.out.println("Jio messaging Implemented");
    }
    public void app(){
        System.out.println("Vi app implemented");
    }
}*/




public class Airtel {
    public static void main(String[] args) {
    A vi=new Jio();
    vi.call();
    }
}
