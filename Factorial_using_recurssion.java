package java_Interview_Ques;

import java.util.Scanner;

public class Factorial_using_recurssion 
{
	public static int factorial(int n)
	{
		if(n==0)
			return 1;
		else
			return(n*factorial(n-1));
	}

	public static void main(String[] args) 
	{
		System.out.print("Enter number: ");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i,fact=1;
		int number=n;
		fact=factorial(number);
		System.out.println("Factorial of "+number+" is "+fact);
	}

}
