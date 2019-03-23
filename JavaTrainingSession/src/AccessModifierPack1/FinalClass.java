package AccessModifierPack1;

final class FinalClass {

	String Final_Class_Default = "FINAL-CLASS-DEFAULT";
	private String Final_Class_Private = "FINAL-CLASS-PRIVATE";
	protected String Final_Class_Protected = "FINAL-CLASS-PROTECTED";
	public String Final_Class_Public = "FINAL-CLASS-PUBLIC";
	
	void Final_Class_Default_Method() {
        System.out.println("In FINAL CLASS DEFAULT METHOD");
    }
	
	private void Final_Class_Private_Method() {
        System.out.println("In FINAL CLASS PRIVATE METHOD");
    }
	
	protected void Final_Class_Protected_Method() {
        System.out.println("In FINAL CLASS PROTECTED METHOD");
    }
	
	public void Final_Class_Public_Method() {
        System.out.println("In FINAL CLASS PUBLIC METHOD");
    }
	
	
}
