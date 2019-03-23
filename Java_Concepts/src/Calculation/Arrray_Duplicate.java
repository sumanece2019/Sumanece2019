package Calculation;

public class Arrray_Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {101,6,98,101,6,200,205,210,200};
		
		for (int i=0;i<arr.length;i++)
		{
			
			for (int j=i+1;j<arr.length;j++)
			{
				
				if(arr[i]==arr[j])
				{
					
					System.out.println("Duplicate value of arr["+i+"]="+arr[i]+" Observed in index arr["+j+"]");
					
				}
					
				
			}
			
		}
		   //for (j=i+1;j<arr.len;j++)
		
		   //if(arr[i]==a[j])
		       
		
	}

}
