import java.util.Scanner;
class preWorkAssignment{
	static Scanner s = new Scanner(System.in);
	static int choice;
	void palindromeNumber()
	{
		System.out.println("Please enter a number...");
		long num = s.nextLong();
		long numOriginal = num;
		long res, sum = 0;
		while(num > 0)
		{
			res = num % 10;
			sum = (sum * 10) + res;
			num = num / 10;
		}
		if (sum == numOriginal)
		{
			System.out.println("Palindrome number.\n");
		}
		else
		{
			System.out.println("Not a Palindrome number.\n");
		}
		System.out.println();
	}
	void reversePatternOfStars()
	{
		System.out.println("Please enter a number...");
		int num = s.nextInt();
		for (int i = 1; i <= num; i++)
		{
			for(int j = num; j >= i; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
	void isPrimeNumber()
	{
		System.out.println("Please enter a number...");
		int num = s.nextInt();
		int flag = 1;
		if (num == 0 || num == 1)
		{
			System.out.println("Not a prime number.");
		}
		else if (num == 2)
		{
			System.out.println("Prime Number.");
		}
		else
		{
			for (int i = 2; i <= num/2; i++)
			{
				if (num % i == 0)
				{
					flag = 0;
					System.out.println("Not a prime number.");
					break;
				}
				else
				{
					continue;
				}
			}
			if (flag != 0)
			{
				System.out.println("Prime Number.");
			}
		}
		System.out.println();
	}
	void fibonacciSeries()
	{
		System.out.println("Please enter a number...\n");
		int num1 = 0;
		int num2 = 1;
		int num = s.nextInt();
		int temp;
		System.out.print(num1 + "," + num2);
		for (int i = 2; i < num; i++)
		{
			temp = num1 + num2;
			System.out.print("," + temp);
			num1 = num2;
			num2 = temp;
		}
		System.out.println();
	}
	public static void main(String[] args)
	{
		preWorkAssignment obj = new preWorkAssignment();
		do
		{
			System.out.println("Enter your choice from the below options: ");
			System.out.println("1. Find palindrome of number.\n" + "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n" + "4. Print Fibonacci series.\n" + "Enter 0 to Exit.\n");
			obj.choice = s.nextInt();
			switch(choice)
			{
				case 0:
					break;
				case 1:
					obj.palindromeNumber();
					break;
				case 2:
					obj.reversePatternOfStars();
					break;
				case 3:
					obj.isPrimeNumber();
					break;
				case 4:
					obj.fibonacciSeries();
					break;
				default:
					System.out.println("Invalid Choice - Enter a valid number.\n");
					break;
			}
		}while(choice != 0);
		System.out.println("Exited Successfully.\n");
		s.close();
	}
}