package Calculation;

public class Java_Loops {

	public static void main(String[] args) {
		
	 	int i,j;
	 	
	 /*	
	    // WHILE LOOP EXAMPLE
	 	while (i<=10)
	 	{		
	     	System.out.println(i);
            i++;
	     }
	 	
	 // DO WHILE LOOP EXAMPLE
	 	do 
	 	{		
	     	System.out.println("Value of J "+j);
            j++;
	     }while(j<=10);
	 	
	 	//for (i=1;i<15;i++)
	 	for (;i<15;i++)	
	 	{
	 		System.out.println("Value of For i "+i);
	 	}
	 	
	 //FACTORIAL
	 	int n;
	 	n=1;
	 	for (i=6;i>=1;i--)
	 	{
	 		
	 		n=n*i;
	 		
	 	}
	 	
	 	System.out.println("Value of Factorial n "+n);
	 
	 //PRIME NO
	 int n=625,flag=0;	
	 
	 for (i=n-1;i>=2;i--)
	 {
		 
		 if (n%i==0)
		 {
			System.out.println("n is a divided by "+i); 
			flag=1;
			//break;
			continue; 
		 }
		 
	  }	 
		 if (flag==0)
		 {
			 
			 System.out.println("n is a prime no. "+n);
		 
		 }
		 else {
			 
			 System.out.println("n is a compound no. "+n);
			 
		 }
		 
	 */
	 //FIBONACI SERIES
	 	int count;
	 	i=0;
	 	j=1;
	 	int n=i+j;
	 	System.out.println("Value of n "+n+"\t");
	 	
	 	for (count=1;count<=20;count++)
	 	{
	 		
	 		//System.out.println("Value of i "+i);
	 		//System.out.println("Value of j "+j);
	 		i=j;
	 		j=n;
	 	    n=i+j;
	 	    
	 	   System.out.println("Value of n "+n);
	 	    
	 	}
	 	
	 	
	}

}
