package InterviewQuestions;

public class String_Functions {

	//Remove Junk
	public static void RemoveJunk(String str)
	{
		
		//Regular Exp: [^a-zA-Z0-9]
		
		str = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str);
		
	}
	
	//PALINDROM FUNCTION
	public static boolean Palindrom(String str)
	{
		boolean  result= true;
				
        //System.out.println("Length of the string is "+str+" "+str.length());
        
        int len_str=str.length()/2;
        
        	for(int i=0;i<=len_str;i++)
        	{
        		if (str.charAt(i)!=str.charAt(str.length()-1-i))
        		{	
        			result=false;
        			break;
        		}        		
        	}	        		
		
		return result;
		
	}
	
	//REVERSE STRING//
	public static void Reverse_Str(String str)
	{
		
		//the object of the “String” class is immutable.
		//The object of the class “StringBuffer” mutable.
		//String is immutable in Java.
		//An immutable class is simply a class whose instances cannot be modified.
		
		System.out.println("Original Sring :'"+str+"'");
		String rev_str = "";

		/*
		for (int i=str.length()-1;i>=0;i--)
		{
			
			rev_str=(String) (rev_str+str.charAt(i));

		}
		
		System.out.println("Reversed String :'"+rev_str+"'");
		*/
		
		StringBuffer sf = new StringBuffer(str);
		
		System.out.println("Reversed String :'"+sf.reverse()+"'");
		
	}
	
	//ASC SORTING NUMBER ASC
	public static void Asc_Sorting_Int(int arr_src[])
	{
		
		//int arr_sort[] =new int [arr_src.length];
		int var_swap=0;
	    for (int i=1;i<arr_src.length;i++)
	    {
	    	for (int j=0;j<i;j++)
	    	{
	    		
		    	 if (arr_src[i]<arr_src[j])
		    	 { 
		    		 var_swap=arr_src[j];
		    		 arr_src[j]=arr_src[i];
		    		 arr_src[i]=var_swap;
		    	 }	
	    		
	    	}
	     	
	    }
	    
	    System.out.print("Asc Sorted Order : ");
	    for (int i=0;i<arr_src.length;i++)
	    {
	    	
	    	System.out.print(arr_src[i]+" ");
	    	
	    }
		
	}
	
	//DESC SORTING NUMBER ASC
		public static void Desc_Sorting_Int(int arr[])
		{
			/*
			System.out.print("Unsorted values : ");
			for (int i=0;i<arr.length;i++)
			{
			  System.out.print(arr[i]+" ");
			}
			
			*/
			int var_swap=0;
		    for (int i=1;i<arr.length;i++)
		    {
		    	for (int j=0;j<i;j++)
		    	{
		    		
			    	 if (arr[i]>arr[j])
			    	 { 
			    		 var_swap=arr[j];
			    		 arr[j]=arr[i];
			    		 arr[i]=var_swap;
			    	 }	
		    		
		    	}
		     	
		    }
		    
		    System.out.print("Desc Sorted Order : ");
		    for (int i=0;i<arr.length;i++)
		    {
		    	
		    	System.out.print(arr[i]+" ");
		    	
		    }
			
		}

	//MAX NUMBER
	public static void Max_Value(int arr[])
	{
	
        int max_val=arr[0],index=10;
	    
		for (int i=1;i<arr.length;i++)
		{
			
			//System.out.println("Value of index arr["+i+"] is "+arr[i]);
			
			if (arr[i]>max_val) 
			{
				
				max_val=arr[i];
				index=i;
				//System.out.println("\n Max Val is in a["+index+"] "+ max_val);
			}
			
		}	
			
		System.out.print("Max Val is in a["+index+"] "+ max_val);
		
	}
	
	//MIN NUMBER
		public static void Min_Value(int arr[])
		{
		
	        int max_val=arr[0],index=10;
		    
			for (int i=1;i<arr.length;i++)
			{
				
				//System.out.println("Value of index arr["+i+"] is "+arr[i]);
				
				if (arr[i]<max_val) 
				{
					
					max_val=arr[i];
					index=i;
					//System.out.println("\n Max Val is in a["+index+"] "+ max_val);
				}
				
			}	
				
			System.out.print("Min Val is in a["+index+"] "+ max_val);
			
		}

	}

