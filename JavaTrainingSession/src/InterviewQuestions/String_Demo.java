package InterviewQuestions;

public class String_Demo {

	public static void main(String[] args) {

        //String str="This is a String";
        String str="Selenium Test";
        String str_pdrom="abcaaecba";
        String str_junk = "@@@### Selenium %%% Junk &&&";
        
        boolean flag;
        
        flag=String_Functions.Palindrom(str_pdrom);
        	if (flag==true)
        		System.out.println("String is Palindrom");
        	else
        		System.out.println("String is not a Palindrom");
        	
        	String_Functions.Reverse_Str(str);
        	
        	String_Functions.RemoveJunk(str_junk);
        	
	}

}
