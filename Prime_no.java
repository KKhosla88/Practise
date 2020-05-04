package java_Interview_Ques;
import java.util.*;
public class Prime_no 
{
	public static void main(String[] args) 
	{
		int count=0;
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       for(int i=1;i<=n;i++)
       {
    	   if(n%i==0)
           {
    		   count++;
           }
       }
       if(count==2)
       System.out.println(n+" "+"Number is prime");
       else
        System.out.println(n+" "+"Number is not prime");
     }
}
