package AccessModifierPack2;

import AccessModifierPack1.Class1;

public class SubClass1Pack1 extends Class1 {
	
	/*
	protected String Class1_Protected = "SUBCLASS1PACK1-PROTECTED";
	public String Class1_Public = "SUBCLASS1PACK1-PUBLIC";
	
	protected void Class1_Protected_Method() {
        System.out.println("In SUBCLASS1PACK1 PROTECTED METHOD");
    }
	
	public void Class1_Public_Method() {
        System.out.println("In SUBCLASS1PACK1 PUBLIC METHOD");
    }
    */
		
	public static void main(String[] args) {
		
        Class1 c = new Class1();//Compile time error The type Class1 is not visible if it's not defined as public
		
        System.out.println("CALLING CLASS1 FROM SUBCLASS OF DIFF PACKAGE");
		
		//System.out.println(c.Class1_Private);//Compiler Error: The field Class1.Class1_Private is not visible
		//System.out.println(c.Class1_Default);//Compiler Error: The field Class1.Class1_Default is not visible
		//System.out.println(c.Class1_Protected);//Compiler Error: The field Class1.Class1_Protected is not visible
		System.out.println(c.Class1_Public);
		System.out.println(c.Class1_Final_Blank);
		
		//c.Class1_Private_Method();//Compiler Error: The method Class1_Private_Method() from the type Class1 is not visible
		//c.Class1_Default_Method();//Compiler Error: The method Class1_Default_Method() from the type Class1 is not visible
		//c.Class1_Protected_Method();//Compiler Error: The method Class1_Protected_Method() from the type Class1 is not visible
		c.Class1_Public_Method();
		
		System.out.println("----------------------------------------------");
		System.out.println("CALLING CLASS1 FROM SUBCLASS OF DIFF PACKAGE");
		
		SubClass1Pack1 c2 = new SubClass1Pack1();
		
		//System.out.println(c2.Class1_Private);//Compiler Error: The field Class1.Class1_Private is not visible
		//System.out.println(c2.Class1_Default);//Compiler Error: The field Class1.Class1_Default is not visible
		System.out.println(c2.Class1_Protected);//No Error as The field Class1.Class1_Protected is visible by inheritance
		System.out.println(c2.Class1_Public);
				
		//c2.Class1_Private_Method();//Compiler Error: The method Class1_Private_Method() from the type Class1 is not visible
		//c2.Class1_Default_Method();//Compiler Error: The method Class1_Default_Method() from the type Class1 is not visible
		c2.Class1_Protected_Method();//No Error The method Class1_Protected_Method() from the type Class1  is visible by inheritance 
		c2.Class1_Public_Method();
		

		
	}

}
