package com.program.Assignment18;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

import com.programs.Assignments.Collections;

public class ReadFile {
	public static List<String> readFileInList(String fileName) 
	  { 
	  
	    List<String> lines = Collections.emptyList(); 
	    try
	    { 
	      lines = 
	       Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8); 
	    } 
	  
	    catch (IOException e) 
	    { 
	      e.printStackTrace(); 
	    } 
	    return lines; 
	  } 
	  public static void main(String[] args) 
	  { 
	    List l = readFileInList("D://Assisted Practice qs Phase1/Writer.txt"); 
	  
	    Iterator<String> itr = l.iterator(); 
	    while (itr.hasNext()) 
	      System.out.println(itr.next()); 
	  } 

}
