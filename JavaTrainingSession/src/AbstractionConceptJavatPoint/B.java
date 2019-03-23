package AbstractionConceptJavatPoint;

public abstract class B implements A,A2{
	
	B()
	{
		System.out.println("Constructor of Abstract Class B");
	}
	
	
	public void a()
	{		
		System.out.println("I am a");
	} 
	
	public void b()
	{		
		System.out.println("I am b");
	} 

	//Abstract class can contain main() method
	public static void main(String[] args) {
		
		System.out.println("In main() method of Abstract Class");
	}
	
}
