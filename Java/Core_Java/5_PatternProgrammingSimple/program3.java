/* Program 3:- To print following pattern
i.) if you print j then			ii.) if you print i then
		12345							55555
		1234							4444
		123								333
		12								22
		1								1	
*/

class program3
{
	public static void main(String args[])
	{
		for (int i=5;i>=1;i--)//row
		{
			for(int j=1;j<=i;j++)//column
			{
				System.out.print(j);
			}
			System.out.println("");
		}
	}	
}