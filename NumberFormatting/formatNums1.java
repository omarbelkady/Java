package com.omarbelkady;

import java.text.NumberFormat;

public class Main{
    public static void main(String [] args)
      {
      //Say I want to format 1234567 to $1,234,567
      //Or say I want to output 10% instead of 0.1
      //I create a variable and instantiate it
      //NumberFormat currency = new NumberFormat();
      //The above line of code errors because we cannot instantiate an abstract 
      //class
      //instead we do this and this way of doing this is the factory method
      //A factory method is called this way because we create new objects
      //We store it in a currency variable of type NumberFormat

      NumberFormat currency = NumberFormat.getCurrencyInstance();

      }
}
