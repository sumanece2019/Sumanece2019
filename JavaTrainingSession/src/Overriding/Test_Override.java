package Overriding;

public class Test_Override {

	public static void main(String[] args) {
		
		//Dog Object of same type class
		Dog d = new Dog();
		
		d.move();
		d.eat();
		System.out.println(d.count);
		
		//d.sleep();//Compilation Error: The method sleep() from the type Animal is not visible
		
		//Dog Object of parent type class
		//Dog d2 = new Animal();//Compilation error Type mismatch: cannot convert from Animal to Dog
		
		
		//Animal Object of same type class
		Animal a1 = new Animal();
		
		a1.move();
		a1.eat();
		System.out.println(a1.count);
		
		//Animal Object of Child type class
		Animal a2 = new Dog();
		a2.move();
		a2.eat();
	    System.out.println(a2.count);

	}

}
