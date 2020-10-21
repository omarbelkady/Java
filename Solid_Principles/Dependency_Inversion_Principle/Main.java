public class Main{
	public static void main(String [] args){
		Car car= new Car();

		Truck truck = new Truck();	

		//I need to pass in an argument or parameter
		//to the constructor of the race
		//I pass the car parameter into the constructor of the race
		Race firstRace = new Race(car);
		//If I pass Truck here as a parameter it will no longer work because
		//what inside the Race constructor is a car
		firstRace.start();

		//Now I can pass to the Race Constructor a car
		//or a Truck or I can create a second race to initiate
		//the second race
		
		Race secondRace = newRace(truck);
		secondRace.start();

		//Above is how to avoid the dependency inversion principle

	}
}
