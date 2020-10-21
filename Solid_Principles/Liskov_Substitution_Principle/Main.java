public class Main{
	public static void main(String [] args)
	{
		//Instantiating a Rectangle object	
		Rectangle rectangle = new Rectangle();
		rectangle.setHeight(6);
		rectangle.setWidth(8);

		//Square square = new Square();
		
		/* The code below is not good because I am being redundant
		 *
		 * square.setHeight(6);
		 * square.setWidth(6);
		 * because I created a constructor I am not using the setWidth and setHeight Methods
		 *
		 *
		 * I will comment out the default constructor of Square call and call on the 
		 * custom constructor
		 * */
		Square square=new Square(6);
	}

}
/*Ways to avoid violations:
	Stop inheriting from Rectangle even though a Square is a Rectangle

*/
