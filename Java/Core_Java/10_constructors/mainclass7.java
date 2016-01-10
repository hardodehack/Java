class sample
{
	int i = 7;
	double d = 77.77;
	void test()
	{
		System.out.println("Running Test Methods");
	}
}

class demo
{
	void disp(sample arg)
	{
		System.out.println("i value :-"+arg.i);
		System.out.println("d value :-"+arg.d);
		arg.test();
	}
}
class mainclass7 
{
	public static void main(String[] args) 
	{
		sample s1 = new sample();
		demo d1 = new demo();
		d1.disp(s1);
	}
}
