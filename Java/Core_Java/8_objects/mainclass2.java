import java.util.Scanner;
class mainclass2 
{
	public static void main(String[] args) 
	{
		int choice,n;
		TicketCounter tc = new TicketCounter();
		Scanner s = new Scanner(System.in);
		System.out.println("Welcome To Our Online Ticket Booking Center");
		System.out.println("1. Press 1 to Show Avaliable Tickets\n2. Press 2 to Book Tickets\n3. Press 3 to Cancle Ticket");
		choice = s.nextInt();
		switch(choice)
		{
			case 1:
			{
				tc.DisplayTicket();
			}
			case 2:
			{
				System.out.println("Enter Number of Tickets you want to book here");
				n = s.nextInt();
				tc.BookTickets(n);
				break;
			}
			case 3:
			{
				System.out.println("Enter Number of Tickets you want Cancle\nThank you..........");
				n = s.nextInt();
				tc.CancleTicket(n);
				break;
			}
			default:
				System.out.println("You Entered Wrong Choice......");
		}
	}
}
