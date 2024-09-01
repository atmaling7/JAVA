
class LengthConversion
{
	public static void main(String[]args)
	{
	
	 meterToCm(1);


	}

	public static void meterToCm(double meter)
	{
		double cm=meter*100;
		System.out.println(cm);
	
		cmToInch(cm);
	}
	
	public static void cmToInch(double cm)
	{
		double inch=cm* 39.37;
		System.out.println(inch);
	
		inchToFoot(inch);

	}

	public static void inchToFoot(double inch)
	{
		double foot=inch/  12;
		System.out.println(foot);
	
		footToKm(foot);

	}

	public static void footToKm(double foot)
	{
		double km=foot / 0.0003;
		System.out.println(km);
	
		

	}


}
