package OOPConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		
		String x ="100";
		System.out.println(x+20);

		//data conversion : string to int
		int i = Integer.parseInt(x);		
		System.out.println(i+20);
		
		//data conversion : string to double
		String y = "12.33";		
		System.out.println(Double.parseDouble(y)+4.5);
		
		//data conversion: string to boolean
		String z = "true";
		Boolean b = Boolean.parseBoolean(z);
		System.out.println(b);
		
		//int to String conversion
		int j = 200;
		System.out.println(j+25);
		
		String s = String.valueOf(j);
		System.out.println(s+25);
	
		String u="100A";
		Integer.parseInt(u);// java.lang.NumberFormatException for input string "100A"
		
		
	}

}
