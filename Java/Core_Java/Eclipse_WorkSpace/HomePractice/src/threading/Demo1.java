package threading;

public class Demo1 implements Runnable
{
	public void run()
	{
		System.out.println("Printing 1 to 5");
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			try{
			Thread.sleep(1500);
			}
			catch(Exception e)
			{
				System.out.println("Handling Exception");
			}
		}
	}
}
	