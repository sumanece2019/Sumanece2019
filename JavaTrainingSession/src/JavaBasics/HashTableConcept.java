package JavaBasics;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		
		//HashTable is the class
		//No index concept
		//We have keys instead of index associated with each value
		
		Hashtable h = new Hashtable();
		
		h.put(1, "First");
		h.put("A","Second");
		h.put(3,"Third");
		
		
		System.out.println(h.size());
		System.out.println(h.get(1));
		System.out.println(h.get("A"));
		System.out.println(h.get(450));
		
		Hashtable <Integer,Integer> h2 = new Hashtable <Integer,Integer>();
		
		Hashtable <Integer,String> h3 = new Hashtable <Integer,String>();
		
		Hashtable <String,String> h4 = new Hashtable <String,String>();
		
		Hashtable <Double,String> h5 = new Hashtable <Double,String>();
		
		
		
	}

}
