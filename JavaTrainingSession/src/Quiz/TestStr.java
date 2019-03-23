package Quiz;

//https://www.geeksforgeeks.org/java-gq/class-and-object-2-gq/

public class TestStr {

	public static void main(String[] args) {
		
		TestStr obj = new TestStr();
        obj.start();
        
    }
	
    void start() {
        String stra = "do";
        String strb = method(stra);
        System.out.print(": "+stra + strb);
    }
    
    String method(String stra) {
        stra = stra + "good";
        System.out.print(stra);
        return " good";
    }
	
}
