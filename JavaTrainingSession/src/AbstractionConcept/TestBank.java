package AbstractionConcept;

public class TestBank {

	public static void main(String[] args) {
		
		HDFCBank hb = new HDFCBank();

		hb.credit();
		hb.debit();
		Boolean status=hb.loan(20);
		System.out.println(status);
		hb.funds();
		
		Bank b = new HDFCBank();//Dynamic Polymorphism
		
		b.credit();
		b.debit();
		b.loan(25);
		
		System.out.println(hb.min_bal);
		//System.out.println(Bank.min_bal);//Not possible because Abstract class can't be instantiated
		
	}

}
