package test;

import java.util.Scanner;

public class Factorial 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your value : ");
	int n=sc.nextInt();
	int f=factorial(n);
	System.out.println(f);
}
public static int factorial(int n)
{
	int f=1;
	for(int i=1;i<=n;i++)
		
	{
		f=f*i;
	}
	return f;
}
}
