/*
    17. You are given a project to demonstrate a program implementing the concept of exception handling available in java and the custom exception handling.
 */


package com.programs.Assignments;

public class CustomException 
{
	static void check(int sal) throws InvalidSalaryException
	{
		if(sal<2100)
			throw new InvalidSalaryException("not valid");
		else
			System.out.println("you need to work hard");
		if(sal>=2100 && sal<=5000)
			throw new InvalidSalaryException("not valid");
		else
			System.out.println("you salary is somehow good");
		if(sal>=5100 && sal<=9000)
			throw new InvalidSalaryException("not valid");
		else
			System.out.println("salary is very good");			
	}

	public static void main(String[] args) 
	{
		try
		{
			check(6400);
			check(9200);
			check(200);
			check(1500);
		}
		catch(Exception e)
		{
			System.out.println("Exception occured: "+ e.getMessage());
		}
		System.out.println("rest of the code...");  

	}
}

class InvalidSalaryException extends Exception
{
	private static final long serialVersionUID = 1L;

	InvalidSalaryException(String s)
	{  
		  super(s); 
	}
}
