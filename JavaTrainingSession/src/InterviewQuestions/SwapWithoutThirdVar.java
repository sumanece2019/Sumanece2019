package InterviewQuestions;

public class SwapWithoutThirdVar {

	public static void main(String[] args) {
		
		//SWAP WITH THIRD VARIABLE
		int x = 6;
		int y = 8;
		int t =x;
		x=y;
		y=t;
		
		System.out.println("value of x:"+x);
		System.out.println("value of y:"+y);
		
		System.out.println("--------------------------");
		
		//SWAP WITHOUT THIRD VARIABLE AND + & - OPERATOR
		
		int a = 17;
		int b =21;
		
		a = a+b;//38
		b = a-b;//17
		a = a-b;//21
		
		System.out.println("value of a:"+a);
		System.out.println("value of b:"+b);
		
        System.out.println("--------------------------");
		
		//SWAP WITHOUT THIRD VARIABLE AND * & / OPERATOR
		
		int c = 30;
		int d =35;
		
		c = c*d;//1050
		d = c/d;//30
		c = c/d;//35
		
		System.out.println("value of c:"+c);
		System.out.println("value of d:"+d);

		
        System.out.println("--------------------------");
		
		//SWAP WITH XOR ^ OPERATOR(BIT WISE)
        
        int e = 5; //0101
        int f = 10; //1010
		
        e = e ^ f;//15 --> 1111
        f = e ^ f;
        e = e ^ f;
        
        System.out.println("value of e:"+e);
		System.out.println("value of f:"+f);
        
	}

}
