package JavaBasics;

public class LoopsConcept {

	public static void main(String[] args) {
		
		
		// 1. while loop
		// dis-advantage : it will generate infinite loop if we don't give incremental/decremental part
		int i=1; // initialization
		int j=10;
		int m = 11;
		
		while( i<=10) //conditional
		{
			System.out.print(i+" ");
			i++; //incremental/decremental part
		}
		
		System.out.println("\n");
		
		while( j<=20)
		{
			System.out.print(j+" ");
			j++;
		}
		//----------------------------------------------------------------------------
		System.out.println("\n");
		//2. Do While
		do {
			
			System.out.print(m+" ");
			m = m + 10;
			
		} while (m<100);
		
		//----------------------------------------------------------------------------
		System.out.println("\n");
		//3. For Loop
		int k=20;
		
		for (;k<=30;k++) { //Initialization,Conditional,Incremental
			
			System.out.print(k+" ");
			
		}
		
		System.out.println("\n");
		// print 10 to 1
		
        for (;k>=20;k--) { //Initialization,Conditional,Incremental
			
			System.out.print(k+" ");
			
		}
        
        System.out.println("\n");
        
        for (int a=40;a<=50;)
        {
        	System.out.print(++a+" ");
        	
        }
        
        System.out.println("\n");
        
        for (int b =50;b<=60;)
        {
        	System.out.print(b+++" ");
        	
        }
        

	}

}
