package com.program.Assignment18;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class CreateFile 
	{
	    public static void main(String[] args) throws IOException
	    {
	        createFileUsingFileClass();
	        createFileUsingFileOutputStreamClass();
	        createFileIn_NIO();
	    }
	 
	    private static void createFileUsingFileClass() throws IOException
	    {
	          File file = new File("D://Assisted Practice qs Phase1/Writer.txt");
	  
	          //Create the file
	          if (file.createNewFile()){
	            System.out.println("File is created!");
	          }else{
	            System.out.println("File already exists.");
	          }
	           
	          //Write Content
	          FileWriter writer = new FileWriter(file);
	          writer.write("Test data");
	          writer.close();
	    }
	 
	    private static void createFileUsingFileOutputStreamClass() throws IOException
	    {
	        String data = "Test data";
	        FileOutputStream out = new FileOutputStream("D://Assisted Practice qs Phase1/Writer.txt");
	        out.write(data.getBytes());
	        out.close();
	    }
	 
	    private static void createFileIn_NIO()  throws IOException
	    {
	        String data = "Test data";
	        Files.write(Paths.get("D://Assisted Practice qs Phase1/Writer.txt"), data.getBytes());
	        List<String> lines = Arrays.asList("1st line", "2nd line");
	       Files.write(Paths.get("file6.txt"),
	                    lines,
	                    StandardCharsets.UTF_8,
	                    StandardOpenOption.CREATE,
	                    StandardOpenOption.APPEND);
	    }

}
