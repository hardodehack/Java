/* Program 2 :- Switch Case */

class program2 
{
	
	public static void main(String[] args) 
	{
		char g = 'B';
		switch(g)
		{
			case 'A':
				System.out.println("First Class with Distiction");
				break;
			case 'B':
				System.out.println("First Class");
				break;
			case 'C':
				System.out.println("Second Class");
				break;
			case 'D':
				System.out.println("Third Class");
				break;
			case 'E':
				System.out.println("Fail,-------- GET LOST --------");
				break;
			default:
				System.out.println("Please Enter Valid Grade");
		}
			}
}
