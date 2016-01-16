package comparable;
import java.util.Arrays;
public class MainClass {
	
	public static void main(String[] args) {
		Student[] s1 = new Student[5];
		s1[0]= new Student("Parth",123);
		s1[1]= new Student("Bhuro",124);
		s1[2]= new Student("JD",111);
		s1[3]= new Student("Jigar",899);
		s1[4]= new Student("Ankit",723);
		System.out.println("*************************");
		System.out.println("*****Before Sorting*****");
		for(Student i:s1)
		{
			System.out.println(i);
		}
		Arrays.sort(s1); // This method will call to compareTo() method which is overrided in Student class
		System.out.println("*************************");
		System.out.println("*****After Sorting*****");
		for(Student i:s1)
		{
			System.out.println(i);
		}
	}
	
	

}
