class RangeOfDisariumNumber
{
	public static void main(String[]args)
	{
	
	int start=1;
		int end=500;
		while(start<=end)
		{
			if(isDisarium( start))
			{
				System.out.println(start);
			}
		
			start++;
		}

	}
	
	

	
	
	public static int count(int num)
	{
		int ct=0;
		while(num!=0)
		{
			ct++;
			num/=10;
		}
		return ct;
		
	

	}

	public static boolean isDisarium(int num)
	{
	int ct=count(num);
	int sum=0;
	
	for(int i=num; i!=0; i/=10)
	{
		int rem=i%10;
		sum=sum+power(rem,ct);
		ct--;

	}
	return num==sum;


	}
	
	public static int power(int rem,int count)
	{
		int pow=1;
		for(int i=count;i>0;i--)
		{
			pow*=rem;
		}
		return pow;
	}


}