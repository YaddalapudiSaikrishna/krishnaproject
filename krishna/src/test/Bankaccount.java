package test;

import java.util.Scanner;

abstract public  class Bankaccount 
{
	private int accountnumber;
    private float balanceamount;
    
    Scanner sc=new Scanner(System.in);
    {
        System.out.println(" Name :");
    	String S=sc.nextLine();	
        System.out.println("Welcome "+S);
    }
    public void deposite(float amount)  // contains method signature as well as implementation   COMPLETE/ CONCURRENT METHOD 
    {
    	this.balanceamount=balanceamount+amount;
    	System.out.println("your deposited amount is : "+balanceamount);
    }
    public  void withdraw(int amount ) // only method signature is
    {
    	
    }
public void checkbalance()
{
	this.balanceamount=balanceamount;
	System.out.println("your updated bank balance is : "+balanceamount);
}
public void dispaly()
{
	
	System.out.println("Thankyou visit again");
}
    
    }
