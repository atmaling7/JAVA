class FascinatingNumber
{
	public static void main(String[]args)
	{

	System.out.println(isFascinating(123456789));

	}

	public static boolean isFascinating(int num)
	{
	int ans1=num*2;
	int total1=num*power(10,count(ans1))+ans1;

	int ans2=num*3;
	int total2=total1*power(10,count(ans2))+ans2;
	
	if(isUnique(total2))
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
	public static int power(int base,int raise)
	{
		int pow=1;
		for(int i=0;i<raise;i++)
		{
			pow*=base;
		}
		return pow;
	}
	
	public static boolean isUnique(int num)
	{
		int n1=num;
		int n2=num;
		int r1,r2,ct=0;
	
		while(n1!=0)
		{
			r1=n1%10;
			
			while(n2!=0)
			{
				r2=n2%10;
					
				if(r1==r2)
				{
					ct++;
				}
				n2/=10;
			}
			n1/=10;
		}
		
		return ct==1;
	
	
	}


}