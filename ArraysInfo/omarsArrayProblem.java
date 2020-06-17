public class omarsArrayProblem
{
	public static void main(String [] args){
		int [] grades = {9, 9, 4, 13, 34, 21, 3, 41, 94, 1};
		
		//replacing an array element
		grades [1] = 900;

		try{
			System.out.println(grades[10]);
		}

		catch(Exception e)
		{
			System.out.println(e);
		}

	}


}
