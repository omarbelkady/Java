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

	public int getSNN()
	{
		return SSN;
	}

	private void setTheName(String AName)
	{
		fullName=AName;
	}

	private void setSSN(int aSSN)
	{
		SSN=aSSN;
	}

	private void setBankAccountNum(int bankAcctNum)
	{
		BankAccountNum=bankAcctNum;
	}

}
