package AbstractionConcept;

public interface Car extends Metal,Colour { //An interface can't implement another interface.It has to extend the other interface.

	//Rules of Interface:
	//Contains only static constants and abstract method.
	//no method body - only method declaration
	//Full Abstraction(100%)
	//no need to mention abstract keywords
	//Interface can't be instantiated -- can't create object of Interface
	//An interface can't implement another interface.It has to extend the other interface.
	//Java uses Interface to implement multiple inheritance.Because we can't extend two classes in Java.
	//All methods in an interface are implicitly public and abstract.
	//Only final & static vars
	//Performance wise it's slower than Abstract Class 
	
	int wheels =4;//by default wheels is final & static
	
	//private void start(String str);//Illegal modifier for the interface method start; only public, abstract, default, static and strictfp are permitted
	public void start(String str);
	public void stop();
	public void refuel();
	
	public static void static_Example()
	{
		System.out.println("Car----Static");
	}
	
	//Since Java 8, we can have method body in interface. But we need to make it default method.
	default void I_Method_body_Ex()
	{
		System.out.println("Accessing Default method of Interface");
	}
	
}
