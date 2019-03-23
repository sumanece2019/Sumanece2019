package Overriding;

public class Animal {
	
	int count = 4;
		 
    public void move() {
        System.out.println("Animal is moving");
    }
 
    protected void eat() {
        System.out.println("Animal is eating");
    }
    
    void run() {
        System.out.println("Animal is running");
    }

    private void sleep() {
        System.out.println("Animal is sleeping");
    }
    
    final void sound()
    {
    	System.out.println("Animal's sound");
    }
    
    static void colour()
    {
    	System.out.println("Animal's Colour");
    }
    
}
