package com.omarbelkady;

import java.util.Scanner;

public class Main{
	public static void main(String [] args)
	{
		//Creating a scanner object. The parameters we pass in, specifies where we 
    //will read user input from: terminal window/file
    //Terminal window: System.in
    //File
		Scanner scanner= new Scanner(System.in);
		System.out.print(“Age:  ”);
		//byte age= scanner.nextByte();
		//To read a string
		String age=scanner.next();
		System.out.println(“Welcome: ”);
		String name=scanner.nextLine().trim();
    System.out.println(“How is it going? ” + name);
    //Anytime I write to the console next it reads the next token
    //Say I write for name input Omar Belkady it will say Hi Omar
    //Not Hi Omar Belkady because the next method reads one token at a time
    //To read Omar Belkady we use the method nextLine

	}
