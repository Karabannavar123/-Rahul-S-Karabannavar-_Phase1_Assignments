/*
    29. Write a program to perform operations on Stack.
 */

package com.programs.Assignments;

import java.util.*;

public class Stack29
{
	public static void main(String[] args) 
	{
	    Stack stack1 = new Stack();
	     
	    Stack<String> stack2 = new Stack<String>();

	     stack1.push("Apple"); 
	     stack1.push("Strawberry"); 
	     stack1.push("Grapes"); 
	     stack1.push("Pinapple"); 
	     stack1.push("Mango"); 
	     
	     stack1.push("Bengaluru");
	     stack1.push("Delhi");
	     stack1.push("Pune");
	     stack1.push("Hyderabad"); 
	     
	     stack1.push(20);
	     stack1.push(21); 
	     stack1.push(62); 
	     stack1.push(19);
	     
	     stack1.push('R'); 
	     stack1.push('K'); 
	     
	     System.out.println(stack1); 
	     System.out.println(stack2);
	     System.out.println("Popped element from stack 1: " + stack1.pop()); 
	     System.out.println("Popped element from stack 1: " + stack1.pop()); 
	     System.out.println("Popped element from stack 1: " + stack1.pop()); 
	     System.out.println("Popped element from stack 1: " + stack1.pop()); 
	     System.out.println("Popped element from stack 1: " + stack1.pop()); 
	     
	     System.out.println("The element at the top of the"+ " stack-1 is: " + stack1.peek());
	     System.out.println("Popped element from stack 1: " + stack1.pop()); 
	     System.out.println("Popped element from stack 1: " + stack1.pop()); 
	     System.out.println("Popped element from stack 1: " + stack1.pop()); 
	     System.out.println("Popped element from stack 1: " + stack1.pop()); 
	     
	     System.out.println("The element at the top of the"+ " stack-1 is: " + stack1.peek());
	     System.out.println("The index of Apple is: "+ stack1.indexOf("Apple"));
	     System.out.println("The index of Delhi is: "+ stack1.indexOf("Delhi"));

	}

}
