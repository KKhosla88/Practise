package arrays_interviewQues;
import java.util.HashMap;
import java.util.Scanner;
public class Duplicates {

	public static void main(String[] args) 
	{
		HashMap<Integer,Integer>hm=new HashMap<>();
		try (Scanner s = new Scanner(System.in))
		{
			int size=s.nextInt();
			int arr[]=new int[size];
			for(int i=0;i<size;i++)
			arr[i]=s.nextInt();
			for(int i=0;i<size;i++)
			{
			  if(hm.containsKey(arr[i]))
				  hm.replace(arr[i],hm.get(arr[i])+1);
			  else
				  hm.put(arr[i],1);
			}
		}
		System.out.println("Duplicate Values: ");
		  for(HashMap.Entry<Integer,Integer>m:hm.entrySet())
	        {
	            if(m.getValue()>1)
	            System.out.print(m.getKey());
	        }
	}

}
