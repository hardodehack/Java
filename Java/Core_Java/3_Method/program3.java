/*Program3 :- Calculating Sqare using Method with Argument Program*/

class program3
{
	static void sqare(int x)
	{
		int s = x * x;
		System.out.println("Given Number is:"+x+" and Sqare is "+s);
		System.out.println("----------------");
		return;
	}
	public static void main(String args[])
	{
		sqare(15);
		int x1 = 7;
		sqare(x1);
	}

}