package InterviewQuestions;

public class Reverse_Int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 123456;
		
		int rev =0;
		
		while(num != 0)
		{
			
			rev = rev*10 +num%10;
			
			num = num/10;
			
		}
		
		System.out.println(rev);
		
		long num2 =987654;
		System.out.println("Reverse Value:"+new StringBuffer(String.valueOf(num2)).reverse());
		
	}

}
