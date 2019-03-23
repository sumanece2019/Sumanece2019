package thisConcept;

public class EmployeeData_Main {

	public static void main(String[] args) {
				
			EmployeeData emp1 = new EmployeeData();
			emp1.setEmpName("Suman");
			emp1.setEmpAge(33);
			emp1.setSsn(123456);
			//emp.ssn = 1;//This will give complier error as "ssn" is a private member
			
			System.out.println("Employee Name:"+emp1.getEmpName());
			System.out.println("Employee Age:"+emp1.getEmpAge());
			System.out.println("Employee SSN:"+emp1.getSsn());
			
			emp1.Auto_Call_this_Ex();
			
			System.out.println("----------------");
			
			EmployeeData emp2 = new EmployeeData();
			emp2.setEmpName("Ria");
			emp2.setEmpAge(26);
			emp2.setSsn(654321);
			
			System.out.println("Employee Name:"+emp2.getEmpName());
			System.out.println("Employee Age:"+emp2.getEmpAge());
			System.out.println("Employee SSN:"+emp2.getSsn());
			
			System.out.println("----------------");
			
			EmployeeData emp3 = new EmployeeData(55555,"Palash",31);
			emp3.display();
			
			System.out.println("----------------");
			
			EmployeeData2 emp4 = new EmployeeData2(1111,"Saheli",27,45000,999,"ASSOCIATE");
			emp4.display();
			
			//dynamic/runtime polymorphism:
			//child class object can be referred by parent class reference var
			//Only overridden methods are accessible via class Interface var
			System.out.println("-------OBJECT REF VARIABLE OF SUPER CLASS & OBJECT OF SUB CLASS---------");
			EmployeeData emp5 = new EmployeeData2(2222,"Akash",20,8000,700,"PA");
			emp5.display();
			
			//Runtime polymorphism can't be achieved by data members.
			//Since we are accessing the data member which is not overridden, 
			//hence it will access the data member of Parent class always.
			
			System.out.println("Base Location of emp5:"+emp5.BaseLocation);
			
			System.out.println("----------------");
			
			EmployeeData2 emp6 = new EmployeeData2(3333,"Shyama",63,emp4);
			emp6.display();
			
			System.out.println("----------------");
			
			EmployeeData2 emp7 = new EmployeeData2(emp1,emp6);
			emp7.display();
			System.out.println("Base Location of emp7:"+emp7.BaseLocation);
			
	}

}
