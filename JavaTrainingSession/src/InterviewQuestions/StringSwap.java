package InterviewQuestions;

public class StringSwap {

	public static void main(String[] args) {
		//Without using third variable
		String a = "Hello";
		String b = "World";
		
		System.out.println("Before Swapping:"+a+b);
		
		a =a+b;
		
		b = a.substring(0, a.length()-b.length());
		
		a = a.substring(b.length());

		System.out.println("After Swapping:"+a+b);
	}

}
