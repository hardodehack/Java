package exceptionHandling;

public class MainClass {
	
		public static void main(String[] args) {
		
		Demo1 d1 = new Demo1(12,6);
		int rc = d1.divide(12,6);
		Demo1 d2 = new Demo1(24,6);
		int rc2 = d1.divide(24,6);
		try
		{
			Demo1 d3 = new Demo1(24,0);
			int rc3 = d3.divide(24,0);
		}
		catch (Exception exp)
		{
			System.out.println("Handling Arithmatic Exception");
		}
		System.out.println("Dividing "+d1.n1+" By "+d1.n2+" is "+rc);
		System.out.println("Dividing "+d2.n1+" By "+d2.n2+" is "+rc2);
		

	}


}
