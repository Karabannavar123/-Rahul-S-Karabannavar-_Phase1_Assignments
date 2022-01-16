/*
   7. Write a program to demonstrate the uses of map.
 */


package com.programs.Assignments;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {
	public static void main(String[] args) {

		Map<Integer, String> lhm = new LinkedHashMap<Integer, String>();
		Map<Integer, String> tm = new TreeMap<Integer, String>();
		
		
		//-------------LinkedHashMap----------------//
		
		lhm.put(1, new String("apple"));
		lhm.put(2, new String("banana"));
		lhm.put(3, new String("mango"));
		lhm.put(4, new String("pinapple"));
		lhm.put(5, new String("grapes"));
		lhm.put(6, new String("custard apple"));
		lhm.put(7, new String("watermelon"));
		lhm.put(8, new String("orange"));
		
		lhm.remove(4);
		lhm.remove(7);
		
		lhm.put(9, new String("kiwi"));
		lhm.put(10,new String("cherry"));
		lhm.put(11,new String("guava"));
		
		
		System.out.println("LinkedHashmap is "+lhm);
		System.out.println("Size of LinkedHashmap is "+ lhm.size());
		
		for(Integer key: lhm.keySet())
		{
		System.out.println(key  +" : "+ lhm.get(key));
		}
		System.out.println("Does linkedhashmap contains fruit  " + lhm.get(2));	
		System.out.println("Does linkedhashmap contains fruit  " + lhm.get(1));	
		System.out.println("is linkedhashmap fruit collection is empty  " + lhm.isEmpty());
		
		
		
	    lhm.clear();
	    System.out.println("get class  " +lhm.getClass());
		
	    System.out.println("is hashset empty  " +lhm.isEmpty());
	    

	    
	    
	    
	    //------------TreeSet-----------//
	    
	    tm.put(1, new String("apple"));
		tm.put(2, new String("banana"));
		tm.put(3, new String("mango"));
		tm.put(4, new String("pinapple"));
		tm.put(5, new String("grapes"));
		tm.put(6, new String("custard apple"));
		tm.put(7, new String("watermelon"));
		tm.put(8, new String("orange"));
		
		tm.remove(4);
	    tm.remove(7);
		
		tm.put(9, new String("kiwi"));
		tm.put(10,new String("cherry"));
		tm.put(11,new String("guava"));
		
		
		System.out.println("Treemap is "+tm);
		System.out.println("Size of Treemap is "+ tm.size());
		
		for(Integer key: tm.keySet())
		{
		System.out.println(key  +" : "+ tm.get(key));
		}
		System.out.println("Does treemap contains fruit  " + tm.get(2));	
		System.out.println("Does treemap contains fruit  " + tm.get(1));	
		System.out.println("is treemap fruit collection is empty  " + tm.isEmpty());
		
	    tm.clear();
	    System.out.println("get class  " +tm.getClass());
		
	    System.out.println("is treemap empty  " +tm.isEmpty());
		}

}
