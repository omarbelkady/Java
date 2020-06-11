### The final keyword placed in front of a variable is treated as a constant
### When a datatype of type short is declared It will allocate 2 bytes of memory for the variable.
### Then it will find a different memory location and try to allocate memory for the
### another variable which we do not the know the name and this function is anonymous.
### This process is called implicit casting it is also referred to as automatic conversion.
### Whenever we have a value that can be converted to a bigger data type,
### casting will take place implicitly or automatically. Therefore byte can be converted to short
### and then a short can be automatically converted to an int. Then an int can easily be converted to a long
### Let us look at the the following code. We are going to cast a decimal(double) to an int. This process is called explicit casting. Casting takes place only with compatible type like we cannot cast a string to a number.
### In Line 4 we casted a String to an Integer.
public class Main{
	public static void main(String [] args)
	{
		String x= “1”;
		Integer.parseInt(x)+2;
    String d= “4.1”;			//Float/double/String/Short/char.parseFloat/parseDouble/parseString/parseShort/parseChar
    double n = Double.parseDouble(d)+2;
		System.out.println(n);
	}
}

