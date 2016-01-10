import java.util.Scanner;
class test2 
{
	public static void main(String[] args) 
	{
		int n;
		System.out.println("Enter Year here :-");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		if (n % 400 == 0)
		{
			System.out.println(n+" is Leap Year");
		}
		else if ( n % 100 == 0)
		{
			System.out.println(n+" is not Leap Year");
		}
		else if ( n % 4 == 0)
		{
			System.out.println(n+" is Leap Year");
		}
		else
		{
			System.out.println(n+" is not Leap Year");
		}
	}
}

