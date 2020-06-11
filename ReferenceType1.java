package com.omarbelkady;
	
	import java.util.Date;
	
	{
		public class Main{
			public static void main(String [] args)
			{
				byte age=35;
				//a=primitive type n=reference type
        //now we will initialize a reference type
				//we will use the new keyword to allocate memory
				//for the new variable. When we use primitive type no need
				//to allocate memory manually since it is performed by the 
        //JRE.However when we use reference type we have to 
        //allocate memory
				Date now = new Date();
				//this now variable is an instance of the date class
				//the dot operator is used to access all the members
				//of the class
				//when using primitive types and we use the dot operator
				//there will be code snippets generated
				//however for reference types we are given the members of the 
				//variable
				System.out.println("now: "+now);
				
			}

		}
	}
