package userClassForException;

public class Voting {
	
	public void VoteEligibleCalc(int IDNo,int age)
	{
		if(age>21)
		{
			System.out.println("You are Eligible for Voting");
		}
		
		else
		{
			throw new AgeLimitException();
			
		}
		
	}

}

