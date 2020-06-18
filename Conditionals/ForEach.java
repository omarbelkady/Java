//The break statement terminates the loop and the continue statement restarts at the beginning of the loop
package com.omarbelkady;
import java.util.Scanner;


public class ForEach
{
	public static void main(String[] args) 
	{
	    
	    
	    String [] fruits= {"Apple", "Mango", "Oranges"};
	    
	    //For loop in this context
	    /* for(int i = 0;i<fruits.length;i++)
	    {
	        System.out.println(fruits[i]);
	    }
	    */
	    
	    //For Each
	    //for(datatype item:nameofArray)
	    for(String fruit:fruits)
	        System.out.println(fruit);
	   
	}

}

