package comparator;

import java.util.Comparator;

public class SortByName implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Employee s11 = (Employee) o1;
		Employee s22 = (Employee) o2;
		
		return s11.empName.compareTo(s22.empName);
	}

}

