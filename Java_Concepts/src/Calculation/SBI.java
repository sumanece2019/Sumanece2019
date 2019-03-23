package Calculation;

public class SBI extends Bank{

	int roi=12;
	
	public void getROI()
	{
		super.getROI();
		System.out.println("SBI Rate of Interest is: "+roi);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//RUNTIME POLYMORPHISM/DYNAMIC BINDING
		Bank obj=new Bank();
		obj.getROI();
		
		System.out.println(obj.roi);
		
		SBI obj1=new SBI();
		obj1.getROI();
		System.out.println(obj1.roi);
		
		Bank obj2= new SBI();
		obj2.getROI();
		
		System.out.println(obj2.roi);//Only Methods can be overriden not variables.
		
		//SBI obj3=(SBI) new Bank();
		//String

	}

}
