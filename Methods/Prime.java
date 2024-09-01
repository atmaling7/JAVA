import java.util.Scanner;

class Prime 
{
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number");
		int num = sc.nextInt();

		System.out.println(isPrime(num));

		System.out.println("Enter the starting number");
		int start = sc.nextInt();
		
		System.out.println("Enter the ending number");
		int end = sc.nextInt();
	}

	public static boolean isPrime(int num)
	{
		int den = 2;

		if (num == 1)
		{
			return true;
		}

		else{
			
			for (  ;den < num/2 ;den++)
			{
				if (num % den == 0)
				{
					return false;
				}
			}
		}

		return true;
	}

	public static void rangeOfPrime(int start,int end)
	{
		while (start<=end)
		{
			if (isArmstrong(start))
			{
				System.out.println(start);
			}
			start++;
		}
	}
}
