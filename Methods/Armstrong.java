class Armstrong 
{
	public static void main(String[] args) 
	{
		System.out.println(Armstrong.isArmstrong(145));
		
		//rangeOfArmstrong(1,200);
		
		nArmstrong(10);

		nthArmstrong(20);

	}

	public static int count(int num)
	{
		int count = 0;

		for (int i=num;i!=0;i/=10)
		{
			count++;

			//System.out.println(count);
		}
		return count;
	}
	
	public static int power(int base,int raise)
	{
		int pow = 1;

		for (int i=0;i<raise;i++)
		{
			pow = pow * base;
		}
		return pow;
	}

	public static boolean isArmstrong(int num)
	{
		int sum = 0;
		int ct = count(num);
		
		for (int i=num; i!=0; i/=10)
		{
			int rem = i%10;

			sum = sum + power(rem,ct);
		}

		return sum==num;
	}

	public static void rangeOfArmstrong(int start,int end)
	{
		while (start<=end)
		{
			if (isArmstrong(start))
			{
				System.out.println(start);
			}
			start++;
		}
	}

	public static void nArmstrong(int n)
	{
		int count = 0;
		int start =1;

		while (count!=n)
		{
			if (isArmstrong(start))
			{
				count++;
				System.out.println(start);
			}
			start++;
		}
	}

	public static void nthArmstrong(int n)
	{
		int count = 0;
		int start =1;
		
		while(true)
		{
			if (isArmstrong(start))
			{
				count++;
			}
			if (count == n)
			{
				System.out.println(start);
				break;
			}
			start++;
		}
	}
}
