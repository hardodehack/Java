/* program1 :- Nested if else loop for Simple ATM */
class program1
{
	public static void main(String[] args) 
	{
		int bal = 10000,amt = 12000,pin = 7777;
		if(pin == 7777)
		{
			System.out.println("-----------PIN Valid-----------\nYour account balance is : "+bal);
			if(bal > amt )
			{	
				bal = bal - amt;
				System.out.println("Please wait while processing your Transaction\n-----Please take Your Money-----\nYour Remaining Balance is : "+bal+"\nThank you for using our Simple ATM\n--------Have a Nice DaY..--------");
			}
			else
			{
				System.out.println("You have not enough Balance to proceed this Transaction\nPlease try again later..........");
			}
		}
		else
			{
				System.out.println("PIN Invaid/nPlease Try again.....");
			}
		}

	
}
