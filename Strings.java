package com.amneziahookahlounge
	
	
public class Main{
	public static void main(String [] args)
	{
		//Since the variable is a reference type we must use the new operator
		//When we use a reference to a variable we must instantiate the variable with the new operator
    String message= "Hello Guys";
		System.out.println(message.endsWith("!!"));//prints true
		System.out.println(message.startsWith("a"));//prints false

	}
}
