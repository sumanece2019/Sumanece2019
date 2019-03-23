package OOPConceptPart2;

public class BMW extends Car{ //What is this relationship called? "Has-a Relationship"

	//when same method is present in parent class as well as in child class with the same name
	//and same no. of arguments is called Method-Overriding
	
	public void start() //OVER RIDEN METHOD
	{
		System.out.println("BMW-----Start");
	}
	
	public void theftSafety()
	{
		System.out.println("BMW-----theftSafety");
	}
	
}
