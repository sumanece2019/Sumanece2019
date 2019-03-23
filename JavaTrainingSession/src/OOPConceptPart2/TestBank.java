package OOPConceptPart2;

public class TestBank {

	public static void main(String[] args) {
		
		System.out.println(USBank.min_bal);
		//USBank.min_bal=200;//The final field USBank.min_bal cannot be assigned
		
		System.out.println("----------------------");
		
		HSBCBank hs = new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.mutualFund();
		hs.carLoan();
		hs.educationLoan();
		hs.log("HSBC");
		System.out.println("----------------------");
		//dynamic polymorphism:
		//child class object can be referred by parent Interface reference var
		//Only overridden methods are accessible via parent Interface var
		USBank u = new HSBCBank();
		u.credit();
		u.debit();
		u.transferMoney();
	    u.log("HSBC-US");
	
		System.out.println("----------------------");
		BrazilBank b = new HSBCBank();
		b.mutualFund();
		b.log("HSBC2");
	}

}
