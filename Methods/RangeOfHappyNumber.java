class RangeOfHappyNumber
 {
    public static void main(String[] args)
	 {
        int start=1;
		int end=100;

		while (start<=end)
		{
			if(isHappy(start))
			{
				System.out.println(start);
			}
			start++; {
			
		}
        }
    }

    public static boolean isHappy(int num)
	 {
        int result = num;

        while (result != 1 && result != 4)	
	 {
            result = sqOfDigits(result);
            if (result == 1) {
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