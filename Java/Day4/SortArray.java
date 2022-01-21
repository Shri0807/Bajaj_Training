package Day4;
import java.util.*;
public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {6, 5, 8, 9, 1, 4, 2, 5, 3};
		System.out.println("Ascending Order");
		for (int i = 0; i < arr.length; i++)   
		{  
			for (int j = i + 1; j < arr.length; j++)   
			{  
				int tmp = 0;  
				if (arr[i] > arr[j])   
				{  
					tmp = arr[i];  
					arr[i] = arr[j];  
					arr[j] = tmp;  
				}  
			}
			System.out.print(arr[i] + " ");
		}
		
		
		System.out.println("\n\nUsing inbuilt method.");
		int arr1[] = {6, 5, 8, 9, 1, 4, 2, 5, 3};
		
		Arrays.sort(arr1);
		for (int i = 0; i < arr1.length; i++)   
		{       
			System.out.print(arr1[i] + " ");   
		}
		
		System.out.println("\n\nArray in Descending Order");
		
		int temp;
		for (int i = 0; i < arr.length; i++)   
		{  
			for (int j = i + 1; j < arr.length; j++)   
			{  
				if (arr[i] < arr[j])   
				{  
					temp = arr[i];  
					arr[i] = arr[j];  
					arr[j] = temp;  
				}  
			}
			System.out.print(arr[i] + " ");
		}
	}

}
