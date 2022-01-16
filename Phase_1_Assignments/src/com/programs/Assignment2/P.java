package com.programs.Assignment2;

public class P {
	public char c = 'R';
	   private int a = 47;
	   protected float b = 4657.25474748F;
	   long l = 4250;
	   
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
		   System.out.println("Value of char c : " + c);
		   System.out.println("Value of private a : " + a);
		   System.out.println("Value of protected b : " + b);
		   System.out.println("Value of default l : " + l);
	   }	

}
