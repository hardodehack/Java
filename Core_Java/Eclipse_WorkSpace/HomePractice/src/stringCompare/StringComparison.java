package stringCompare;
public class StringComparison 
{
	
	String s1 = "Parth Patel";// Without using new operator // Non Constant heap pool area
	String s2 = new String("Hardik Patel");// Using new Operator // Stored in Constant Pool heap area
	String s3 = "Parth Patel";
	String s4 = new String("Hardik Patel");
	
	int b1 = s1.compareTo(s2);
	int b2 = s1.compareTo(s3);
	int b3 =s1.compareTo(s4);
		
		
	
}

