package arrays_interviewQues;
import java.util.Scanner;
public class Intersection_ofArrays 
{

	public static void main(String[] args) 
	{
		int i,j=0;
		Scanner s=new Scanner(System.in);
		int arr1[]= {12,23,34,56};
		int arr2[]= {21,27,12,34};
		int size1=arr1.length;
		int size2=arr2.length;

		for(i=0;i<size1;i++)
		{
			for(j=0;j<size2;j++)
			{
				if(arr1[i]==arr2[j])
				{
					System.out.println(arr2[j]);
				}
			}
		}
		

	}

}
