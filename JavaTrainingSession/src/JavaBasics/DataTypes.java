package JavaBasics;

public class DataTypes {

	//GLOBAL VARIABLES
	static int my_int;
	static byte my_byte;
	static short my_short;
	static long my_long;
	static float my_float;
	static double my_double;
	static boolean my_boolean;
	static char my_char;
	
	
	public static void main(String[] args) {
		
		//1. int		
		byte i = 10;//(1 byte,range -128 to 127,default value 0)
		i=20;
		System.out.println(i);
		
		short j = 150;//2 bytes,range -32768 to 32767,default value 0
		int k = 2147483647;//4 bytes,default value 0
		long l = 1234567891234567891L;//8 bytes,default value 0
		int String = 888;//String is a PreDefned Class Identifier,But it reduces readability
		int Runnable = 999;//Runnable is a PreDefined Interface Identifier,But it reduces readability
		//int 123ABC = 1; invalid as we can't use number at the beginning
		
		System.out.println(j+" "+k+" "+l+" "+String+" "+Runnable);
		
		//2. float
		float marks = 89.45f;
		
		//3. double
		double d =12.33;
		double d1 = 34.44;
		double d2 =100; //I can store int in double but not double in int
		
		System.out.println(d+" "+d1+" "+d2);
		
		//4. char --> Only single digit value and should be written within single quote
		char c = 'a';
		
		System.out.println(c);
		
		//5. boolean 
		boolean b1;
		//System.out.println(b1);
		
		b1 = true;
		
		System.out.println(b1);
		
		//down casting
		int a = (int) 63.21;
		System.out.println(a);
		
		//int p = 65;
		
		char h = 90;//will convert value as per unicode table
				
		System.out.println(h);
		
		System.out.println("Static byte:" + my_byte);
		System.out.println("Static short:" + my_short);
		System.out.println("Static int:" + my_int);
		System.out.println("Static long:" + my_long);
		System.out.println("Static float:" + my_float);
		System.out.println("Static double:" + my_double);
		System.out.println("Static boolean:" + my_boolean);
		System.out.println("Static char:" + my_char);//prints null
		
	}

}
