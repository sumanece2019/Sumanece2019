package OOPConceptPart1;

public class Car {

	// class variables
	
	int mod,wheel;
	
	
	public static void main(String[] args) {
		
		// new Car() --> This is the Object of Car Class
		// new keyword is used to create the object
		//a,b & c is representing object of Car class --> Object Reference Variables
		
        Car a = new Car();
        Car b = new Car();
        Car c = new Car();
        
        a.mod = 2015;
        a.wheel = 4;
        
        b.mod =2014;
        b.wheel = 4;
        
        c.mod = 2013;
        c.wheel=4;
        
        System.out.println("Before assigning the references");
        
        System.out.println(a.mod);
        System.out.println(a.wheel);
        
        System.out.println(b.mod);
        System.out.println(b.wheel);
        
        System.out.println(c.mod);
        System.out.println(c.wheel);
        
        System.out.println("After assigning the references");
        
        a=b;
        b=c;
        c=a;
        
        a.mod = 10;
        
        System.out.println(a.mod);
        
        c.mod = 20;
        
        System.out.println(a.mod);
        
	}

}
