package java_Interview_Ques;
import java.util.Scanner;
public class Reverse_number {

	public static void main(String[] args) 
	{
		int temp,rev=0;
		System.out.print("Enter value: ");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		temp=n;
		while(n>0)
		{
		int rem=n%10;
		rev=rev*10+rem;
		n=n/10;
		}
		System.out.println("Original value: "+temp);
		System.out.println("Reversed value: "+rev);
	}

}
