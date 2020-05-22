package java_Interview_Ques;
import java.util.Scanner;

public class String_Pallindrome {

	public static void main(String[] args) 
	{
		String original,reverse="";
		Scanner s=new Scanner(System.in);
		System.out.print("Enter String: ");
		original=s.nextLine();
		int len=original.length();
		for(int i=len-1;i>=0;i--)
		{
			reverse+=original.charAt(i);
		}
		if(original.equals(reverse))
		{
			System.out.println("Stirng is pallindrome");
		}
		else
			System.out.println("String is not pallindrome");
	}

}
