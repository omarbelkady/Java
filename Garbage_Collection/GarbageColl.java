public class  GarbageColl{

	String object_name;

	//My Constructor
	public GarbageColl(String object_name){
		this.object_name=object_name;
	}

	//This method is unreachable once Removed
	static void unReachableOnceRemoved()
	{
		//creating An Object
		GarbageColl javaLover = new GarbageColl("javaLover");
		showThis();
	}

	static void showThis()
	{
		//the 2nd object below I created will also becaome unreachable once remove
		GarbageColl assemblyLover = new GarbageColl("assemblyLover");
	}

	public static void main(String [] args)
	{
		//calling the showThis method
		showThis();

		//calling the garbage Collector method on it
		System.gc();
	}

	@Override
	/*Overriding the finalize method to seee which of my objects has been garbage collected*/
	protected void finalize() throws Throwable
	{
		System.out.println(this.object_name + " has been successfully garbage collected and handed to CLovers and PintosLovers");
	}
}
