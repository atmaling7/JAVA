class RangeOfTechNo
{
	public static void main(String[]args)
	{
		int start=1;
		int end=100000;
	
		while(start<=end)
		{
			if(isTech(start))
			{
			System.out.println(start);
			}
			start++;
		}
	}
	
	public static boolean isTech(int num)
	{
	int temp=num;
	int ct=count(num);
	int sum=0;
	
		if(ct%2==0)
		{
			int rem=num%power(10,ct/2);
			
			 num/=power(10,ct/2);
			 sum=num+rem;

		}

		if(sum*sum==temp)
		{
			return true;
		}
		else
		{
			return false;

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
	
	public static int power(int base, int raise)
	{
		int pow=1;
		
		for(int i=0;i<raise; i++)
		{
		 pow*=base;
		} 
		return pow;
	}
	


}