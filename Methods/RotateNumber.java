class RotateNumber
{
	public static void main(String[]args)
	{

		System.out.println(rotate(1234));

	}
	
	public static int rotate(int num)
	{
		int ct=count(num)-1;
		
		int ans=(num%10)*power(10,ct)+num/10;
		return ans;
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