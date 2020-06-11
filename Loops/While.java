package com.omarbelkady;
import java.util.Scanner;


public class Main
{
	public static void main(String[] args) {
	    Scanner scanner= new Scanner(System.in);
	    String input= "";
	    while(!input.equals("quit"))
	    {
	        System.out.print("What do you want to do today?: ");
	        input=scanner.next().toLowerCase();
	    }
	    
	}

}
