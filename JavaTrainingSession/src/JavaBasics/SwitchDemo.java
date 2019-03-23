package JavaBasics;

public class SwitchDemo {

	public static void main(String[] args) {
		
		int x = 5;
		
		switch(x)
		{
		
		case 10:
			System.out.println("Found 10");
			break;
			
		case 20:
			System.out.println("Found 20");
			break;
			
		case 90:
			System.out.println("Found 90");
			break;
		
		default:	
			System.out.println("Not found");
			
		}

	}

}
