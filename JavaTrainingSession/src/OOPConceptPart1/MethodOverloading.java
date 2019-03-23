package OOPConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		
		obj.sum();
		obj.sum(10);
		obj.sum(20,30);

	}
	
	public static void main(int p)
	{
		
		
	}
	
	public static void main(int p,int q)
	{
		
		
	}
	
	
	//Method overloading --> when the method name is same with different arguments or input parameters within the same class
	//We can't create a method inside a method
	//Duplicate method --> same method name with same no. of arguments are not allowed
	//We can overload main method also
	
	public void sum()  // 0 input parameters
	{
		System.out.println("SUM method -- zero param");
	}

	public void sum(int i) // 1 input parameters
	{
		System.out.println("SUM method -- one param");
		System.out.println(i);
	}
	
	public void sum(int i,int j) // 2 input parameters
	{
		System.out.println("SUM method -- two param");
		System.out.println(i+j);
	}
	
}
