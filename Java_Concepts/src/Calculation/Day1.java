package Calculation;

public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int i,j;
           i=15;
           j=100;
           System.out.println("Integer value is: " + i);
           System.out.println("Integer value is: " + j);
	/*
           //float fl=100.20f;
           double fl=100.50;
           
           System.out.println("Float value is: " + fl);
           
           char c = 's';
           
           System.out.println("Char value is: " + c);
           
           String s = "Suman";
           
           System.out.println("String value is: " + s);
    */       
           if (!(i<100 || j<50))
        	   System.out.println("value is less than 100");
           else if (i>100)
        	   System.out.println("value is greater than 100");
           else
        	   System.out.println("value is equal to 100");
           String str1="Apple iPhone 4S 32GB SIM-Free - White";
           String str2="Apple iPhone 4S 32GB SIM-Free – White";
           
           if (str1==str2)
           {
        	   System.out.println("String matched");
           }
	
	}
	

}
