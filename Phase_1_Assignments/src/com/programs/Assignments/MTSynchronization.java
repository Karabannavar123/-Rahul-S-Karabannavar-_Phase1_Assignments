/*
    14. You are given a project to demonstrate the multi threading with synchronization.
 */


package com.programs.Assignments;

class Count
{
   static int value = 0;
   public synchronized void intcrement()
   {
     value++; 
   }
   public void decrement()
   {
     value--; 
   }
    public synchronized void showValue()
    {
      System.out.println("value = "+value);
    }
}
public class MTSynchronization 
{
    public static void main(String[] args) 
    {
       System.out.println("program start");
       Count c1=new Count();
       Runnable r1 = () ->
       {
         c1.intcrement();
         c1.showValue();
       };
       Runnable r2 = () ->
       {
         c1.decrement();
         c1.showValue();
       };
         Thread t1 = new Thread(r1);
         Thread t2 = new Thread(r2);
         t1.start();
         t2.start();
     }
}
