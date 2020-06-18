package com.omarbelkady;

public class Math{
	public static void main(String [] args)
	{
		//the round method in the math class is overloaded depending on the input
		//if I input a float it returns a double
		//if I input a double it returns a long
		int result = Math.round(1.1F);
		int result2= (int)Math.ceil(1.1F);
		//result2 operation performs a ceiling to the value meaning round it up
    		System.out.println(result);
	}

}
