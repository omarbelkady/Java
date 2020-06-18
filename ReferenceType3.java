package com.domainName;
import java.awt.*;
	
public class ReferenceType3{
	public static void main(String [] args)
	{
		System.out.println("now: "+now);
		Point point1= new Point(x:1,y:1);//allocate mem to store the point obj
		Point point 2=point1;//allocate mem to store the point obj reference to the point object in memory
    		byte x=1;
		byte y=x;
		//x and y are at different memory locations
		x=3;
		System.out.println(y)//prints 1 not 3
	}
}
