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
//		System.out.println("Size of arr1: ");
//		int size1=s.nextInt();
//		int arr1[]=new int[size1];
//		System.out.print("Elements of arr1: ");
//		for( i=0;i<size1;i++)
//		{
//			arr1[i]=s.nextInt();
//		}
//		System.out.println("Enter size of arr2: ");
//		int size2=s.nextInt();
//		int arr2[]=new int[size2];
//		System.out.print("Elements of arr2: ");
//		for(j=0;j<size2;j++)
//		{
//			arr2[j]=s.nextInt();
//		}
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
