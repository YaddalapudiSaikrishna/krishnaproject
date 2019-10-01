package optum;

public class Trtcatchblock 
{
public static void main(String[] args) 
{
	int i=10;
	int j=10;

	try 
	   {
		 int k=i/j;
		 if(k==1)
			 throw new SaiException("ok");
		     System.out.println(" k value is " +k);
	    } 
	catch(SaiException e) 
	{
	System.out.println("enter number "+e.getMessage());
	}
}
}
