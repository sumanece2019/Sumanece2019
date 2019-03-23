package OOPConceptPart1;

public class FunctionsInJava {

	// main method --> starting point of execution
	// main method is static and void and never return a value
	//Java compiler will first check whether main method is there or not
	//If main method not found then error: Main method not found in class
	
	public static void main(String[] args) {
		
		FunctionsInJava obj = new FunctionsInJava(); // One object will be created,obj is the reference variable referring to this object 
		
		//after creating the object , the copy of all non static methods will be given to this object
		obj.test();
		System.out.println(obj.pqr());
		System.out.println(obj.qa());
		System.out.println(obj.division(20, 4));
		

	}
	
	// non static methods
	//Function and Method both are same
	
	//void --> doesn't return any value
	public void test() // No input no output
	{
		System.out.println("test method");
	}
	
	// return type is int
	public int pqr() // No input some output
	{
		System.out.println("PQR method");
		int a = 10;
		int b = 20;
		int c = a+b;
		
		return c;
	}
	
	// return type is String
	public String qa() // no input some output
	{
	   System.out.println("qa method");
	   String s = "Selenium";	
	   
	   return s;
	}
	
	//x & y --> input arguments
	// return type is int
	public int division(int x,int y) //some input some output
	{
		System.out.println("division method");
		int z = x/y;
		
		return z;
	}
	
}
