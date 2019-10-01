package optum;

public class Demo 
{  
 public Demo()
 {
	 System.out.println("...default...");
 }
}
class B extends Demo
{
	public B()
	{
		System.out.println("filed constuctors");
	}
	
}
class test
{
	public static void main(String[] args) {
		B b=new B();
		
	}
}
