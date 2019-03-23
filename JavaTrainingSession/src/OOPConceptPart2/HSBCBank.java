package OOPConceptPart2;

//public class HSBCBank implements USBank {
public class HSBCBank implements USBank,BrazilBank {//We are achieving multiple inheritance here -- also called as "Is-a relationship"
	//"Is-a Relationship" --> Class to Interface Relationship
	//"Has-a Relationship" --> Class to Class Relationship
	//If a class is implementing any interface then it's mandatory to define/override all the methods of Interface. 
	
	//USBank methods
	public void credit() {
		
		System.out.println("hsbc----credit");
		
	}

	
	public void debit() {
		
		System.out.println("hsbc----debit");
		
	}
	
	
    public void transferMoney() {
    	
    	System.out.println("hsbc----transferMoney");
		
	}
    
    //Brazil bank method 
    public void mutualFund() {
    	
    	System.out.println("hsbc----mutualFund");
		
	}
    
    //Own methods of class HSBCBank
    public void educationLoan()
    {
    	System.out.println("hsbc---edu loan");
    }
    
    public void carLoan()
    {
    	System.out.println("hsbc---car loan");
    }


	@Override
	public void log(String str) {
		// TODO Auto-generated method stub
		USBank.super.log(str);
	}

	
}
