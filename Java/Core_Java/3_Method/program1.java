/*Program1 :- Simple Method Program to Calculate Area and Circumference of Circle */

class program1
{
	static double pi = 3.14;
	static double a1,c1;
	static int r = 7;
	public static void area()
	{
		
		a1 = pi * r * r;
		System.out.println("Radius is \t\t"+r+"\nArea is \t\t"+a1);
	}
	public static void cir()
	{
		c1 = 2 * pi * r;
		System.out.println("Circumference is \t"+c1);
	}
	public static void main(String args[])
	{
		program1 o1 = new program1();
		o1.area();
		o1.cir();
	}

}