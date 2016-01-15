package singletonClass;

public class SingletonClass {


	private static int cou=0;
	private static SingletonClass ref = null;

	private SingletonClass()
	{
		System.out.println("creating First SingletonClass class instance");
		cou++;
	}

	public static SingletonClass getInstance()
	{
		if (cou==0)
		{
			ref = new SingletonClass();
		}
	return ref;

	}
	
}
