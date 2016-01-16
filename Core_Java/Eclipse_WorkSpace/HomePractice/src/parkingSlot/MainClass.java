package parkingSlot;

public class MainClass {

	public static void main(String[] args) 
	{
		int counter=0,bcounter=0,rcounter=0;
		ParSlot[] ps = new ParSlot[5];
		Rikshaw o1 = new Rikshaw(1234,"Pigeon");
		Bus o2 = new Bus(9876,"M Benz");
		
		
		ps[0]=o1;
		ps[4]=o2;
		ps[3]=o1;
		for(int i=0;i<ps.length;i++)
		{
			if (ps[i]==null)
			{
				counter++;
			}
			else if(ps[i] instanceof Rikshaw)
			{
				rcounter++;
			}
			else if(ps[i] instanceof Bus)
			{
				bcounter++;
			}
		}
		System.out.println("Empty Slot is :-"+counter);
		System.out.println("Slots with Rikshaw is :-"+rcounter);
		System.out.println("Slots with Bus is :-"+bcounter);
		
	}
}