class StrongNumber
{
	public static void main(String[] args) 
	{
		System.out.println(isStrong(145));

		rangeOfStrong(1,200);

	}

	public static int factorial(int num)
	{
		int fact =1;

		for (int i=num;i>0;i--)
		{
			fact = fact*i;
		}
		//System.out.println(fact);
		return fact;
	}

	public static boolean isStrong(int num)
	{
		int sum = 0;
			
		int temp =num;
		
		while (temp>0)
		{
			int rem = temp % 10;

			sum += factorial(rem); // sum += factorial(num%10);

			temp/=10;
		}
		//System.out.println(num);
		return sum==num;
	}

	public static void rangeOfStrong(int start,int end)
	{
		while (start<=end)
		{
			if (isStrong(start))
			{
				System.out.println(start);
			}
			start++;
		}
	}


}
