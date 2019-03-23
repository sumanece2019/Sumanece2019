package AbstractionConcept;

public abstract  class Bank {

	//Abstraction means to hide implementation logic
	//Implementation logic will be defined within child classes as per own logic
	//Rules of Abstract Class:
	//Abstract class can't be instantiated -- can't create object of abstract class
	//Through Abstract class we are achieving partial abstraction
	//It should contains at least one method which is abstract in nature
	//It can contain concrete(non abstract) methods along with at least one abstract method
	//What is abstract method? Only method declaration and no method body
	//Performance wise it's faster than Interface
	//We can create Constructor of Abstract Class
	
	int amt = 100;
	final int rate = 10;
	static int loanRate = 5;
	
	Bank()
	{
		System.out.println("Bank Object Created");
	}
	
	public abstract boolean loan(int a); //Only method declaration and no method body
	
	
	
	public void credit()
	{
		System.out.println("Bank----Credit");
	}
	
	public void debit()
	{
		System.out.println("Bank----Debit");
	
	}
	
	int min_bal = 100;//Static & Final value
	
	public static void static_Example()
	{
		System.out.println("Bank----Static");
	}
	
}
