class TechNo
{
	public static void main(String[]args)
	{
	
	int num=2025;
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
			System.out.println("It is a tech no.");
		}
		else
		{
		System.out.println("It is a not tech no.");

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