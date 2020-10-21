//I will implement many interfaces here
public class Ostrich implements IBird, IRunnerBird{

	@Override
	public void eat(){
		System.out.println("This Ostrich is eating!");
	}

	@Override
	public void run(){
		System.out.println("The ostrich is running dude");
	}

	//I implement this method but I notice an ostrich does
	//not swim 968 27736259 56837 neither so I can delete
	//@Override
	//public void swim(){

	//}
}
