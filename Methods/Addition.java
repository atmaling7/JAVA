class Addition
{
	public static void main(String[]args)
	{
	 add(23,166);
	
	 divide(4,2);

	 power(2,3);

	}
	
	public static void add(int a, int b)
	{

		int res=a+b;
		System.out.println(res);
	
	}

	public static void divide(double a, double b)
	{
	 double res=a/b;
	 System.out.println(res);
	

	}

	public static void power(int base, int raise) 
	{
   	 int result = 1;

   	 for (int i = 0; i < raise; i++) {
       	 result *= base;
	    }

    System.out.println(result);
}



}