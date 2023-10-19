//package com.optional;
////class-class=extends
////class-interface=implements
////interface-interface=extends
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
//interface X{
//    void run();
//}
//
//interface Y extends X
//{
//
//}
//
//class B implements A, Y
//{
//
//    public void show() {
//        System.out.println("in show");
//    }
//
//    public void config() {
//        System.out.println("in config");
//    }
//
//    public void run() {
//        System.out.println("running");
//    }
//}
//public class Demo3 {
//    public static void main(String a[])
//    {
//        //for methods
//        A obj;
//        obj = new B();
//        obj.show();
//        obj.config();
//
//        //As variables are static we need not to create object we can directly use interface name like A
//        System.out.println(A.age);
//        System.out.println(A.area);
//
//        X obj1 = new B();
//        obj1.run();
//    }
//}
