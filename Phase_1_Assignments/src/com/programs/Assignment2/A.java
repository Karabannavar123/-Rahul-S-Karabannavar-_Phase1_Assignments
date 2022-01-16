package com.programs.Assignment2;

public class A {
	public int a = 20;
	   protected float b = 657.25478F;
	   long l = 2500;
	   
	   public void methodPublic()
	   {
		   methodPrivate();
	   }
	   public void methodProtected()
	   {
		   methodPrivate();
	   }
	   void methodDefault()
	   {
		   methodPrivate();
	   }
	    
	   private void methodPrivate()
	   {
		   System.out.println("Class A : method Protected");
		   System.out.println("Value of public a : " + a);
		   System.out.println("Value of protected b : " + b);
		   System.out.println("Value of long l : " + l);
	   }	

}
