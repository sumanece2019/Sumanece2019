package InterviewQuestions;

public class StringManipulation {

	public static void main(String[] args) {
		
		String str = "The rains have started here selenium";
		String str1 = "The rains Have started here";
		
		System.out.println(str.length());//String Length
		
		System.out.println(str.charAt(5));//char at an index
		
		System.out.println(str.indexOf('s'));//1st occurrence of s
		
		System.out.println(str.indexOf('s',str.indexOf('s')+1));//2nd occurrence of s
		
		System.out.println(str.indexOf('s',(str.indexOf('s',str.indexOf('s')+1))+1));//3rd occurrence of s
		
		System.out.println(str.indexOf("have"));
		
		System.out.println(str.indexOf("hello"));//if string not available then it will return -1
		
		// String Comparison
		System.out.println(str.equals(str1));
		
		System.out.println(str.equalsIgnoreCase(str1));
		
		//SubString
		System.out.println(str.substring(0, 9));
		
		
		//trim
		String s ="   Hello World   ";
		System.out.println(s.trim());
			
		//replace
		System.out.println(s.replace(" ",""));
		
		String date ="01-01-2017";				
		System.out.println(date.replace("-","/"));
		
		//split:
		String test ="Hello_World_Test_Selenium";
		String testval[]= test.split("_");
		
		for (int i=0;i<testval.length;i++)
		{
		   System.out.println(testval[i]);
		}
		
		
		//Concatenation		
		String s2 ="concat" ;
		System.out.println(s2.concat("enation"));
		
		
		String x ="Hello";
		String y ="World";
		
		int a =100;
		int b=200;
		
		float c = 600;
		float d = 700;
		
		System.out.println(x+y);
		System.out.println(a+b);
		System.out.println(c+d);
		//Left to write execution
		//"+" is a Concatenation operator
		//A String Can be concatenated with any data types
		System.out.println(x+y+a+b);
		System.out.println(a+b+x+y);
		System.out.println(a+x+b+y);
		System.out.println(x+y+(a+b));
		System.out.println(x+y+c+d);
		System.out.println(c+d+x+y);
		System.out.println(x+y+(c+d));
		System.out.println(a+c+b+d);
		
	}

}
