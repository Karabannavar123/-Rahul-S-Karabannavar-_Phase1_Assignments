/*
    24. Write a program to demonstrate range queries. 
 */

package com.programs.Assignments;

public class RangeQueries 
{
	static class Query
	{
	    int L, R, X;
	 
	    public Query(int L, int R, int X)
	    {
	        this.L = L;
	        this.R = R;
	        this.X = X;
	    }
	};
	 
	static int max = 100;
	 
	static int []root = new int[max];
	
	static int find(int x)
	{
	    if(x == root[x])
	        return x;
	    else
	        return root[x] = find(root[x]);
	}
	static void uni(int x, int y)
	{
	    int p = find(x), q = find(y);
	    if (p != q)
	    {
	        root[p] = root[q];
	    }
	}
	 
	static void initialize(int a[], int n,
	                       Query q[], int m)
	{
	    for (int i = 0; i < n; i++)
	        root[i] = i;
	
	    for (int i = 1; i < n; i++)
	        if (a[i] == a[i - 1])
	            uni(i, i - 1);
	}
	
	public static void main(String args[])
	{
	    int a[] = { 1, 1, 5, 4, 5 };
	    int n = a.length;
	    Query q[] = { new Query(0, 2, 2 ),
	                  new Query( 1, 4, 1 ),
	                  new Query( 2, 4, 5 ) };
	    int m = q.length;
	    initialize(a, n, q, m);
	 
	    for (int i = 0; i < m; i++)
	    {
	        int flag = 0;
	        int l = q[i].L, r = q[i].R, x = q[i].X;
	        int p = r;
	 
	        while (p >= l)
	        {
	 
	            if (a[p] == x)
	            {
	                flag = 1;
	                break;
	            }
	            p = find(p) - 1;
	        }
	 
	        if (flag != 0)
	            System.out.println(x + " exists between [" +
	                               l + ", " + r + "] ");
	        else
	            System.out.println(x + " does not exist between [" +
	                               l + ", " + r + "] ");
	    }
	}
}
