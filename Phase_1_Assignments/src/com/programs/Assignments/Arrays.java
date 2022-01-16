/*
    9. Write a program to create single dimensional and multidimensional arrays.
 */

package com.programs.Assignments;

public class Arrays {
	
public static void main(String[] args) 
{

	//single-dimensional array
	int a[]= {1,2,3,4,5,6,7,8,9};
	for(int i=0; i<9; i++) 
	{
	System.out.println("Elements of array a: "+a[i]);
	}

	//multidimensional array
	int[][] b = {{5, 10, 15, 20}, {30, 60, 90}};
    System.out.println("\nLength of row 1: " + b[0].length);
    System.out.println("\nLength of row 2: " + b[1].length);
    
	}
}

