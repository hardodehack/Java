class TicketCounter
{
	int avl_tickets = 30;
	void BookTickets(int n)
	{
		if(avl_tickets >= n)
		{
			System.out.println("Booking Your " +n+ " Tickets");
			System.out.println("Your " +n+ " Tickets Confirmed");
			System.out.println("----------------------------");
			avl_tickets = avl_tickets - n;
			System.out.println("Thank you.......");
		}
		else
		{
			System.out.println("Sorry " +n+" Tickets are not Avaliable..... ");
			System.out.println("Thank you.......");
		}
	}
	void CancleTicket(int n)
	{
		System.out.println(n + " Tickets Successfully Cancelled ");
		avl_tickets = avl_tickets + n;
		System.out.println("Now Avaliable Ticket is "+avl_tickets);
		System.out.println("Thank you.......");
		System.out.println("----------------------------");
	}
	void DisplayTicket()
	{
		System.out.println("Avaliable Tickets is "+avl_tickets);
		System.out.println("----------------------------");
	}
	
}
class mainclass1
{
	public static void main(String[] args)
	{
		TicketCounter tc = new TicketCounter();
		tc.DisplayTicket();
		tc.BookTickets(80);
		tc.DisplayTicket();
		tc.CancleTicket(10);
		tc.DisplayTicket();
	}
}