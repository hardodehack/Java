package singletonClass;

public class singleton {

	private static int cou=0;
	private static singleton ref = null;

	private singleton()
	{
		System.out.println("creating First singleton class instance");
		cou++;
	}

	public static singleton getInstance()
	{
		if (cou==0)
		{
			ref = new singleton();
		}
	return ref;

	}
}
