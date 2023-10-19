package com.inheritance;

//inheritance- IS-A relationship

public class Demo {
    public static void main(String args[])
    {
        VeryAdvCalc obj= new VeryAdvCalc();
        int r1 = obj.add(4, 5);
        int r2 = obj.sub(7, 9);
        int r3 = obj.multi(4, 5);
        int r4 = obj.div(12, 6);
        double r5 = obj.power(4,3);

        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4+ " "+ r5);
    }

}
