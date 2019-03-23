package CollectionsSessions;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		//ArrayList is a Dynamic array
		//can contain duplicate elements
		//inserts value based on ordering
		//it's not synchronized--hence it's slow
		//allow random access to fetch the element
		
		//Non-Generic ArrayList as we didn't define any specific type over here
		ArrayList ar = new ArrayList();

		ar.add(10);
		ar.add(20);
		ar.add(30);
		
		System.out.println(ar.size());
		
		ar.add(40);
		ar.add(40);
		ar.add(50);
		ar.add(12.33);
		ar.add("Test");
		ar.add('a');
		ar.add(true);
		
		System.out.println(ar.size()); //size of ArrayList
		System.out.println(ar); //ArrayList values
		
		System.out.println(ar.get(4)); //to get value from an index
		
		//to print all the values from ArrayList: for loop
		//1. for loop
		//2. using iterator
		
		for (int i=0;i<ar.size();i++)
		{
			System.out.println("value at ["+i+"]:"+ar.get(i));
		}
		
		//non-generic(no specific type) vs generic(specific type of data).
		
		
		//Generic ArrayList in Java
		ArrayList<Integer> ar_int = new ArrayList<Integer>();
		
		ar_int.add(100);
		//ar_int(true); this is not allowed
		
		ArrayList<String> ar_string = new ArrayList<String>();
		
		//ArrayList<E> ar_E = new ArrayList<E>();//<E> when we are not sure what kind of value will be stored
		
		//User defined Employee class objects
		Employee e1 = new Employee("Suman",32,"Testing");
		Employee e2 = new Employee("Ria",26,"Lab");
		Employee e3 = new Employee("Deva",40,"Manage");
		
		ArrayList <Employee> ar_emp = new ArrayList<Employee>();
		ar_emp.add(e1);
		ar_emp.add(e2);
		ar_emp.add(e3);
		
		System.out.println(ar_emp.size());
		
		//iterator to traverse the values	
		Iterator<Employee> it = ar_emp.iterator();
		
		while (it.hasNext())
		{
			Employee emp = it.next();
			System.out.println(emp.name+"|"+emp.age+"|"+emp.dept);
			
		}
		
		
		//addAll() to merge two ArrayList
		ArrayList <String> ar_str1 = new ArrayList <String> ();
		
		ar_str1.add("Java");
		ar_str1.add("C#");
		ar_str1.add("Python");
		
		ArrayList <String> ar_str2 = new ArrayList <String> ();
		
		ar_str2.add("Ruby");
		ar_str2.add("Pearl");
		ar_str2.add("PHP");
		
		ar_str1.addAll(ar_str2);
		
		Iterator <String> it_ar_str = ar_str1.iterator();
		String s;
		
		while(it_ar_str.hasNext())
		{	
			
			s = it_ar_str.next();
			System.out.println(s);
		}
		
	   //removeAll	
		System.out.println("------------------------");
		ar_str1.removeAll(ar_str2);
				
		it_ar_str = ar_str1.iterator();
		
		while(it_ar_str.hasNext())
		{	
			
			s = it_ar_str.next();
			System.out.println(s);
		}
		
		
		//retainAll()
		System.out.println("------------------------");
		
		ar_int.add(200);
		ar_int.add(300);
		
		ArrayList <Integer> ar_int2 = new ArrayList <Integer> ();
		
		ar_int2.add(400);
		ar_int2.add(500);
		ar_int2.add(200);
		
		ar_int.retainAll(ar_int2);
		//ar_int.replaceAll(operator);
		
		for (int i=0;i<ar_int.size();i++)
		{
			System.out.println("value at ["+i+"]:"+ar_int.get(i));
		}
		
	}

}
