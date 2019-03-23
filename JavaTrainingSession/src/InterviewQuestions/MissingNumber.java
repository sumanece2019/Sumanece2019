package InterviewQuestions;

public class MissingNumber {

	public static void main(String[] args) {
		
		int a[] = {-1,1,2,3,5};
		int sum = 0;
		int sum2=0;

		for (int i=0;i<a.length;i++)
		{
			sum = sum+ a[i];			
			
		}
		
		System.out.println(sum);
		
		for (int j=-1;j<=5;j++)
		{
			sum2 = sum2+ j;			
			
		}
		
		System.out.println(sum2);
		
		System.out.println("Missing no. is:"+(sum2-sum));
		
	}

}
