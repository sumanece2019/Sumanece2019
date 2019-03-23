package InterviewQuestions;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a1= {100,105,98,101,6};
		int[] a2= {100,105,98,101,6};
		int[] a3= {100,105,98,101,6};
		int[] a4= {100,105,98,101,6};
		
		System.out.print("Input values : ");
		for (int i=0;i<a1.length;i++)
		{
		  System.out.print(a1[i]+" ");
		}
		System.out.println("");
		String_Functions.Asc_Sorting_Int(a1);
		System.out.println("");
		String_Functions.Desc_Sorting_Int(a2);
		System.out.println("");
		String_Functions.Max_Value(a3);
		System.out.println("");
		String_Functions.Min_Value(a4);
		
		/*int a[]= new int[4];
		a[0]=6;
		a[1]=10;
		a[2]=5;
		a[3]=23;
		
		int max_val=0,index=0;
		
		System.out.println("Length of an array"+a.length);
	    
		for (int i=0;i<a.length;i++)
		{
			
			System.out.println("Value of index a["+i+"] is "+a[i]);
			
			if (a[i]>max_val) 
			{
				
				max_val=a[i];
				index=i;
			}
			
		}	
			
		System.out.println("Max Val is in a["+index+"] "+ max_val);
		
		//TRY to SORT ARRAY
		*/
	}

}
