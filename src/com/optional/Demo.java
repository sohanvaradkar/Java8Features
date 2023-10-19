//package com.optional;
//
//interface Computer {
//   void code();
//    }
//
//class Laptop implements Computer{
//    public void code(){
//        System.out.println("Developer will use laptop");
//    }
//}
//
//class Desktop implements Computer{
//    public void code(){
//        System.out.println("Developer will use desktop");
//    }
//}
//class Developer{
//    public void devApp(Computer lap){
//        lap.code();
//    }
//}
//
//class Demo{
//
//    public static void main(String a[]) {
//        Computer lap= new Laptop();
//        Computer desk= new Desktop();
//
//        Developer suprabha= new Developer();
//        suprabha.devApp(desk);
//    }
//
//}