package OOPConceptPart2;

public interface BrazilBank {
	
	default void log(String str){
		System.out.println("BrazilBank logging::"+str);
	}
	
	public void mutualFund();
	
}
