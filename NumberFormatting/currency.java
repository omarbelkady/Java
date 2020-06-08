package com.omarbelkady;

import java.text.NumberFormat;

public class Main{
	public static void main(String [] args)
		{
        NumberFocmat currency = NumberFormat.getCurrencyInstance();
        //method for formatting currency
        String result = currency.format(1234567.891);
        System.out.println(result);
        #NumberFormat percentage = NumberFormat.getPercentInstance();
        #String result2= percentage.format(0.123);
        #shorter way to do it
        String result2=  NumberFormat.getPercentInstance().format(number:0.123);
        System.out.println(result2);
    }
}

