//WorkProgram3 :- To Convert C 2 F and F 2 C.
import java.util.Scanner;
class WorkProgram3
{

	public static void main(String args[])

	{
		double c,f;
		int ces;
		WorkProgram3 c1 = new WorkProgram3();
		WorkProgram3 f1 = new WorkProgram3();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Choice:- 1. For converting C2F and 2 for F2C ");
		ces = scan.nextInt();
		switch(ces)
		{
		case 1: 
			
			c1.c2f();
			break;
		case 2:
			
			f1.f2c();
			break;
		default:
			System.out.println("You made wrong choice");
			break;
		}
	}
	public void c2f()
		{
		double f2;
		Scanner scan = new Scanner(System.in);
		double c2;
		System.out.println("Enter Value of C");
		c2 = scan.nextDouble();
		f2 = c2  *  9/5 + 32 ;
		System.out.println(f2);
		}
	public void f2c()
		{
		Scanner scan = new Scanner(System.in);
		double c3,f3;
		System.out.println("Enter Value of F");
		f3 = scan.nextDouble();
		c3 = (f3 - 32) * (5/9);
		System.out.println(c3);
		}
}




