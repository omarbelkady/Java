//<---------------------------STEP1:DEFINE THE FIELDS------------------------------>
/*
public class User
{
    public String firstName;
    public String lastName;
}


*/

//<--------STEP2:DEFINE THE METHODS WITH THE APPROPRIATE RETURN TYPE AS A KEYWORD PLACED BEFORE THE NAME AND AFTER THE ACCESS MODIFIER-------->
public class User
{
	public String firstName;
	public String lastName;


	/* The bottom code will error because we declared it as a void meaning
		We do not want anything to be returned to us*/
	/*
	public void output(){
		return "Hi, my name is "+ firstName + " " + lastName + ".";
	}
	*/

	public String output()
	{
		return "Hi, my name is "+ firstName + " " + lastName + ".";
	}
}



