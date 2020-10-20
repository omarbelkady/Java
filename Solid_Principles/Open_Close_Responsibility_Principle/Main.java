import java.util.*;

public class Main{
	public static void logLn(Object o)
	{
		System.out.println(o);
	}

	
	public static void log(Object o)
	{
		System.out.print(o);
	}


	public static void main(String [] args){
		//Instantiating the calculator class
		Calculator calculate= new Calculator(256837,746767);
		calculate.sum();
		logLn(calculate.sum());
	}
}
