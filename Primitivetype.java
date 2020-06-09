package com.ramo;


public class Main{
	public static void main(String [] args) 
    	{
		//declaration of variable
		byte age=26;
		long viewsCount=123_456_789L;
		//the l suffix is used to indicate it is a long data type
      		System.out.println(age);
      		//by default a decimal is assumed as a double we need the f
      		//suffix at the end to tell the compiler this is a float
      		float price=10.99f;
      		//we always store a char in between single quotes
      		char letter = 'a';
      		//we store a str in between double quotes
      		String myProperty= "This is my property.";
      		boolean isEligibleForLoan=true;
      		/*
      		Date Type Notes:
		Byte uses 1 byte of memory has a range of: [-128,127]
		bool uses 1 byte of memory and can store two values only: true/false
		Short uses 2 bytes of memory and has a range of: [-32000,32000]
		Integer uses 4 bytes of memory and has a range of: [-2000000000,2000000000]
		float uses 4 bytes of memory
		long uses 8 bytes of memory
		double uses 8 bytes of memory
		String uses 1 bytes of memory and is notated with double quotes(meaning "Ramo"=4 bytes)
		char which stands for character takes up 2 bytes of memory and is notated with single quotes(meaning 'a')
      		*/
	}
}
