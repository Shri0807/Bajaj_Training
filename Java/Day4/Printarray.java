package Day4;

public class Printarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		System.out.println("Using For Loop");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("\nUsing For Each Loop");
		for(int i:arr)
		{
			System.out.print(i + " ");
		}

	}

}
