class ATM
{
	private String bankName ;
	private String name ;
	private long accno ;
	private double balance ;
	private int pin ;
	private int slno;

	ATM()
	{
		
	}

	ATM(String bankName, String name, long accno, double balance, int pin, int slno)
	{
		this.bankName = bankName;
		this.name = name;
		this.accno = accno;
		this.balance = balance;
		this.pin = pin;
		this.slno = slno;
	}

	public String getBankName()
	{
		return bankName;
	}

	public long getAccno()
	{
		return accno;
	}

	public String getName()
	{
		return name;
	}

	public double getBalance(long accno, int pin)
	{
		if (this.accno == accno && this.pin == pin)
		{
			System.out.println("Balance : "+balance);
		}
		return 0;
	}

	public void setDeposit(long accno,int pin,double amt)
	{
		if (this.accno == accno && this.pin == pin && amt > 0)
		{
			this.balance += amt; 
			System.out.println("Rupees "+ amt +" has been deposited to your account");
			System.out.println("Remaining balance : "+ balance);
		}
		else
		{
			System.out.println("Invalid Credentials");
		}
	}

	public void setWithdraw(long accno, int pin, double amt)
	{
		if (this.accno == accno && this.pin == pin && amt > 0)
		{
			System.out.println("Login Success");

			if (balance-amt >= 2000 )
			{
				balance -= amt;
				System.out.println("Your account has been debited with "+ amt +" rupees");
					System.out.println("Remaining Balance: "+balance);
			}
			else
			{
				System.out.println("Insufficient Balance");
			}
		}
		else{
			System.out.println("Invalid Credentials");
		}
	}

	public void setPin(long accno,int oldPin, int newPin)
	{
		if (this.accno == accno && this.pin == oldPin)
		{
			this.pin = newPin;
			System.out.println("Pin updated successfully");
		}
		else
		{
			System.out.println("Invlid Credentials");
		}
	}
}
