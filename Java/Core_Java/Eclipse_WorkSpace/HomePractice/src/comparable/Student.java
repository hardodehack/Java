package comparable;

public class Student implements Comparable
{
	
	String SName;
	int StdId;
	public Student(String SName, int StdId) 
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
		Student st1 = (Student) o;
		return this.SName.compareTo(st1.SName);
		
	}
}