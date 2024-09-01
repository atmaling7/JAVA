class PalindromicPrime
{
	public static void main(String[] args) 
	{
		System.out.println(palinPrime(14));

		rangeOfPP(1,200);

		nthPP(10);

		nPalinPrime(10);
	}

	public static boolean isPalindrome(int num)
	{
		int rev=0;

		for (int i=num;i!=0;i/=10)
		{
			int rem = i  % 10;

			rev = rev*10 + rem;

		}
			//System.out.println(rev);

	return rev==num;
	}

	public static boolean isPrime(int num)
	{
		int den = 2;

		for (;den<num;den++)
		{
			if (num%den==0)
			{
				return false;
			}
		}
		return true;
	}

	public static boolean palinPrime(int num)
	{
		return (isPalindrome(num) && isPrime(num));
		
	}

	public static void rangeOfPP(int start,int end)
	{
		while (start<=end)
		{
			if (palinPrime(start))
			{
				System.out.println(start);
			}
			start++;
		}
	}

	public static void nthPP(int n)
	{
		int count = 0;

		int start =1;
		
		while (true)
		{
			if (palinPrime(start))
			{
				count++;

				if (count==n)
				{
					System.out.println(start);
					break;
				}
			}
			start++;
		}
	}

	public static void nPalinPrime(int n)
	{
		int count = 0;

		int start = 6;

		while (count!=n)
		{
			if (palinPrime(start))
			{
				count++;
				System.out.println(start);
			}
		start++;
		}
	}
}
