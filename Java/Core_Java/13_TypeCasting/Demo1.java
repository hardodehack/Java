class Demo1 
{
	int k = 77;
	void disp()
	{
		System.out.println("Running disp() of Demo1");
	}
}


class Sample1 extends Demo1
{
	int h = 7;
	void view()
	{
		System.out.println("Running view() of sample1");
	}
}

class Run1 extends Sample1
{
	int l = 76;
	void test()
	{
		System.out.println("Running test() of Run1");
	}
}

