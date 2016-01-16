import java.util.Scanner;
class test1 
{
	public static void main(String[] args) 
	{
		int n;
		System.out.println("Enter Number here :-");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		if (n != 0)
		{
			if(n % 2 == 0)
			{
				{
					System.out.println(n+" is Even Number");
				}
					if (n % 3 == 0 )
					{
						System.out.println(n+" is Divisible by 3");
					}
					else
					{
						System.out.println(n+" is not Divisible by 3");
					}
				}
			else
			{
				{
					System.out.println(n+" is odd Number");
				}
					if (n % 3 == 0 )
					{
						System.out.println(n+" is Divisible by 3");
					}
					else
					{
						System.out.println(n+" is not Divisible by 3");
					}
			}
			
		}
		else
		{
			System.out.println("Enter Number except 0");
		}
		
	}
}
