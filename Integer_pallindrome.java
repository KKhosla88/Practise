package java_Interview_Ques;
import java.util.Scanner;
public class Integer_pallindrome {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int add=0,temp,rem;
		temp=n;
		while(n>0)
		{
		 rem=n%10;
		add=add*10+rem;
		n=n/10;
		}
     if(temp==add)
		{
			System.out.println("Integer is pallindrome");
		}
		else
			System.out.println("Integer is not pallindrome");
	}

}
