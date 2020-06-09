package com.omarbelkady;
import java.utils.Arrays
	
public class MultidimArrs{
	public static void main(String [] args)
	{
		//new trend to declare arrays
		int [] numbers= {};
		numbers[0]= 1;
		numbers[1]=2;
    
		//declaring an Array
		int [] numbers= {2,3,5,1,4};
    
		Arrays.sort(numbers); {1,2,3,4,5}
		//To print the actual items within the array I must import the java.utils.Arrays library.
		//Arrays.toString(numbers)//prints the string representation of the array
		//System.out.println(numbers)//prints the address of the object in memory
		System.out.println(Arrays.toString(numbers));
		
    		//Multidimensional Array Declaration 2 rows by 3 columns
		int [][] funNumsPart2= new int[2][3];
		
    		//set the value of the matrix in the 2nd row 2nd column to 3
		funNumsPart2[1][1]=3;
		System.out.println(Arrays.deepToString(numbers));
	}
}
