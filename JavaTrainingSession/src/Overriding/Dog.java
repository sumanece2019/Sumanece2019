package Overriding;

public class Dog extends Animal{
	
	int count = 10;
	
	public void move() {
        System.out.println("Dog is moving");
    }
 
	
    protected void eat() {
        System.out.println("Dog is eating");
    }
    
    void run() {
        System.out.println("Dog is running");
    }
    
    void sleep() {
        System.out.println("Dog is sleeping");
    }
    
    /*
    public void sound() //Cannot override the final method from Animal
    {
    	System.out.println("Animal's sound");
    }*/
    
    //This instance method cannot override the static method from Animal
    /*
    public void colour()
    {
    	System.out.println("Dog's Colour");
    }*/


}
