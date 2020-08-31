public class EncapsulateThis{
	private String fullName;
	private int SSN;
	private int BankAccountNum;

	public int getBanAccNum()
	{
		return BankAccountNum;
	}

	public String getTheName()
	{
		return fullName;
	}

	public int getSSN()
	{
		return SSN;
	}

	public void setTheName(String AName)
	{
		fullName=AName;
	}

	public void setSSN(int aSSN)
	{
		SSN=aSSN;
	}

	public void setBankAccountNum(int bankAcctNum)
	{
		BankAccountNum=bankAcctNum;
	}

}
