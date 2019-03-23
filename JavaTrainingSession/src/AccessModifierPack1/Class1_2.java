package AccessModifierPack1;

public class Class1_2 {
	
	static
	{ 
		System.out.println("IN STATIC BLOCK of CLASS1_2");
		
	} 

	public static void main(String[] args) {
		
		Class1 c = new Class1();
		
		System.out.println("CALLING CLASS1 FROM NON SUBCLASS OF SAME PACKAGE");
		
		System.out.println("---------------BELOW DIFFERENT ACCESS MODIFIER OF VARIABLES EXAMPLES----------------");
		
		//System.out.println(c.Class1_Private);//Compiler Error: The field Class1.Class1_Private is not visible
		System.out.println(c.Class1_Default);
		System.out.println(c.Class1_Protected);
		System.out.println(c.Class1_Public);
		
		System.out.println("---------------BELOW FINAL VARIABLES EXAMPLES----------------");
		
		System.out.println(c.Class1_Final);
		System.out.println(c.Class1_Final_Blank);
		
		System.out.println("---------------BELOW STATIC VARIABLES EXAMPLES----------------");
		
		System.out.println(c.Class1_Static_Final);//Compile TIme Warning: The static field Class1.Class1_Static_Final should be accessed in a static way
		System.out.println(Class1.Class1_Static_Final);//No warning if we access through Class
		
		System.out.println(c.Class1_Static);//Compile TIme Warning: The static field Class1.Class1_Static should be accessed in a static way
		c.Class1_Static="CLASS1-STATIC";
		System.out.println("Calling by Class1 directly:"+ Class1.Class1_Static);
		
        Class1 c2 = new Class1();
        System.out.println("Calling by C2 object:"+c2.Class1_Static);
		
		System.out.println("---------------BELOW DIFFERENT ACCESS MODIFIER OF METHODS EXAMPLES----------------");
		
		//c.Class1_Private_Method();//Compiler Error: The method Class1_Private_Method() from the type Class1 is not visible
		c.Class1_Default_Method();
		c.Class1_Protected_Method();
		c.Class1_Public_Method();
		
		System.out.println("---------------BELOW FINAL METHODS EXAMPLES----------------");
		
		//c.Class1_Final = "ABC";//Compile Time Error: The final field Class1.Class1_Final cannot be assigned
        c.Class1_Final_Method();
		
        //CALLING METHOD AS EXAMPLE FOR FINAL PARAMETER ARGUMENTS
        c.Class1_Final_Param(10);
        
        System.out.println("---------------BELOW STATIC METHODS EXAMPLES----------------");
        
        c.Class1_Static_Method();
        
        //We can call main method of another class
        c.main(null);//Compile TIme Warning: The static method main(String[]) from the type Class1 should be accessed in a static way
        Class1.main(null);//No warning if we access through Class
        Class1.main(12.33f);
        System.out.println("Return value from Class1 main() method:"+Class1.main(10));
        Class1.main(4.55);
        

        
	}

}
