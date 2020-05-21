package java_Interview_Ques;
import java.util.Scanner;
public class Leap_year {

	public static void main(String[] args) 
	{
		System.out.print("Enter Year: ");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if((n%400==0) || (n%4==0 && n%100!=0))
		{ 
			if(n>2020)
			System.out.println("It is leap year");
			else
				System.out.println("It was a leap year");
		}
		else
		System.out.println("Not a leap year");
		
		
			
	}

}
