/* Program 2:- To print following pattern
i.) if you print j then			ii.) if you print i then
		1								1
		12								22
		123								333
		1234							4444
		12345							55555
*/

class program2
{
	public static void main(String args[])
	{
		for (int i=1;i<=5;i++)//row
		{
			for(int j=1;j<=i;j++)//column
			{
				System.out.print(j);
			}
			System.out.println("");
		}
	}	
}