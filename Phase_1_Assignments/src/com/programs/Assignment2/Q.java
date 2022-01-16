package com.programs.Assignment2;

import com.programs.Assignment2.A;
import com.programs.Assignment2.B;


public class Q {
	public static void main(String[] args)
	   {
		   System.out.println("variable of M Class");
		   System.out.println("\n");
		   new A().methodPublic();
		   
		   System.out.println("\n");
		   System.out.println("variable of N Class");
		   System.out.println("\n");
		   new B().methodPublic();
		   
		   System.out.println("\n");
		   System.out.println("variable of P Class");
		   System.out.println("variable of l : " + new P().l);
		   System.out.println("variable of b : " + new P().b);
		   System.out.println("variable of c : " + new P().c);
	   }   
}
