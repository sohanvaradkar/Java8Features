//package com.optional;
//
//interface A
//{
//    //declaring variables (In interface we cannot define but we should declare methods and should initialize variables)
//    int age=24;   ///final(we should initialize variable like 24) and static(we can drectly use interface name)
//    String area="Mumbai";
//
//    //declaring methods
//    void show();
//    void config();
//}
//
//class B implements A
//{
//
//    public void show() {
//        System.out.println("in show");
//    }
//
//    public void config() {
//        System.out.println("in config");
//    }
//}
//public class Demo2 {
//    public static void main(String args[])
//    {
//        //for methods
//        A obj;
//        obj= new B();
//        obj.show();
//        obj.config();
//
//        //As variables are static we need not to create object we can directly use interface name like A
//        System.out.println(A.age);
//        System.out.println(A.area);
//
//    }
//}
