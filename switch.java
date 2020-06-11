package com.omarbelkady;

public class Main
{
	public static void main(String[] args) 
  {
		String role= "admin";
		
      switch(role)
      {

          case "admin”:
          {
             System.out.println(“Hello Sir”);
             break;
          }

          case "moderator":
          {
            System.out.println("Hello Moderator");
            break;
          }

          default:
          {
            System.out.println(“You are a guest”);
          }
      }
  }

}

