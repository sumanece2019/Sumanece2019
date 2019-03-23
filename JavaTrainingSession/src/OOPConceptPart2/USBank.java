package OOPConceptPart2;

public interface USBank {

	//Properties of Interface:
	//Only method declaration
	//no method body - only method prototype - method will be defined inside implementing class
	//in Interface, we can declare the variables,vars are by default static in nature.No need of declaring vars as static.
	//vars value will not be changed --> Final in nature/Constant
	//No static method allowed in Interface because Interfaces are part of Objects
	//No main method in Interface
	//We can't create the object of Interfaces
	//Interface is abstract in nature --> We can't create object of Reference
	//Default Methods - method body is allowed within Interface --> https://www.journaldev.com/2752/java-8-interface-changes-static-method-default-method
	
	
	int min_bal = 100;//Static & Final value
	
	public void credit();
	
	public void debit();
	
	public void transferMoney();
	
	default void log(String str){
		System.out.println("USBank logging::"+str);
	}
	
}
