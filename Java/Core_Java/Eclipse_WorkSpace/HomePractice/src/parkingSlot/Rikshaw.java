package parkingSlot;

public class Rikshaw extends ParSlot {

	int no;
	String CName;
	Rikshaw(int no,String CName)
	{
		this.CName=CName;
		this.no=no;
	}
	
	public String toString()
	{
		return "CName is :-"+CName+"Rikshaw Number is:- "+no;
	}
}
