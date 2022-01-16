/*
   12. You are given a project to demonstrate and implementation of thread creation mechanism.
 */

package com.programs.Assignments;

public class ThreadMechanism extends Thread 
{
	public void run()
	{  
		  for(int i=1;i<=5;i++)
		  {  
		   try{  
		    Thread.sleep(500);  
		   }
		   catch(Exception e)
		   {
			   System.out.println(e);
		   }  
		  System.out.println(i);  
	}  
}  
		 
		public static void main(String args[])
		{  
			ThreadMechanism t1=new ThreadMechanism ();  
			ThreadMechanism t2=new ThreadMechanism ();  
			ThreadMechanism t3=new ThreadMechanism();  
		 t1.start();  
		 
		 try
		 {  
		  t1.join();  
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }  
		  
		 t2.start();  
		 t3.start();  
		 }  

}
