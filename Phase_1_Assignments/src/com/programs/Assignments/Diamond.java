/*
   20. You are given a project to work and resolve the diamond problem using OOPs concept.
 */

package com.programs.Assignments;

interface First 
{  
   default void show() 
	 { 
	    System.out.println("Default First"); 
	 } 
} 
interface Second 
{  
	default void show() 
	    { 
	        System.out.println("Default Second"); 
	    } 
}  
  public class Diamond implements First, Second 
	{  
	    public void show() 
	    {  
	        First.super.show(); 
	        Second.super.show(); 
	    } 
	    public static void main(String args[]) 
	    { 
	        Diamond ob = new Diamond(); 
	        ob.show(); 
	    } 
}
