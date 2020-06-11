//We use reference types to store complex objects such as data objects or mail messages.

//I will declare a primitive type
package com.omarbelkady;
	
import java.awt.*;
	
public class Main{
	public static void main(String [] args)
	{
		byte age=35;
		Date now = new Date();
		System.out.println(“now: ”+now);
		byte x=1;
		byte y=x;
		//x and y are at different memory locations
		x=3;
		System.out.println(y)//prints 1 not 3
	}
}
