class NivenNumber 
{
	public static void main(String[] args) 
	{
		System.out.println(isHarshad(2015));
	}

	public static boolean isHarshad(int num)
	{
		int sum = 0;

		for (int i=num;i!=0;i/=10)
		{
			int rem = num%10;

			sum = sum + rem;
		}

		if (num%sum==0)
		{
			return true;
		}
		return false;
	}
}
