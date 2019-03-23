package Overriding2;

import Overriding.Animal;

public class Cat extends Animal {

	public void move() {
        System.out.println("Cat is moving");
    }
 
    protected void eat() {
        System.out.println("Cat is eating");
    }
    
  //it isn’t considered an overriding because the Cat class does not inherit the Animal’s run() method
    void run() 
    {
        System.out.println("Cat is running");
    }
	
}
