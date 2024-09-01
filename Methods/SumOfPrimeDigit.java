class SumOfPrimeDigit
{
	public static void main(String[]args)
	{
		int ip=135;
		int sum=0;
		int ext;
		
	
		while(ip!=0)
		{
			ext=extract(ip);
			if(isPrime(ext))
			{
				sum+=ext;
			}
			ip/=10;
		}
	
		System.out.println(sum);


	}
	
	public static int extract(int num)
	{
		int ext=0;
		
		ext=ext*10+(num%10);
		
		

		return ext;


	}

	public static boolean isPrime(int num)
	{

	int den;
	
	for(den=2; den<num; den++)
	{
		if(num%den==0)
		{
			break;
		}


	}

	return den==num;
	
	
	}



}