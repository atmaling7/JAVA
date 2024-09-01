class DecimalToBinary
{
	public static void main(String[]args)
	{
	
	System.out.println(decToBin(10));	
	
	}
	public static String decToBin(int num)
	{
		String bin="";
	
	
		while(num!=0)
		{
		 int rem=num%2;
		 bin=rem+bin;
		 num/=2;
		}
		
	
		return bin;
	
	
	}


}