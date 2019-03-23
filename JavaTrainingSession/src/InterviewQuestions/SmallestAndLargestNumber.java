package InterviewQuestions;

import java.util.Arrays;

public class SmallestAndLargestNumber {

	public static void main(String[] args) {
		
		int numbers[] = {-10,24,50,-88,987656};
		
		int largest = numbers[0];
		int smallest = numbers[0];
		
		// Time Complexity is 0(n)
		for (int i =1;i<numbers.length;i++)
		{
			if (numbers[i]> largest)
			{
				largest = numbers[i];
			}
			else if (numbers[i]< smallest)
			{
				smallest = numbers[i];
			}
			
		}
		
		System.out.println("\n given array is:"+Arrays.toString(numbers));
		System.out.println("Largest:"+largest);
		System.out.println("Smallest:"+smallest);
		
	}

}
