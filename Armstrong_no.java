package java_Interview_Ques;
import java.util.Scanner;
public class Armstrong_no {

	public static void main(String[] args) 
	{
       Scanner s=new Scanner(System.in);
       int pro=0,sum=0;
       int n=s.nextInt();
       int temp=n;
       while(n>0)
       {
       int rem=n%10;
       pro=rem*rem*rem;
       sum+=pro;
       n=n/10;
       }
       if(temp==sum)
       {
    	   System.out.println("Armstrong number");
       }
       else
    	   System.out.println("Not a Armstrong");
	}

}
