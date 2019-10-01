package test;

public class Encapsulation 
	{
	private	String name;
	private	int empid;
		public void setempdetails(String Ename, int empidNO)
		  {
			name=Ename;
			empid=empidNO;
		  }
		public int getempdetails()
		{
			return empid;
		}
	}			
	
class Test
{
	public static void main(String[] args) 
	{
		Encapsulation t=new Encapsulation();
		t.setempdetails("sai", 117);
		System.out.println(t.getempdetails());
	}
}
