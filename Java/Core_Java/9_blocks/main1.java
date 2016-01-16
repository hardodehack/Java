class sample
{
	sample()
	{
		System.out.println("Running Normal Constructor");
	}
	sample(int x)
	{
		System.out.println("Running int constructor");
	}
	sample(double y)
	{
		System.out.println("Running double constructor");
	}/*
	static
	{
		System.out.println("Running Static Block of Sample Class");
	}
	{
		System.out.println("Running Non-static Block of Sample Class");
	}*/
}

class main1 
{
	main1()
	{
		System.out.println("Main Method Constructor");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Method Started");
		main1 mobj = new main1();
		sample obj = new sample();
		sample obj1 = new sample(7);
		sample obj2 = new sample(77.77);
		System.out.println("Main Method Ended"+obj);
	}
}
