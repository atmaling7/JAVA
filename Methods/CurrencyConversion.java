class CurrencyConversion
{
	public static void main(String[]args)
	{
		rupeeToDollar(100);
	
	}

	public static void rupeeToDollar(double rupee)
	{
	 double dollar= rupee/82.92;
	
	 System.out.println(dollar);

	 dollarToDihrams(dollar);
	
	}
	
	public static void dollarToDihrams(double dollar)
	{

	double dihram=dollar * 3.67;

	System.out.println(dihram);
	
	dihramToEuro(dihram);

	}

	public static void dihramToEuro(double dihram)
	{
	
	 double euro=dihram/4;
	 System.out.println(euro);


	}


}