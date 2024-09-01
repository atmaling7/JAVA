import java.util.Scanner;
class Rotate 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number");
		int num = sc.nextInt();

		/*System.out.println("Enter starting number");
		int start = sc.nextInt();

		System.out.println("Enter ending number");
		int end = sc.nextInt();

		rangeOfRotatingPrime(start,end);*/
		
		if (isPrime(num))
		{		
			int rot = rotate(num);

			while (rot!=num)
			{
				if (isPrime(rot))
				{	
					//System.out.println(rot);
					rot = rotate(rot);
				}
					else
				{
					System.out.println("Not a rotating prime number");
					return ;
				}
				if (rot==num)
				{
					System.out.println("Rotating prime number");
				}
			}
			

		}
		else
		{
			System.out.println("Not a prime");
		}
	}

	public static int rotate(int num)
	{
		/*int last = num %10;

		num /= 10;

		int ans = last * power(10,count(num)) +num;

		return ans;*/
		return (num%10)*power(num)+(num/10);

	}

	public static boolean isPrime(int num)
	{
		int den = 2;

		for (;den<num;den++)
		{
			if (num%den==0)
			{
				return false;
			}

		}
			return true;
	}

	public static int count(int num)
	{
		int ct = 0;

		while (num!=0)
		{
			ct++;
			num /=10;
		}
		return ct;
	}

	/*public static int power(int base,int raise)
	{
		int pow = 1;

		for (int i=0;i<raise;i++)
		{
			pow *= base;
		}
		return pow;
	}*/

	public static int power(int num)
	{
		int pow =1;

		for (int i=0;i<count(num);i++)
		{
			pow *= 10;
			num/=10;
		}
		return pow;
	}


	/*public static void rangeOfRotatingPrime(int start,int end)
	{
		for (int i=start;i<=end;i++)
		{
			if (isRotatingNumber(i))
			{
				System.out.println(start);
			}
		}
	}*/
}
