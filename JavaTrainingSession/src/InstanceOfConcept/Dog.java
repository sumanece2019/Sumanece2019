package InstanceOfConcept;

public class Dog extends Animal {
	
	
	//Possibility of downcasting with instanceof
	static void DownCast(Animal a)
	{
		if (a instanceof Dog)
		{
			Dog d = (Dog)a;//downcasting
			
		}
	}

}
