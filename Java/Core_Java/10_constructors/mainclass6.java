class sample
{
	int h = 45;
	double d = 7.7;
	void test()
	{
		System.out.println("Running Test Method");
	}
}

class demo
{
	final static sample s1 = new sample();
	int x = 99;
	void disp()
	{
		System.out.println("Running Display Method");
	}
}



class mainclass6 
{
	public static void main(String[] args) 
	{
		demo d1 = new demo();
		System.out.println(" X = "+d1.x);
		d1.disp();
		System.out.println(" H = "+demo.s1.h);
		System.out.println(" D = "+demo.s1.d);
		d1.s1.test();

	}
}
