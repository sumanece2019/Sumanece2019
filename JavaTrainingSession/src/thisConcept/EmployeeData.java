package thisConcept;


public class EmployeeData {

	//Encapsulation is part of OOPS concept
	//Encapsulation is called as data hiding
	//How to implement Encapsulation: 
	//Create private variables : So that these variables can't be accessed directly from outside of class  
	//getter and setter methods: to set and get the values of the fields.These methods will be public
	
	//private data variables
	private int ssn;
	private String empName;
	private int empAge;
	String BaseLocation = "Pune";
	
	EmployeeData ()
	{
		System.out.println("Calling Default Constructor of EmployeeData");
	}
	
	EmployeeData (int ssn,String empName,int empAge)
	{
		this();//Calling default constructor from parameterized constructor
		
		this.setEmpAge(empAge);
		this.setEmpName(empName);
		this.setSsn(ssn);
		
	}
	
	//public getter & setter methods:
	public int getSsn() {
		
		//System.out.println("Value of SSN:"+ssn);
		return ssn;
		
	}

	public void setSsn(int ssn) {
		
		this.ssn = ssn;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	private void Auto_this_Ex ()
	{
		System.out.println("Call to Auto This Example");
	}
	
	public void Auto_Call_this_Ex ()
	{
		Auto_this_Ex();
	}
	
	void display()
	{
		System.out.println("Employee Name:"+getEmpName());
		System.out.println("Employee Age:"+getEmpAge());
		System.out.println("Employee SSN:"+getSsn());
	}
	
	
	
}
