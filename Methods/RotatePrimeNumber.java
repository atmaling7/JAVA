class RotatePrimeNumber
{
	public static void main(String[]args)
	{

		 int num=24;
		 int temp=num;
		 if(prime(num))
		 {
			num=rotate(num);
			while (temp!=num)
			 {
				if (!prime(num))
				 {
					break;	
				}	
				num=rotate(num);
			}

			if (temp==num)
			 {
				System.out.println("It is a rotating prime");	
			}
			else
			{
				System.out.println("It is not a rotating prime");	
			}
		 }
		 else
		 {
			System.out.println("It is not a prime number");
		 }

	}
	
	public static int rotate(int num)
	{
		int ct=count(num)-1;
		
		int ans=(num%10)*power(10,ct)+num/10;
		return ans;

	}

	public static boolean prime(int num)
	{
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	

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