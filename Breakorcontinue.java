/*The break statement terminates the loop and the continue statement restarts at the beginning of the loop*/
package com.omarbelkady;
import java.util.Scanner;


public class Main
{
	public static void main(String[] args) 
	{
	    
	    Scanner scanner= new Scanner( System.in );
	    
	    String input="1";
	    
	    while(true)
	    {
	        System.out.print("Input: ");
	        input=scanner.next().toLowerCase();
	        if(input.equals("pass"))
	            continue;
	        if(input.equals("quit"))
	            break;
	        System.out.println(input);
	    }
	    
	    
	   
	}

}
