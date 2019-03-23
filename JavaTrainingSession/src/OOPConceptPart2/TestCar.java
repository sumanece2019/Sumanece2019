package OOPConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		
		//static polymorphism -- compile-time polymorphism
		BMW b = new BMW();
		
		b.start();
		b.stop();
		b.refuel();
		b.theftSafety();
		b.engine();

		System.out.println("----------");
		
		Car c = new Car();
		
		c.start();
		c.stop();
		c.refuel();
		
		System.out.println("----------");
		
		new BMW();
		
		//TOP CASTING
		//Dynamic/Run-time Polymorphism : child class object can be referred by parent class reference variable 
		Car c1 = new BMW();
		c1.start();
		c1.stop();
		c1.refuel();
		
		//DOWN CASTING
		//BMW b1 = new Car();///THIS IS NOT ALLOWED.
		BMW b1 = (BMW) new Car(); //At runtime java.lang.ClassCastException: OOPConceptPart2.Car cannot be cast to OOPConceptPart2.BMW
		
	}

}
