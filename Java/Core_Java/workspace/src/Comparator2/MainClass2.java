package Comparator2;
import java.util.Arrays;
public class MainClass2 {
	
	
	
	public static void main(String[] args) 
	{
		Employee[] emp = new Employee[5];
		emp[0]= new Employee(1234,"Rakesh",45000);
		emp[1]= new Employee(8856,"Aakash",35000);
		emp[2]= new Employee(4567,"Zoeb",55000);
		emp[3]= new Employee(4568,"Kishan",25000);
		emp[4]= new Employee(8777,"Hardik",50000);

		System.out.println("Array before Sorting");
		for(Employee i: emp)
		{
			System.out.println(i);
		}
		System.out.println("*************************\n\n");
		System.out.println("Arrays after Sorting by Name");
		SortByName sbn = new SortByName();
		Arrays.sort(emp,sbn);
		for(Employee i: emp)
		{
			System.out.println(i);
		}
		System.out.println("*************************\n\n");
		System.out.println("Arrays after Sorting by Name");
		SortBySalary sbs = new SortBySalary();
		Arrays.sort(emp,sbs);
		for(Employee i: emp)
		{
			System.out.println(i);
		}
		
		
	}
	
}