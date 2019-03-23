package InstanceOfConcept;

public class Test {

	public static void main(String[] args) {
		
		Animal a = new Animal();
		System.out.println(a instanceof Animal);
		System.out.println(a instanceof Dog);
		System.out.println(a instanceof BabyDog);
		
		Dog d = new Dog();		
		System.out.println(d instanceof Animal);
		System.out.println(d instanceof Dog);
		System.out.println(d instanceof BabyDog);
		
		BabyDog b = new BabyDog();
		System.out.println(b instanceof Animal);
		System.out.println(b instanceof Dog);
		System.out.println(b instanceof BabyDog);
		
		Animal a2 = new BabyDog();
		System.out.println(a2 instanceof Animal);
		System.out.println(a2 instanceof Dog);
		System.out.println(a2 instanceof BabyDog);
		
		
		Dog d2 = null;
		System.out.println(d2 instanceof Animal);
		System.out.println(d2 instanceof Dog);
		System.out.println(d2 instanceof BabyDog);
		
		System.out.println("----------------------------------------");
		
		Animal a3 = new Dog();
		Dog.DownCast(a3);
		System.out.println(a3 instanceof Animal);
		System.out.println(a3 instanceof Dog);
		System.out.println(a3 instanceof BabyDog);
		
		System.out.println("----------------------------------------");
		
		Animal a4 = new Animal();
		Dog.DownCast(a4);
		System.out.println(a4 instanceof Animal);
		System.out.println(a4 instanceof Dog);
		System.out.println(a4 instanceof BabyDog);
		
	}

}
