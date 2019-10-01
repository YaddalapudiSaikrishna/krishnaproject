package test;

public class Bankaccount1 extends Bankaccount
{ 
	private int accountnumber;
    private float balanceamount;
    
	public void withdraw(int amount1)
	
	{
		
			this.balanceamount=balanceamount-amount1;
			System.out.println("your withdraw amount is : "+balanceamount);
	}
}
