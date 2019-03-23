package OOPConceptPart1;

public class LocalVsGlobalVariables {

	//Global Variables - Class Variables
	String name = "Tom";
	int age = 25;
	int i = 6;
	
	public static void main(String[] args) {
		
		int i = 10; // local var for main method
		System.out.println(i);
		
		//System.out.println(name); // it will throw error because "name" is a non static field
		//sum(); // it will throw error because "sum()" is a non static field
		//Global non static variable always need to access via Object
		LocalVsGlobalVariables obj = new LocalVsGlobalVariables();
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.i);
		obj.sum();
		
	}

	public void sum()
	{
		int i=10; // local var for sum method
		int j = 20; // local var for sum method
		
		System.out.println(i+j);
		
	}
	
}
