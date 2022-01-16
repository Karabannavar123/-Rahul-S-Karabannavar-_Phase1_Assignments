package com.programs.Assignment2;

public class B {
	public int a = 20;
	   double b = 57.254;
	   protected long l = 2500;
	   
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
		   System.out.println("Value of double b : " + b);
		   System.out.println("Value of protected long l : " + l);
	   }	

}
