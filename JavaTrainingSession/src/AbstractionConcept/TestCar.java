package AbstractionConcept;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b = new BMW();
		
		b.particle();
		b.start("BMW");
		b.stop();
		b.refuel();
		b.theftSafety();
		System.out.println(Car.wheels);
		//b.wheels=10;//Error as "The final field Car.wheels cannot be assigned"
		
		//Car c = new BMW();
		Car c = new BMW_2018();
		
		c.particle();
		c.start("CAR");
		c.stop();
		c.refuel();
	    c.Colour_Selected();
	    c.I_Method_body_Ex();
		
	    Car.static_Example();
	    Metal.static_Example();
		
	}

}
