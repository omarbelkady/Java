public class Race{
	
	/*
	 * How does a dependency injection work?
	 * I have to inject a variable that needs to  be there 
	 * because the class needs that variable in order to be used. In order for it
	 * to perform its designated task
	 * */
	
	//In order for the race to start I need a car that will be used inside the class
//	private Car car;

	//I change the above private Car car to:
	private IRaceMachine raceMachine;



	//Constructor which I pass the Car as a parameter
//	public Race(Car car){
//		this.car=car;
//	}
//
	
	//Instead Of passing Car Object I pass IRaceMachine interface
	public Race(IRaceMachine raceMachine)
	{
		this.raceMachine=raceMachine;
	}



	//So in order for the race to take place we can no longer pass a longer because
	//it violates the Dependency Inversion Principle
	//I cannot pass the newly created object to the Race constructor
	//I must variate the object into a more abstracted object


	//In a race we do not only have a race of Cars we can have a race of Trucks
	//This violates the dependency inversion principle 
	//because I am forcing the race to take place only with a car
	//How To avoid this is create a interface
	public void start(){

	}
}
