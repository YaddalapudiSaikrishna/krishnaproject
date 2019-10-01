package test;

public class ValidatingUsers
{
        public static void main(String[] args) {
		ValidateUser v=new ValidateUser();
	    boolean result=v.ValidateUser("abhi","pwd");
		if(result==true)
	    System.out.println("login");
	}
}
