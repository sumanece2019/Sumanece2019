package JavaBasics;

public class IfElseConcept {

	public static void main(String[] args) {
		
		int a =10,b=20;
 
		if (b>a)
		{
			System.out.println("b is greater than a");
		}
		else {
			System.out.println("a is greater than b");
		}
		
		// comparison operators
		// <
		// >
		// <=
		// >=
		// ==
		// !=
		
		int c =40,d=40;
		
		if (c==d)
		{
			System.out.println("c is equal to d");
		}
		else {
			System.out.println("c is not equal to d");
		}
		
		// write a logic to find highest number
		
		int a1=400,b1=500,c1=300;
		
		//nested if else
		if (a1>b1 & a1>c1) 
		{
			System.out.println("a1 is the greatest");
		}
		else if (b1>c1)
		{
			System.out.println("b1 is the greatest");
		}
		else
		{
			System.out.println("c1 is the greatest");
		}
		
	}

}
