package CollectionsSessions;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {
		
		//HashMap is a class implements Map Interface
		//Extends AbstractMap
		//It contains only unique elements
		//stores values in the form of Key & Value pair
		//It may have one null key & multiple null values
		//it maintains no order
		//Key values can't be shifted after removal of a element
		//hashmap is non-synchronized can be accessed by multiple threads in multi threading env. 
		//Not thread safe as multiple thread can access same HashMap
		//Hence performance will increase
		//Disadv. --> due to multiple threads can access Fail Fast condition
		//Concurrent modification exception means Fail Fast Condition
		//http://javahungry.blogspot.com/2014/04/fail-fast-iterator-vs-fail-safe-iterator-difference-with-example-in-java.html
		//Concurrent HashMap can overcome this issue
		//https://dzone.com/articles/how-concurrenthashmap-works-internally-in-java
		
		HashMap <Integer,String> hm = new HashMap <Integer,String> ();
		
		hm.put(1,"Selenium");
		hm.put(2, "QTP");
		hm.put(3,"TestComplete");
		hm.put(4,"RFT");
		
		System.out.println(hm.get(1));
		
		System.out.println(hm.get(10));
		
		System.out.println(hm);
		
		for(Entry<Integer, String> m: hm.entrySet()) //hm.entrySet() will return the complete set of HashMap 
		{
			System.out.println(m.getKey()+"--->"+m.getValue());
		}
		
		hm.remove(3);
		
		HashMap <Integer,String> hm2 = new HashMap <Integer,String> ();
		
		hm2 = (HashMap<Integer, String>) hm.clone();
		
		System.out.println("hm2 values:"+hm2);
		
		System.out.println("-----------------------------");
		
		for(Entry<Integer, String> m: hm.entrySet()) //hm.entrySet() will return the complete set of HashMap 
		{
			System.out.println(m.getKey()+"--->"+m.getValue());
		}
		
		System.out.println("-----------------------------");
		
		HashMap <Integer,Employee> hm_emp = new HashMap <Integer,Employee> ();
		
		//User defined Employee class objects
		Employee e1 = new Employee("Suman",32,"Testing");
		Employee e2 = new Employee("Ria",26,"Lab");
		Employee e3 = new Employee();
		Employee e4 = new Employee("Deva",40,"Manage");
		
		hm_emp.put(1,e1);
		hm_emp.put(2,e2);
		hm_emp.put(3,e3);
		hm_emp.put(4,e4);
		hm_emp.put(null,e4);//Allowed in Hashmap
		hm_emp.put(null,e2);//overwrite e4 with e2
		//hm_emp.put(8, null);
		
		//Map.Entry is an Interface which is used to traverse through a HashMap
		
		for(Entry<Integer, Employee> m: hm_emp.entrySet()) //hm.entrySet() will return the complete set of HashMap 
		{
			//hm.remove(m.getKey());
			System.out.println(m.getKey()+"--->"+m.getValue().name+"|"+m.getValue().age+"|"+m.getValue().dept);
			
		}
		
		//If two objects are same after clone then same hashcode no. will be given to both of them
		
		System.out.println(e1.hashCode());
		System.out.println(e3.hashCode());
		
		e3 = e1;
		
		System.out.println(e3.hashCode());
		
	}

}
