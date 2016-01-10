package compare;

import java.util.Arrays;

import compare.student;


public class MainClass {
	
	public static void main(String[] args) {
		student[] s1 = new student[5];
		s1[0]= new student("Parth",123);
		s1[1]= new student("Bhuro",124);
		s1[2]= new student("JD",111);
		s1[3]= new student("Jigar",899);
		s1[4]= new student("Ankit",723);
		System.out.println("*************************");
		System.out.println("*****Before Sorting*****");
		for(student i:s1)
		{
			System.out.println(i);
		}
		Arrays.sort(s1); // This method will call to compareTo() method which is overrided in student class
		System.out.println("*************************");
		System.out.println("*****After Sorting*****");
		for(student i:s1)
		{
			System.out.println(i);
		}
	}

}
