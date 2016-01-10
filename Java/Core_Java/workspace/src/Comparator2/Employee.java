package Comparator2;



public class Employee implements Comparable
	{
		int empid,sal;
		String empName;
		public Employee(int empid, String empName,int sal) 
		{
			this.sal = sal;
			this.empid = empid;
			this.empName = empName;
		}
		
		public String toString()
		{
			return "Employee Name is :-  "+empName+"\tEmployee ID is :--  "+empid+"\t Salary is  "+sal;
		}

		@Override
		public int compareTo(Object o) {
			// TODO Auto-generated method stub
			Employee e1 = (Employee)o;
			return this.empid-e1.empid;
		}
		
	}

