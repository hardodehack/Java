/*Program 1 :- Introduction to variable and use of " final " keyword */



class program1
	{
		public static void main(String args[])
			{
				int i = 12;
				final double d2 = 77.77;
				char c1 = 'a';
				float f1 = 11.11f;
				//d2 = 66.66;     // it will print error because when we use final then we cannot reassign value to that variable
				System.out.println("i = "+i+"\nd2 = "+d2+"\nc1 = "+c1+"\nf1 = "+f1);
			}
}