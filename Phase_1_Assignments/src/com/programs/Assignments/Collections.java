/*
    6. Write a Program to demonstrate the uses of collection types.
 */


package com.programs.Assignments;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class Collections 
{
	public static void main(String[] args) 
	{
		HashSet<String> hs=new HashSet<String>();
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		TreeSet<String> ts=new TreeSet<String>();
		
		//-------------HashSet----------------//
		
		hs.add("apple");
		hs.add("banana");
		hs.add("mango");
		hs.add("pinapple");
		hs.add("grapes");
		hs.add("custard apple");
		hs.add("watermelon");
		hs.add("orange");
		
		hs.remove("custard apple");
		hs.remove("watermelon");
		
		hs.add("kiwi");
		hs.add("cherry");
		hs.add("guava");
		
		
		System.out.println("Hashset is "+hs);
		System.out.println("Size of Hashset is "+ hs.size());
		
		System.out.println("Does hashset contains  'orange' fruit  " + hs.contains("orange"));		
		System.out.println("is hashset fruit collection is empty  " + hs.isEmpty());
		System.out.println("remove the fruit 'custard apple' "+hs.remove("custard apple"));
		System.out.println("remove the fruit 'watermelon' "+hs.remove("watermelon"));
		
		
	    hs.clear();
	    System.out.println("get class  " +hs.getClass());
		
	    System.out.println("is hashset empty  " +hs.isEmpty());

	    
	    //--------------LinkedHashSet---------------//
	    
	    lhs.add("apple");
		lhs.add("banana");
		lhs.add("mango");
		lhs.add("pinapple");
		lhs.add("grapes");
		lhs.add("custard apple");
		lhs.add("watermelon");
		lhs.add("orange");
		
		lhs.remove("custard apple");
		lhs.remove("watermelon");
		
		lhs.add("kiwi");
		lhs.add("cherry");
		lhs.add("guava");
		
		System.out.println("LinkedHashset is "+lhs);
		System.out.println("Size of LinkedHashset is "+ lhs.size());
		
		System.out.println("Does linkedhashset contains  'orange' fruit  " + lhs.contains("orange"));		
		System.out.println("is linkedhashset fruit collection is empty  " + lhs.isEmpty());
		System.out.println("remove the fruit 'custard apple' "+lhs.remove("custard apple"));
		System.out.println("remove the fruit 'watermelon' "+lhs.remove("watermelon"));
		
		
	    lhs.clear();
	    System.out.println("get class  " +lhs.getClass());
		
	    System.out.println("is hashset empty  " +lhs.isEmpty());
	    
	    
	    
	    //------------TreeSet-----------//
	    
	    ts.add("apple");
		ts.add("banana");
		ts.add("mango");
		ts.add("pinapple");
		ts.add("grapes");
		ts.add("custard apple");
		ts.add("watermelon");
		ts.add("orange");
		
		ts.remove("custard apple");
		ts.remove("watermelon");
		
		ts.add("kiwi");
		ts.add("cherry");
		ts.add("guava");
	        
	    System.out.println("Treeset is "+ts);
		System.out.println("Size of Treeset is "+ ts.size());
		
		System.out.println("Does treeset contains  'orange' fruit  " + ts.contains("orange"));		
		System.out.println("is treeset fruit collection is empty  " + ts.isEmpty());
		System.out.println("remove the fruit 'custard apple' "+ts.remove("custard apple"));
		System.out.println("remove the fruit 'watermelon' "+ts.remove("watermelon"));
		
		
	    ts.clear();
	    System.out.println("get class  " +ts.getClass());
		
	    System.out.println("is treeset empty  " +ts.isEmpty());
	    		
	}

	public static List<String> emptyList() {
		// TODO Auto-generated method stub
		return null;
	}
}
