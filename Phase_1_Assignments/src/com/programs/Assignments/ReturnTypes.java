/*
   4. Write a program to demonstrate different methods of different types.
*/


package com.programs.Assignments;

public class ReturnTypes 
{
	public static int calculate(int n1, int n2)
    {
  	 int sum;
  	 sum = n1+n2;
  	 return sum;
    }
    public static double calculate(int r, double pi)
    {
  	  double area1;
  	  area1=pi*r*r;
  	  return area1;
    }
    public static double calculate(double l, double w)
    {
  	  double area2;
  	  area2=l*w;
  	  return area2;
    }
    public static void main(String[] args)
    {
  	  int sum;
  	  sum = calculate(10,5);
  	  System.out.println("The sum of n1 & n2 is : " + sum);
  	  
  	  double area1;
  	  area1 = calculate(3.142, 3.0);
  	  System.out.println("The area of circle is : " + area1);
  	  
  	  double area2;
  	  area2 = calculate(5.23, 4.3);
  	  System.out.println("The area of Rectangle is : " + area2);
    }
}
