package AbstractionConcept;

public class HDFCBank extends Bank{

	HDFCBank()
	{
		System.out.println("HDFC OBJECT CREATED");
	}
	
	public boolean loan(int a)
	{
		System.out.println("HDFC----Loan Method:"+a);
		return true;
	}
	
	
	public void funds()
	{
		System.out.println("HDFC----Funds");
	}
	
	
}
