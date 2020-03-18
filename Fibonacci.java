package practise;

import java.util.Scanner;

public class Fibonacci 
{

	public static void main(String[] args) 
	{
		int ans=0;
		int first=0;
		int second=1;
		System.out.println(first+" "+second);
		try (Scanner s = new Scanner(System.in)) {
			//you can just give count="any integer value upto which u want ur series" rather than scanning
			int n=s.nextInt();
			for(int i=2;i<n;i++)
			{
				ans=first+second;
				System.out.print(ans+" ");
				first=second;
				second=ans;
				
			}
		}
	}

}
