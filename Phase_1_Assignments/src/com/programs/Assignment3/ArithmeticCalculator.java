/*
    3. As a Developer, Write a program to create an arithmetic calculator.
 */

package com.programs.Assignment3;

import java.util.Scanner;

public class ArithmeticCalculator {

	public static void main(String[] args) {
		char operator;
	    Double num1, num2, result;

	    Scanner input = new Scanner(System.in);

	    // ask users to enter operator
	    System.out.println("Choose an operator: +, -, *, or /");
	    operator = input.next().charAt(0);

	    // ask users to enter numbers
	    System.out.println("Enter first number");
	    num1 = input.nextDouble();

	    System.out.println("Enter second number");
	    num2 = input.nextDouble();

	    switch (operator) {

	      // performs addition operation
	      case '+':
	        result = num1 + num2;
	        System.out.println(num1 + " + " + num2 + " = " + result);
	        break;

	      // performs subtraction operation
	      case '-':
	        result = num1 - num2;
	        System.out.println(num1 + " - " + num2 + " = " + result);
	        break;

	      // performs multiplication operation
	      case '*':
	        result = num1 * num2;
	        System.out.println(num1 + " * " + num2 + " = " + result);
	        break;

	      // performs division operation
	      case '/':
	        result = num1 / num2;
	        System.out.println(num1 + " / " + num2 + " = " + result);
	        break;

	      default:
	        System.out.println("Invalid operator!");
	        break;
	    }

	    input.close();

	}

}
