package com.omarbelkady;

public class If
{
    public static void main(String[] args) {
      Integer temperature=32;
      if(temperature >30)
      {
          System.out.print("It is a hot day");
          System.out.print(". Drink plenty of water.");
      }
      else if(temperature>20 && temperature<=30)

          System.out.println("It is a cool day");

      else
          System.out.println("It is cold");

    }
}
