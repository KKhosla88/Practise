package java_Interview_Ques;

public class Fibonacci_Recurssion 
{
	static int n1=0,n2=1,n3=0;
	static void PrintFibonacci(int count)
	{
		if(count>0)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
			PrintFibonacci(count-1);
		}
	}
	public static void main(String[] args) 
	{
		int count=10;
		System.out.print(n1+" "+n2);//print 0 and 1
		PrintFibonacci(count-2);//because first 2 already printed
	}

}
