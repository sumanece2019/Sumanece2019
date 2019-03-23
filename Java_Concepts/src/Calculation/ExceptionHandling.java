package Calculation;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//SUPERCLASS
		//THROWABLE
		//Exception
		//1) Compiletime --> 
        //2) Runtime --> Programmer need to handle at runtime
		
		int x,y,z;
		
		x=10;
		y=0;
		try 
		{
		   z=x/y;
		   System.out.println("Value of Z is: "+z);
		}catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
		System.out.println("Division of 2 nos. have been performed");
	}

}
