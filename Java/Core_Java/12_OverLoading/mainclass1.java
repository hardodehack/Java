class hardik
{
	static void h1(int arg)
	{
		int a1=arg;
		System.out.println("h1 running"+a1);
	}
	static void h1(double arg)
	{
		double d1 = arg;
		System.out.println("h1 doble running"+d1);
	}
}












class mainclass1 
{
	public static void main(String[] args) 
	{
		hardik.h1(25.25);
		//System.out.println("Hello World!");
	}
}
