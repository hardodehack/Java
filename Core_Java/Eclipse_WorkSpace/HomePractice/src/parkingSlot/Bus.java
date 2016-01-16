package parkingSlot;

public class Bus extends ParSlot {


	int no;
	String CName;
	Bus(int no,String CName)
	{
		this.CName=CName;
		this.no=no;
	}
	
	public String toString()
	{
		return "CName is :-"+CName+"Bus Number is:- "+no;
	}
}