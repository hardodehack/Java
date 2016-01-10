/*Program2 :- Method with Argument Program*/

class program2
{
	static void testmethod(int x)
	{
		System.out.println("Passed Argument is :"+x);
		return;
	}
	public static void main(String args[])
	{
		testmethod(25);
		System.out.println("----------------");
		int x1 = 77;
		testmethod(x1);
	}

}