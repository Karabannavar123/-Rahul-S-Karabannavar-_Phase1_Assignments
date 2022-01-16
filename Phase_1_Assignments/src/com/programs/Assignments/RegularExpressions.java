/*
     10. Write a program  to search a specific string from the given set of  strings using regular expressions.
 */

package com.programs.Assignments;

import java.util.regex.Pattern;

public class RegularExpressions 
{
	public static void main(String args[]) 
    { 
        System.out.println (Pattern.matches("hello*world", "helloworld"));  
        System.out.println (Pattern.matches("h*hello*", "hellowor")); 
        
        
        //------------------------------------PATTERN SEARCHING------------------------------------//
        System.out.println(Pattern.matches(".h", "hw")); 
        System.out.println(Pattern.matches(".h", "or"));
        System.out.println(Pattern.matches("[hel]", "hewo"));
        
        
        //------------------------------------QUANTIFIER------------------------------------------//
        System.out.println("? quantifier ....");  
        System.out.println(Pattern.matches("[old]?", "d"));
        System.out.println(Pattern.matches("[llo]?", "lll"));
       
        System.out.println("+ quantifier ....");  
        System.out.println(Pattern.matches("[hel]+", "helllow")); 
        System.out.println(Pattern.matches("[oll]+", "wwoorld"));
          
        System.out.println("* quantifier ....");  
        System.out.println(Pattern.matches("[oord]*", "world")); 
         
               
        //------------------------------------META-CHARACTER------------------------------------------// 
        System.out.println(Pattern.matches("\\d", "hell")); 
        System.out.println(Pattern.matches("\\d", "4")); 
        
          
        System.out.println("metacharacters D....");  //D means non-digit  
        System.out.println(Pattern.matches("\\D", "wld"));
        System.out.println(Pattern.matches("\\D", "1"));  
        
        System.out.println("metacharacters D with quantifier....");  
        System.out.println(Pattern.matches("\\D*", "rew"));
        
   } 

}
