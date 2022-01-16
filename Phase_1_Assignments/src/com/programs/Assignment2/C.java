package com.programs.Assignment2;

public class C {
	public static void main(String[] args) 
	{
       System.out.println("variable of A Class");
       System.out.println("Value of l : " + new A().l);
       System.out.println("Value of b : " + new A().b);
       
       System.out.println("variable of B Class");
       System.out.println("Value of l : " + new A().l);
       System.out.println("Value of a : " + new A().a);
	}
	
	public void methodPublic()
	{
		System.out.println("Class C : methodPublic");
	}
	public void methodProtected()
	{
		System.out.println("Class C : methodProtected");
	}
    void methodDefault()
	{
		System.out.println("Class C : methodDefault");
	}
	private void methodPrivate()
	{
		System.out.println("Class C : methodPrivate");
	}
}
