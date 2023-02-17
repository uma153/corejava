package com.edu;

public class Bank 
{ 
	double amount;
	Bank()
	{
		amount=1000;
	}
	void deposit(double damount)
	{
		amount=amount+damount;
		System.out.println("Balance after deposite="+amount);
	}
	void withdraw(double wamount)
	{
		if(wamount<amount)
		{
			amount=amount-wamount;
			System.out.println("After withdraw Balance amount =n"+amount);
		}
		else
		{
			System.out.println();
		}
	}

	public static void main(String[] args) {
		

	}

}
