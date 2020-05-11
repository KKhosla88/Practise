package java_Interview_Ques;
import java.util.Scanner;
public class Reverse_String {

	public static void main(String[] args) 
	{
		String original,reverse="";
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a String: ");
        original =s.nextLine();
        int len= original.length();
        for(int i=len-1;i>=0;i--)
        {
        	reverse+=original.charAt(i);
        }
        System.out.print(reverse);
	}

}
