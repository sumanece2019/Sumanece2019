package AccessModifierPack1;

public class SubClassFinalClass 
//extends FinalClass //Compile Time Error: The type SubClassFinalClass cannot subclass the final class FinalClass
extends Class1
{
	/*
	//Compile Time Error:Cannot override the final method from Class1
	final void Class1_Final_Method() { 
        System.out.println("In CLASS1 FINAL METHOD");
    }
    */
	
	public static void main(String[] args) {
		
		Class1 c = new Class1();
		
		//c.Class1_Final = "Changed";//Compile Time Error: The final field Class1.Class1_Final cannot be assigned
		
		c.Class1_Final_Method();
		
	}

}
