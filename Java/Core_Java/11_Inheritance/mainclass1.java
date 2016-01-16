class common
{	
	common(int arg)
	{
		i = arg;
	}
	static int c = 44;
	int i;
	/*void nothing()
	{
		int f = 77;
		System.out.println("Just Nothing Never");
	}
	*/
}

class ac extends common
{
	ac(double arg)
	{
		d = arg;
	}
	double d;
	/*void Everything()
		{
			System.out.println("Just invoking ac1"+b);
		}
	*/
}

class tv extends ac
{
	tv(boolean arg)
	{
		b = arg;
	}
	/*void tv1()
		{
			System.out.println("TV1"+b);
		}
	*/
	boolean b;
}

class mainclass1 
{
	public static void main(String[] args) 
	{
		tv obj = new tv(true);
		obj.b;obj.d;obj.i;
		/*ac obj = new ac();
		tv obj1 = new tv();
		System.out.println("b value "+obj.b+"jhghvfhdb"+obj.c);
		obj.nothing();
		*/
	}
}
