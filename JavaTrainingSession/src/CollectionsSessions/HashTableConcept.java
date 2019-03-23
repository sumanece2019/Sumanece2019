package CollectionsSessions;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args) {
		
		//HashTable is similar to HashMap but it's Synchronized(at a time only one thread can access)
		//stores value on the basis of key-value
		//Key --> Object --> HashCode --> value
		//it contains only unique values, doesn't allow any null key or value
		//HashCode is a Java Object 32 bit int no. which is assigned to a object
		//If two objects are same after clone then same hashcode no. will be given to both of them
		//HashTable stores the values on the basis of key
		
		Hashtable ht1 = new Hashtable();
		
		ht1.put(1,"Tom");
		ht1.put(2,"Test");
		ht1.put(3,"Java");
		
		//create a clone/shallow copy
		Hashtable ht2 = new Hashtable();
		
		ht2 = (Hashtable)ht1.clone();
		//ht2 = ht1.clone();//it will throw error
		
		System.out.println("the values from ht1:"+ht1);
		System.out.println("the values from ht2:"+ht2);
		
		ht1.clear();
		
		System.out.println("the values from ht1:"+ht1);
		System.out.println("the values from ht2:"+ht2);
		
		
		//contains value:
		Hashtable st = new Hashtable();
		
		st.put("A", "Naveen");
		st.put("B", "Manager");
		st.put("C", "Selenium");
		
		if(st.containsValue("Manager"))
		{
			System.out.println("Value is found");
		}
		
		//print all the values from hashtable using Enumeration --> elements()
		Enumeration e = st.elements();
		
		System.out.println("-------------");
		
		while (e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		System.out.println("-------------");
		//print all the values from hashtable using entrySet() --> set of hashtable values
		
		Set s = st.entrySet();
		System.out.println(s);
		
		System.out.println("-------------");
		
		//check both hashtables are equal or not
        Hashtable st2 = new Hashtable();
		
		st2.put("A", "Naveen");
		st2.put("B", "Manager");
		st2.put("C", "Selenium1");
		//st2.put(null, "Example");//not allowed,null pointer exception
		//st2.put("D", null);//not allowed,null pointer exception
		
		if(st.equals(st2))
			System.out.println("Both values are equal");
		else
			System.out.println("Both values are not equal");
		System.out.println("-------------");
		
		System.out.println(st2);
		
		System.out.println("-------------");
		
		//get the value from a key:
		System.out.println(st.get("C"));
		System.out.println(st2.get("C"));
		
		//get the hashcode of hashtable object:
		System.out.println("the hashcode value of st"+st.hashCode());
		System.out.println("the hashcode value of st2"+st2.hashCode());
		
		//generics:
		Hashtable <String,String> st3 = new Hashtable <String,String> ();
		
		
	}

}
