class Bouncy
{
	public static void main(String[]args)
	{
		System.out.println(isBouncy(1235411));
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