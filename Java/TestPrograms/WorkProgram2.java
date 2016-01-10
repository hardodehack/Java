//WorkProgram2 : - To Find Simple Interest
import java.util.Scanner;
class WorkProgram2
{
	public static void main(String args[])
	{
		int rate,p,n,r;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Value of p :-");
		p = scan.nextInt();
		System.out.println("Enter Value of n :-");
		n = scan.nextInt();
		System.out.println("Enter Value of r :-");
		r = scan.nextInt();
		rate = (p*n*r)/100;
		System.out.println(rate);
	}	
}
