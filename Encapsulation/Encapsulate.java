public class Encapsulate
{
	public static void main(String[] args)
	{
		EncapsulateThis encapsObj = new EncapsulateThis();

		encapsObj.setTheName("Marsha Smith");
		encapsObj.setSSN(422212212);
		encapsObj.setBankAccountNum(23123193);
		System.out.println("Hello There the name is: "+encapsObj.getTheName()+" and her SSN is: "+encapsObj.getSSN()+" and her bank account number is: "+encapsObj.getBanAccNum());
	}
}
