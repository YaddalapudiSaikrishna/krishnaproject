package optum;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Readingfile 
{
	 public static void main(String[] args) 
	 {
		FileInputStream fin=null;
		try
		  {
			fin=new FileInputStream("SAI.txt"); 		
			System.out.println("file open for reading...!");
		    int i=0;
		   do {
			        i=fin.read();
		            System.out.print((char)i);
		      }
		  while(i!=-1);
		 }
		
	     catch(FileNotFoundException e)
	      {
	    	 System.out.println(" wrong file path");
	      }
	   catch(IOException e)
	   {
	    e.printStackTrace();
	  }
}
}
