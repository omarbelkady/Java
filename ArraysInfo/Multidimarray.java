	
public class Multidimarray
{
	static void log(Object o) {System.out.print(o);}
	static void logLn(Object o) {System.out.println(o);}
	public static void main(String [] args)
	{
		
		//Multidimensional Array Declaration 2 rows by 3 columns
		int [][] funNumsPart2= {{1,2,3},{4,5,6}};
		print(funNumsPart2);
		
	}
	public static void print(int [][] arr)
	{
		for (int[] row: arr)
		{
			for (int col: row)
			{
				log(col+" ");
			}
			logLn(" ");
		}
	}
}
