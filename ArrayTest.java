package com.domainName
import java.utils.Arrays
//the utils.Arrays library implementation is used to be able to use array functions in java
	
public class ArrayTest{
	public static void main(String [] args)
	{
		//old fashioned way array declaration always we must use the new keyword
		int [] numbers= new int [5];
		numbers[0]= 1;
		numbers[1]=2;
		Arrays.sort(numbers);
		//To print the actual items within the array I must import the java.utils.Arrays library.
		//Arrays.toString(numbers)//prints the string representation of the array
		//System.out.println(numbers)//prints the address of the object in memory
		System.out.println(Arrays.toString(numbers));
		

		//new trend to declare arrays
		int [] numbers= {2,3,5,1,4};
	}
}
