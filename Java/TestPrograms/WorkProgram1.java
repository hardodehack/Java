//  WorkProgram1Program 1 :- To Print Area and Circumference of Circle
import java.util.Scanner;
public class WorkProgram1

{

	public static void main(String args[])
	{
		double r;
		Scanner scan = new Scanner(System.in);
		r = scan.nextDouble();
		System.out.println("Your Entered Radius is = "+r);
		WorkProgram1 a1 = new WorkProgram1();
		a1.area1(r);
		WorkProgram1 c1 = new WorkProgram1();
		c1.cir1(r);		
	}

	public void area1(double r2)
		{		
			final double pi=3.14;
			double r,cir,area;
			area = (pi * r2 * r2);
			System.out.println("Area is "+area);
		}

	public void cir1(double r1)
		{		
			final double pi=3.14;
			double r,cir,area;
			cir = (2 * pi * r1);
			System.out.println("Circumference is "+cir);
		}
}

