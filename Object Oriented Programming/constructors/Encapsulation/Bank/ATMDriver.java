class ATMDriver 
{
	public static void main(String[] args) 
	{
		ATM a1 = new ATM("SBI","Amit",40036173292l,10000.00,9326,40036);
		
		a1.setDeposit(40036173292l,9326,5000);
		
		a1.setPin(40036173292l,9326, 1234);
		a1.setWithdraw(40036173292l, 1234, 1000);
		
	}
}
