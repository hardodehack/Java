/*Program4 :- Method with returntype int*/

class program4
{
	static int testmethod()
	{
		System.out.println("testmethod started");
		return 77;
	}
	public static void main(String args[])
	{
		System.out.println("MainMethod Started");
		int ToGetReturnValue = testmethod();
		System.out.println("It Returns : " +ToGetReturnValue);
		System.out.println("MainMethod Started");
	}

}