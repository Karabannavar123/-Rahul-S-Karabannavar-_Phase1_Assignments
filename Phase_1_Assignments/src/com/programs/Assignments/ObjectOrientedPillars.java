/*
    19. You are given a project to demonstrate the uses of classes, objects and the object oriented pillars in java.
 */

package com.programs.Assignments;

public class ObjectOrientedPillars 
{
	String name; 
    String breed; 
    int age; 
    String color; 
    public ObjectOrientedPillars(String name, String breed, int age, String color) 
    { 
        this.name = name; 
        this.breed = breed; 
        this.age = age; 
        this.color = color; 
    } 
    public String getName() 
    { 
        return name; 
    } 
    public String getBreed() 
    { 
        return breed; 
    } 
    public int getAge() 
    { 
        return age; 
    } 
    public String getColor() 
    { 
        return color; 
    } 
    @Override
    public String toString() 
    { 
        return("Hi my name is "+ this.getName()+ ".\nMy breed,age and color are: " + this.getBreed()+", " + this.getAge()+ ", and"+ this.getColor() + "."); 
    } 
    public static void main(String[] args) 
    { 
        ObjectOrientedPillars Rahul = new ObjectOrientedPillars("Rahul","papillon", 5, "blue"); 
        System.out.println(Rahul.toString()); 
    } 


}
