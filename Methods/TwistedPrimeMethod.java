class TwistedPrimeMethod
{
	public static void main(String[] args) 
	{
		System.out.println(TwistedNo(123));
		System.out.println(isTP(123));
	}

	public static boolean isPrime(int num)
	{
		int den =2;

		for (;den < num ; den++ )
		{
			if (num % den ==0)
			{
				return false;
			}
		}
		return true;
	}

	public static int TwistedNo(int num)
	{
		int twist = 0 ;

		while (num != 0)
		{
			int rem = num % 10;

			twist = (twist * 10) + rem;

			num /= 10;
		}
		//System.out.println(twist);
		return twist;
	}

	public static boolean isTP(int num)
	{
		if (isPrime(num))
		{
			return isPrime(TwistedNo(num));
		}

		return false;
	}
}
