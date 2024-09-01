import java.util.Scanner;

class Buzz 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number");
		int num = sc.nextInt();

		System.out.println(isBuzz(num));
	}

	public static boolean isBuzz(int num)
	{
		if (num % 7 == 0 || num % 10 == 7 )
		{
			return true;
		}

		return false;
	}
}
