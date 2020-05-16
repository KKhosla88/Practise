package java_Interview_Ques;
import java.util.Scanner;
public class Square_root {
	
	public static double sqroot(int num)
	{
		double temp;
		double rem=num/2;
		do
		{
			temp=rem;
			rem=(temp+(num/temp))/2;
		}
		while((temp-rem)!=0);
			return rem;
	}

	public static void main(String[] args) 
	{
		System.out.print("Enter any number: ");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println("Square root of "+n+" :"+sqroot(n));
	}

}
