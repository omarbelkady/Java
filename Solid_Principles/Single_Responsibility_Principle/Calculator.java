public class Calculator{
	
	private int x;
	private int y;

	public Calculator(int x, int y){
		//making a copy of the private vars in my constructor
		this.x=x;
		this.y=y;
	}
	//I am violating the single responsibility rule here because I am not only 
	//calculating the sum I am also outputting the sum
	//So I comment out sum definition and sum output
	public int sum(){
		//int sum = x+y;
		//System.out.println(sum);
		return x+y;
	}

	public int subtraction(){
		return x - y;
	}

	public int multiply(){
		return x*y;
	}

	//The above class(Calculator) doesn't violate the single responsible
	//principle because we want every class to take care of one thing
	//and here my class as you can see takes on one responsibility.
	//
	//
	//
	/*Ways Of telling if we are violating the principle
		1- There are two layers of architecture present in the same class
		2- the number of public methods within my class
		3- The methods which each class field uses
		4- Number of imports
		5- It is hard for us to unit test the class
	*/
}
