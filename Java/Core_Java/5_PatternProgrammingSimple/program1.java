/* Program 1:- To print following pattern
i.) if you print j then			ii.) if you print i then
		12345							11111
		12345							22222
		12345							33333
		12345							44444
		12345							55555
*/

class program1
{
	public static void main(String args[])
	{
		for (int i=1;i<=5;i++)//row
		{
			for(int j=1;j<=5;j++)//column
			{
				System.out.print(j);
			}
			System.out.println("");
		}
	}	
	
}