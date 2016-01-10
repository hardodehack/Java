class start
{
	void execution(Demo1 arg)
	{
		System.out.println("K value "+arg.k);
		arg.disp();
		if (arg instanceof Run1)
		{
			Run1 r2 = (Run1) arg;
			System.out.println("L value "+r2.l);
			r2.test();
		}
		else
		{
			System.out.println("Given Instance is not have property of Run1 Class");
		}
	}
}