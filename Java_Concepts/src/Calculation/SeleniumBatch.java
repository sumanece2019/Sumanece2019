package Calculation;

public class SeleniumBatch {
	
	String firstName;
	String lastName;
	int id;
	static int st_count=0;
	//st_count=0;///STATIC VARIABLE CAN'T BE INITIAIZED OUTSIDE METHOD EXCEPT DECLARATION 
	//String firstname,String lastName
	public void getName()
	{
		
		//System.out.println("First Name is :"+firstName);
		//System.out.println("Last Name is :"+lastName);
		System.out.println("Full Name is :"+firstName+" "+lastName);
		System.out.println("Id for Student is :"+id);
		
	}
	
	/*public void setName(String fName,String lName)
	{
		
		firstName=fName;
		lastName=lName;
		
	}*/
	//THIS USAGE
	public void setName(String firstName,String lastName)
	{
		
		this.firstName=firstName;
		this.lastName=lastName;
		
	}
	
	//CONSTRUCTOR 
	SeleniumBatch()
	{
		
		firstName="XXX";
		lastName="YYY";
		st_count++;
		
    }
	
	//CONSTRUCTOR OVERLOADING1
	SeleniumBatch(int id)
	{
	
		 this.id=id;
		 st_count++;
	
	}
	
	//CONSTRUCTOR OVERLOADING2
	SeleniumBatch(String fname,String lname,int i)
		{
		
			 this.firstName=fname;
			 this.lastName=lname;
			 this.id=i;
			 st_count++;
		
		}
	
	public static void main(String[] args) {
		
		SeleniumBatch s1= new SeleniumBatch(1);//---
		//s1.firstName="Suman";
		//s1.lastName="Chakraborty";
		s1.setName("Suman","Chakraborty");
		s1.getName();
		//System.out.println("Id for Student is :"+s1.id);
		SeleniumBatch s2= new SeleniumBatch("Ria","Pal",2);//--
		//s2.setName("Ria","Pal");
		s2.getName();
		SeleniumBatch s3= new SeleniumBatch(3);//--
		s3.setName("Ria2","Pal2");
		s3.getName();
		System.out.println("No. of Students is :"+st_count);
	}

}
