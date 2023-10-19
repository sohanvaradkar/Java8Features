package com;

public class ExceptionHandling {

    public static void main(String[] args) {

        int s=10;
        System.out.println("line 8");


        try {
            int a[]=new int[5];
            a[10]=50; //ArrayIndexOutOfBoundsException
        }
        catch (ArithmeticException e)
        {
            System.out.println("Exception line 16");
        }
        catch (NullPointerException e)
        {
            System.out.println("Exception line 20");
        }
       catch (Exception e)
       {
           System.out.println(" Exception line 24");
       }

   finally {
            System.out.println(" in finally");
        }

       System.out.println("31");
    }
}
