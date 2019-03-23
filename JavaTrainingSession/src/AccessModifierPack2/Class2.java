package AccessModifierPack2;

import AccessModifierPack1.Class1;

public class Class2 {
	
	public static void main(String[] args) {
		
		Class1 c = new Class1();//Compile time error The type Class1 is not visible if it's not defined as public
		
        System.out.println("CALLING CLASS1 FROM NON SUBCLASS OF DIFF PACKAGE");
		
		//System.out.println(c.Class1_Private);//Compiler Error: The field Class1.Class1_Private is not visible
		//System.out.println(c.Class1_Default);//Compiler Error: The field Class1.Class1_Default is not visible
		//System.out.println(c.Class1_Protected);//Compiler Error: The field Class1.Class1_Protected is not visible
		System.out.println(c.Class1_Public);
		
		//c.Class1_Private_Method();//Compiler Error: The method Class1_Private_Method() from the type Class1 is not visible
		//c.Class1_Default_Method();//Compiler Error: The method Class1_Default_Method() from the type Class1 is not visible
		//c.Class1_Protected_Method();//Compiler Error: The method Class1_Protected_Method() from the type Class1 is not visible
		c.Class1_Public_Method();
		
	}

}
