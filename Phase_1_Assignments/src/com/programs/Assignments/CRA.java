/*
     21. Write a program to read, write, and append a file 
 */

package com.programs.Assignments;

import java.io.*;
public class CRA 
{
	public static void main (String[] args) throws IOException
	{	
		@SuppressWarnings("unused")
		
		FileWriter file = new FileWriter("D://Assisted Practice qs Phase1/Writer.txt" ,true);
		BufferedWriter Bw= new BufferedWriter(file);
		Bw.write("Is my contry");
		@SuppressWarnings("resource")
		BufferedReader Br = new BufferedReader(new FileReader ("D://Assisted Practice qs Phase1/Writer.txt"));
		Bw.newLine();
		Bw.close();
		Br.read();
		file.close();
	}

}
