package AccessModifierPack1;

public class Class1 {
	
	String Class1_Default = "CLASS1-DEFAULT";
	private String Class1_Private = "CLASS1-PRIVATE";
	protected String Class1_Protected = "CLASS1-PROTECTED";
	public String Class1_Public = "CLASS1-PUBLIC";
	final String Class1_Final = "CLASS1-FINAL";
	public final String Class1_Final_Blank;
	static final String Class1_Static_Final;
	static String Class1_Static;
	
	//CONSTRUCTOR TO INITIALIZE BLANK FINAL VARIABLE
	public Class1 ()
	{
		//Initialize blank final variable only within constructor 
		Class1_Final_Blank = "CLASSS1 FINAL BLANK";	
	}
	
	//STATIC BLOCK TO INITIALIZE STATIC BLANK VARIABLE
	//STATIC BLOCK IS EXECUTED BEFORE MAIN METHOD AT THE TIME OF CLASS LOADING
	static
	{ 
		Class1_Static_Final="CLASS1-STATIC-FINAL";
		System.out.println("IN STATIC BLOCK");
		
	} 
	
	void Class1_Default_Method() {
        System.out.println("In CLASS1 DEFAULT METHOD");
    }
	
	
	private void Class1_Private_Method() {
        System.out.println("In CLASS1 PRIVATE METHOD");
    }
	
	protected void Class1_Protected_Method() {
        System.out.println("In CLASS1 PROTECTED METHOD");
    }
	
	public void Class1_Public_Method() {
        System.out.println("In CLASS1 PUBLIC METHOD");
    }
	
	final void Class1_Final_Method() {
        System.out.println("In CLASS1 FINAL METHOD");
    }
	
	
	//FINAL PARAMETER EXAMPLE
	public void Class1_Final_Param(final int val)
	{
		//val = val+2;//Compile time error: The final local variable val cannot be assigned. It must be blank and not using a compound assignment
		System.out.println("CLASS1 FINAL PARAMETER EXAMPLE:"+val);
		
		
	}
	
	static void Class1_Static_Method() {
        System.out.println("In CLASS1 STATIC METHOD");
        
        //System.out.println(Class1_Private);//Compiler Error: Cannot make a static reference to the non-static field Class1_Private
      	//System.out.println(Class1_Default);//Compiler Error: Cannot make a static reference to the non-static field Class1_Default
      	//System.out.println(Class1_Protected);//Compiler Error: Cannot make a static reference to the non-static field Class1_Protected
      	//System.out.println(Class1_Public);//Compiler Error: Cannot make a static reference to the non-static field Class1_Public
      	System.out.println(Class1_Static);
      	
      	//Class1_Public_Method();////Compiler Error: Cannot make a static reference to the non-static method Class1_Public_Method() from the type Class1
      		
    }
	
	public static void main(String[] args) {
		
		Class1 c = new Class1();
		System.out.println(c.Class1_Private);
		c.Class1_Private_Method();
		
	}
	
	//main() METHOD OVERLOADING
	
	public static void main(float f) {
		
		System.out.println("Call in Class1 main() method with Float parameter"+f);
		
	}
	
    public static int main(int i) {
		
		System.out.println("Call in Class1 main() method with int parameter:"+i);
		return i*i;
		
	}
    
    public static void main(double d) {
		
		System.out.println("Call in Class1 main() method with Double parameter"+d);
		
	}
       
	
}
