package OOPConceptPart1;

public class CallByValAndCallByRef {

	int p;
	int q;
	
	public static void main(String[] args) {
		
		CallByValAndCallByRef obj = new CallByValAndCallByRef();
		int x = 10 , y = 20;
		obj.testSum(x, y); //call by value OR pass by value --> Copy of input parameters are passed
		
		obj.p = 50;
		obj.q = 60;
		
		obj.swap(obj); //call by ref
		System.out.println("value of p:"+obj.p);
		System.out.println("value of q:"+obj.q);

	}
	
	
	public int testSum(int a,int b)
	{
		int c =a+b;
		
		return c;
		
	}
	
	
	public void swap(CallByValAndCallByRef t)
	{
		t.p = t.p+t.q;
		t.q = t.p-t.q;
		t.p = t.p-t.q;
		
	}

}
