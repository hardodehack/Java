package ArraySorting;
import java.util.Arrays;

public class DemoArraySorting 

{
	
	public static void main(String[] args) {
		
	
	int[] as = new int[5];
	as[0]=12;
	as[1]=20;
	as[2]=1;
	as[3]=15;
	as[4]=99;
	
	for(int i:as)
	{
		System.out.println(i);
	}
	
	Arrays.sort(as);
	
	for(int i:as)
	{
		System.out.println(i);
	}
	
	
}
}
