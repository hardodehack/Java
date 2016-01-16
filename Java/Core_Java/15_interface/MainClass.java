interface  animal
{
	 void noise(); //Note:- here in interface no need to write method as abstract b'coz we can define only abstract method and static final data member only....
}

class cat implements animal
{
	public void noise()
	{
		System.out.println("Meow...Meow");
	}
}
class dog implements animal
{
	public void noise()
	{
		System.out.println("Bow..Bow..");
	}
}
class snake implements animal
{
	public void noise()
	{
		System.out.println("hssssss.....hsssssss...");
	}
}

/*class tohide
{
	animal start(animal arg)
	{
		this.arg = arg;
		arg.makeNoise();

	}
}*/
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
		as.makeNoise(s1);
	}
}