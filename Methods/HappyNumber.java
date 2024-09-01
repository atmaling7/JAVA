class HappyNumber
{
    	public static void main(String[] args)
	{
        int num = 31;
        if (isHappy(num))
	 {
            System.out.println("It is a happy number");
        }
	 else 
	{
            System.out.println("It is not a happy number");
        }
    }
	
	public static boolean isHappy(int num)
	{
        int result = num;

        while (result != 1 && result != 4)	
	 {
            result = sqOfDigits(result);
            if (result == 1)
	    {
                break; // Break out of the loop if result becomes 1
            }
        }

        return result == 1;
    }
	
	public static int sqOfDigits(int num)
	{
        int sum = 0;
        while (num != 0) 
	{
            int rem = num % 10;
            sum += rem * rem;
            num /= 10;
        }
        return sum;
    }
}