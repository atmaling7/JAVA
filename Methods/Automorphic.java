class Automorphic 
{
	public static void main(String[] args) 
	{
		System.out.println(isAutomorphic(5));
		printRange(1,100);
		nthAutomorphic(5);
		nAutomorphic(8);
	}

	public static int count(int num)
	{
		int ct = 0;

		while(num!=0)
		{
			ct++;
			num /= 10;
		}

		return ct;
	}

	public static int pow(int base,int raise)
	{
		int pow = 1;

		for (int i=0;i<raise;i++)
		{
			pow = pow * base;
		}
		
		return pow;
	}

	public static boolean isAutomorphic(int num)
	{
		int sq = num*num;

		int rem = sq % pow(10,count(num));

		if (rem == num)
		{
			return true;
		}

		return false;
	}

	public static void printRange(int start, int end)
	{
		int ct = 0;

		while(start <= end)
		{
				if (isAutomorphic(start))
				{
					ct++;
				//System.out.println(start);
				}

			start++;
		}
		System.out.println(ct);
	}

	public static void nthAutomorphic(int n)
	{
		int ct = 0;

		int start = 1;

		while (true)
		{
			if (isAutomorphic(start))
			{
				ct++;

				if (ct==n)
				{
					System.out.println(start);
					return;
				}
			}
			start++;
		}

	}

	public static void nAutomorphic(int n)
	{
		int ct = 0;
		
		int start = 1;

		while(n!=ct)
		{
			if (isAutomorphic(start))
			{
				ct++;
				System.out.println(start);
			}	
			start++;
		}
	}
}
