package AccessModifierPack1;

public class SubClass1 extends Class1 {

	public static void main(String[] args) {
		
		Class1 c = new Class1();
		
		System.out.println("CALLING CLASS1 FROM SUBCLASS OF SAME PACKAGE");
		
		//System.out.println(c.Class1_Private);//Compiler Error: The field Class1.Class1_Private is not visible
		System.out.println(c.Class1_Default);
		System.out.println(c.Class1_Protected);
		System.out.println(c.Class1_Public);
		
		//c.Class1_Private_Method();//Compiler Error: The method Class1_Private_Method() from the type Class1 is not visible
		c.Class1_Default_Method();
		c.Class1_Protected_Method();
		c.Class1_Public_Method();
		

	}

}
