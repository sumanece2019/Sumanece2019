package JavaBasics;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		//ArrayList is a dynamic array
		
		/*
		ArrayList ar = new ArrayList();
		
		ar.add(100);
		ar.add(200);
		ar.add(300);
		
		System.out.println(ar.size());
		
		ar.add("Suman");
		
		System.out.println(ar.size());
		System.out.println(ar);

        ar.add(400);
        ar.add(12.33);
        ar.add('C');
        ar.add("Ria");
        ar.add(1, "A2");
        
		System.out.println(ar.size());
		System.out.println(ar);

		ar.remove(2);
		
		System.out.println(ar.size());
		System.out.println(ar);
		System.out.println("Value at index 3:"+ar.get(3));
		
		//to print all the values of ArrayList: for loop
		for (int i=0;i<ar.size();i++)
		{
			System.out.println("Value at index["+i+"]:"+ar.get(i));
		}
		*/
		
		ArrayList<Integer> ar_int = new  ArrayList<Integer>();
		
		ar_int.add(150);
		//ar_int.add(12.33); This is not possible of Integer ArrayList
		
		ar_int.add(1, 50);
		
		//to print all the values of ArrayList: for loop
		for (int i=0;i<ar_int.size();i++)
		{
			System.out.println("ar_int Value at index["+i+"]:"+ar_int.get(i));
		}
		
		
		ArrayList<String> ar_string = new  ArrayList<String>();
		
		ar_string.add("Hello");
		//ar_string.add(100); This is not possible of String ArrayList
		
		//to print all the values of ArrayList: for loop
		for (int i=0;i<ar_string.size();i++)
		{
			System.out.println("ar_string Value at index["+i+"]:"+ar_string.get(i));
		}
		
		
		ArrayList<Double> ar_double = new ArrayList<Double>();
		
		ArrayList<Boolean> ar_boolean = new ArrayList<Boolean>();
		
		ArrayList<Object> ar_obj = new ArrayList<Object>();
		
	}

}
