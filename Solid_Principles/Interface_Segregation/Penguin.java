public class Penguin implements IBird, ISwimmerBird{
	
	@Override
	public void eat()
	{
		System.out.println("The Penguin is eating");	
	}

	//The penguin does not run
	//@Override
	//public void run()
//	{
	
//	}

	//I am now segregating
	@Override
	public void swim(){
		System.out.println("The Penguin is swimming");
	}

}
