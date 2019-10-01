package optum;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.WriteAbortedException;
import java.util.Scanner;

public class writespa 
{
public static void main(String[] args) {
	FileOutputStream fos=null;
	try
	{
		fos=new FileOutputStream("krishnasai.txt");
		System.out.println("file is ready for your the writing data enter below");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char ch=0;
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			fos.write(ch);
		}
		System.out.println("data store in your file  successfully");	
	}
	catch (FileNotFoundException e) 
	{
	   System.out.println(" wrong path entered");
	}
	catch(IOException e)
	{
		
		e.printStackTrace();
	}
}
}
