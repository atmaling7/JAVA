class CharConversion
{
	public static void main(String[]args)
	{

	convert('E');

	}

	public static void convert(char ch)
	{

		if(ch>='a' && ch<='z')
		{
		 char ans=(char)(ch-32);
		 System.out.println(ans);
		}
	
		else if(ch>='A' && ch<='Z')
		{
		  char ans=(char)(ch+32);
		 System.out.println(ans);

		}
	
		else
		{
		
		System.out.println("Not an ALphabet");

		}
	
	
	}


}