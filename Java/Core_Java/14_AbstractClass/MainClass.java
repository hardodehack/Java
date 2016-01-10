abstract class  animal
{
	abstract void noise();
}

class cat extends animal
{
	void noise()
	{
		System.out.println("Meow...Meow");
	}
}
class dog extends animal
{
	void noise()
	{
		System.out.println("Bow..Bow..");
	}
}
class snake extends animal
{
	void noise()
	{
		System.out.println("hssssss.....hsssssss...");
	}
}

class animalSimulator
{
	
	void makeNoise(animal arg)
	{
		arg.noise();
	}
}

class MainClass
{
	public static void main(String[] args)
	{
		cat c1 = new cat();
		dog d1 = new dog();
		snake s1 = new snake();
		animalSimulator as = new animalSimulator();
		as.makeNoise(d1);
	}
}