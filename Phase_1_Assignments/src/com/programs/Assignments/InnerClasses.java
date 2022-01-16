/*
    8. Write a program to demonstrate working of Inner Class.
 */


package com.programs.Assignments;

class SubOuterClass
{
     int b = 30;
     public void count()
        {
            System.out.println("b = "+b);
            System.out.println("b = "+Inner.c); // calling the static data members of Inner class by using class name
            Inner i = new Inner();
            System.out.println("a = " + i.a);
            i.disp();// calling the non-static method of inner class by creating the object of inner class
        }

class Inner
    {
      int a = 20;
      static final int c=50;
      public void disp()
         {
            System.out.println("this is innerclass disp");
            System.out.println("a = "+a);
            System.out.println("c = "+c);
         }
    }
}


public class InnerClasses 
{
          public static void main(String[] args) 
             {
               SubOuterClass ref1 = new SubOuterClass();
               ref1.count();
             }
}