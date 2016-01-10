package UserException;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int IDNo,age;
		System.out.println("Enter Your Voting ID Here :- ");
		IDNo = scn.nextInt();
		System.out.println("Enter Your Age Here :- ");
		age = scn.nextInt();
		Voting v = new Voting();
		try{
		v.VoteEligibleCalc(IDNo,age);
		}
		catch(AgeLimitException exp)
		{
			System.out.println("Your Age should be more than 21");
		}
		finally
		{
			System.out.println("Hi.. I am finally block\nJVM always Executes me");
		}
	}

}
