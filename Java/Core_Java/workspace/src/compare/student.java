package compare;
import java.lang.Comparable;


public class student implements Comparable
{
	
	String SName;
	int StdId;
	public student(String SName, int StdId) 
	{
		this.SName = SName;
		this.StdId = StdId;
	}
	
	
	public String toString()
	{
		return "Student Name is :-  "+SName+"\tStudent ID is\t"+StdId;
	}

	@Override
	
	
	public int compareTo(Object o) {
		student st1 = (student) o;
		return this.SName.compareTo(st1.SName);
		
	}
	
}
