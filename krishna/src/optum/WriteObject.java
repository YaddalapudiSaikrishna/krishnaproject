package optum;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteObject 
{
	 public static void main(String[] args) 
	 {
		 FileOutputStream fos=null;
			try
			  {
				// creating a new file with filename SAI.txt
			fos=new FileOutputStream("SAI.txt");
				//then print the file is ready for writing 
			System.out.println("file open for writing");
				// write data in the  file text
			String str="i am searching for beautiful cities";
				char ch=0 ;
			for(int i=0;i<str.length();i++)
				   {
					 ch=str.charAt(i);
					 fos.write(ch);  
				   }
			   // write data completed in file
			System.out.println("file write successfully");	
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
