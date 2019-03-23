package thisConcept;

public class EmployeeData2 extends EmployeeData {
	
	private int salary;
	private int bonus;
	private String grade;
	String BaseLocation = "Kolkata";
	
	//A subclass inherits all the members (fields, methods, and nested classes) from its superclass.
	//Constructors are not members, so they are not inherited by subclasses
	//but the constructor of the superclass can be invoked from the subclass
	//This is called as constructor chaining 
	
	EmployeeData2 (int salary,int bonus)
	{
		this.setSalary(salary);
		this.setBonus(bonus);
	}
	
	EmployeeData2 (int salary,int bonus,String grade)
	{
		//Call to this() must be the first statement in constructor.
		this(salary,bonus);//reusing constructor
		this.setGrade(grade);
		
	}
	
	EmployeeData2(int ssn,String empName,int empAge,int salary,int bonus,String grade)
	{
		
		this(salary,bonus,grade);//Constructor call must be the first statement in a constructor
		this.setEmpAge(empAge);
		this.setEmpName(empName);
		this.setSsn(ssn);
		
	}
	
	EmployeeData2(int ssn,String empName,int empAge,EmployeeData2 Obj)
	{
		
		this(Obj.getSalary(),Obj.getBonus(),Obj.getGrade());
		this.setEmpAge(empAge);
		this.setEmpName(empName);
		this.setSsn(ssn);
		
	}
	
	EmployeeData2(EmployeeData Obj_parent,EmployeeData2 Obj)
	{
		
		this(Obj.getSalary(),Obj.getBonus(),Obj.getGrade());
		this.setEmpAge(Obj_parent.getEmpAge());
		this.setEmpName(Obj_parent.getEmpName());
		this.setSsn(Obj_parent.getSsn());
		
	}
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	void display()
	{
		super.display();
		System.out.println("Employee Salary:"+getSalary());
		System.out.println("Employee Bonus:"+getBonus());
		System.out.println("Employee Grade:"+getGrade());
		
	}
	

}
