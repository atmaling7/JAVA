class SumOfSqOfDigit
{
	public static void main(String[]args)
	{
		int ip=123;
		int sum=0;
	
		while(ip!=0)
		{
			int rem=extract(ip);
			sum=sum+ square(rem);
			ip/=10;
		
		}
		System.out.println(sum);
	

	}
	
	public static int extract(int num)
	{
		int rem=num%10;
		return rem;
	}

	public static int square(int num)
	{

		 int sq=num*num;

		return sq;
	
	}
	


}