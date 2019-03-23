package OOPConceptPart1;

public class StaticAndNonStaticConcept {

	// Global var: the scope will be available across all the functions with some conditions like static or non-static types 
	String name = "Tom"; // non static global variable
	static int age = 25; // static global variable
	
	public static void main(String[] args) {
		
		//how to call static methods and variables?
		//1. direct calling
		sum();
		
		//2. call by class name
		StaticAndNonStaticConcept.sum();
		
		System.out.println(age);
		System.out.println(StaticAndNonStaticConcept.age);
		
		//how to call static methods and variables?
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		obj.sendmail();
		System.out.println(obj.name);
		
		
		//Can I access static methods by using object reference? yes but it will throw warning
		//The static method sum() from the type StaticAndNonStaticConcept should be accessed in a static way
		obj.sum();
		
		//Can I access static var by using object reference? yes but it will throw warning
		System.out.println(obj.age);
		
	}
	
	public void sendmail() // non static method
	{
		System.out.println("send mail method");
	}

	public static void sum() // static method
	{
		System.out.println("Sum method");
	}
	
	
}
