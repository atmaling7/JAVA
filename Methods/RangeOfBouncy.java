class RangeOfBouncy
{
	public static void main(String[]args)
	{
		
		int start=1;
		int end=100;
	
	while(start<=end)
	{
		if(isBouncy(start))
		{
			System.out.println(start);
		}
		start++;
	}

	}
		
	public static boolean isBouncy(int num)
	{
		boolean dec=false;
		boolean inc=false;
		int last=num%10;
		while(num!=0)
		{
			num/=10;
		
			int secLast=num%10;
			
			if(last>secLast)
			{
				dec=true;
			}
			else if(last<secLast)
			{
				inc=true;
			}
		
			
			if(inc && dec)
			{
				break;
			}
			else
			{
				last=secLast;
			}
		}
	
		return inc && dec;
	
	
	}


}