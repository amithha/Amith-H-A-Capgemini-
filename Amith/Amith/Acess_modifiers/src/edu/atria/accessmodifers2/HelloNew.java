// Java program to illustrate error while  using class from different package with  default modifier 

package edu.atria.accessmodifers2;
import edu.atria.accessmodifers.*;
public class HelloNew {
	public static void main(String args[]) 
    { 
        // Accessing class Hello from package p1 
        Hello obj = new Hello(); 
 
        obj.display(); 
    } 
} 


