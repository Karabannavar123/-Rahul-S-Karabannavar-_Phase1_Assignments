/*
   15. You are given a project to demonstrate the uses of try-catch blocks in java.
 */

package com.programs.Assignments;

public class ExceptionH {

	public static void main(String[] args)
	{
		int num1,num2,num3;
		num1=20;
		num2=10;
		
		try{
		  num3 = num1/num2;
		  System.out.println("Result is "+num3);		  
		}	
		catch(ArithmeticException ae)
		{  // child
			System.out.println("Numbers cannot be divided by zero");
		}
		catch(Exception ae1) // parent
		{
			System.out.println("i am before the subclass exception");
		}
		finally
		{
			System.out.println(" this block will always executed");
		}
		
	num3=num1+num2;         
	System.out.println("Result after addition is "+num3);
	}

}
