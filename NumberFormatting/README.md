### Number Formatting thanks to Nelan
```java
import java.util.*;
public class Omar{
	public static main void(String [] args){
		Scanner in = new Scanner(System.in);
		System.out.print("enter double");
		double d = in.nextDouble(); //doubles
		System.out.print("enter int");
		int i = in.nextInt(); //ints

		System.out.print("enter text");
		String text = in.next(); //gets a string up to the first space
		in.nextLine();
		System.out.print("enter text w/ spaces");
		String line = in.nextLine(); //gets a string up to the first space

		System.out.println(d);
		System.out.println(i);
		System.out.println(text);
		System.out.println(line);
		in.close();

		System.out.println(new DecimalFormat("#.###").format(4.567346344634));
	}
}
```
