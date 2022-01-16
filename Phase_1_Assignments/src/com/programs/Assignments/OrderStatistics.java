/*
   23. Write a program to demonstrate order statistics.
 */

package com.programs.Assignments;

class NthSmallst 
	{ 
	 int nthSmallest(int arr[], int l, int r, int n) 
	    { 
	         if (n> 0 && n<=r-l + 1) 
	           { 
	              int pos = randomPartition(arr, l, r); 
	              if (pos-l == n-1) 
	                return arr[pos]; 
	            	 if (pos-l > n-1) 
	                   return nthSmallest(arr, l, pos-1, n); 
	            	   return nthSmallest(arr, pos+1, r, n-pos+l-1); 
	           } 
	              return Integer.MAX_VALUE; 
	    } 
	    void swap(int arr[], int i, int j) 
	    { 
	        int temp = arr[i]; 
	        arr[i] = arr[j]; 
	        arr[j] = temp; 
	    } 
	    int partition(int arr[], int l, int r) 
	    { 
	        int x = arr[r], i = l; 
	        for (int j=l; j<=r - 1; j++) 
	        { 
	            if (arr[j]<=x) 
	            { 
	                swap(arr, i, j); 
	                i++; 
	            } 
	        } 
	        swap(arr, i, r); 
	        return i; 
	    } 
	    int randomPartition(int arr[], int l, int r) 
	    { 
	        int k = r-l+1; 
	        int pivot = (int)(Math.random()) * (k-1); 
	        swap(arr, l + pivot, r); 
	        return partition(arr, l, r); 
	    } 
	}  
public class OrderStatistics
{
		public static void main(String[] args) 
		{
			NthSmallst ob = new NthSmallst(); 
	        int arr[] = {2, 8, 5, 6, 9, 25, 50}; 
	        int k = arr.length,n = 4; 
	        System.out.println("N'th smallest element is "+ ob.nthSmallest(arr, 0, k-1, n)); 
	    }

}
