package java_Interview_Ques;
import java.util.*;
public class GCD_of_two_nums {
	
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 1st num: ");
		int num1=s.nextInt();
		System.out.println("Enter 2nd num: ");
		int num2=s.nextInt();
		System.out.println("GCD of "+num1+" and "+num2+" is :" + findGCD(num1,num2) );
	}

	
	private static int findGCD(int num1,int num2)
	{
		if(num2==0)
			return num1;
		return findGCD(num2,num1%num2);
	}

}
