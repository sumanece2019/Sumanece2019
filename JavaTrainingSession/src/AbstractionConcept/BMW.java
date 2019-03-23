package AbstractionConcept;

public class BMW implements Car{

	@Override
	public void particle() {
		
		System.out.println("BMW----Metal");
		
	}
	
	@Override
	public void start(String str)
	{
		System.out.println("BMW----start:"+str);
	}
	
	@Override
	public void stop()
	{
		System.out.println("BMW----stop");
	}
	
	@Override
	public void refuel()
	{
		System.out.println("BMW----refuel");
	}
	
	//non overridden method
	public void theftSafety()
	{
		System.out.println("BMW----therftSafety");
	}

	@Override
	public void Colour_Selected() {
		
		System.out.println("Colour Selected");
		
	}

	//Cannot reduce the visibility of the inherited method from Car
	/*
	default void I_Method_body_Ex()
	{
		System.out.println("Accessing Default method of Interface");
	}
	*/
	
}
