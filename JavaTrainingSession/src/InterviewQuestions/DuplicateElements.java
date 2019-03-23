package InterviewQuestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		
		String names[] = {"Ria","Java","JavaScript","Ruby","C","Ria","Python","Java","Ruby"};
		
		//1. Compare each element Time Complexity is 0(nxn) -- worst solution
		for (int i=0;i<names.length;i++)
		{
			
			for (int j=i+1;j<names.length;j++)
			{
				
				 if (names[i].equals(names[j]))
				 {
					 System.out.println("Duplicate element of:"+names[i]+" in position ["+j+"]:"+names[j]);
				 }
				
			}
				
			
		}
		
		System.out.println("------------------HASH SET---------------");
		
		//2. using Hashset: Java collection --> It stores unique values
		//Set is an interface 
		//HashSet is a class which is implementing Set interface
		//Time complexity is 0(n)
        Set<String> store = new HashSet<String>();
		
        for (String name : names)
        {
        	if (store.add(name)==false)
        	{
        		System.out.println("Duplicate element of:"+name+" found");
        	}
        	
        }
        
        System.out.println("------------------HASH MAP---------------");
        
        //3. using HashMap 
        //Map is an interface
        //HashMap is a class which is implementing Map interface
      //Time complexity is 0(2n)
        Map<String, Integer> storeMap = new HashMap<String,Integer>();
        
        for (String name:names)
        {
        	//Integer is a wrapper class. Integer can be used as an argument to a method which requires an object
        	//int is a primitive data type.where as int can be used as an argument to a method which requires an integer value
        	Integer count = storeMap.get(name);
        	if (count== null)
        	{
        		storeMap.put(name,1);
        	}
        	else
        	{
        		storeMap.put(name, ++count);
        	}
        	
        }
        
        //get the values from the HashMap storeMap
        Set<Entry<String,Integer>> entrySet = storeMap.entrySet();
        for (Entry<String,Integer> entry: entrySet)
        {
        	if (entry.getValue()>1)
        	{
        	    System.out.println("Duplicate HashMap value:"+entry.getKey());
        	}
        }
        
        
	}

}
