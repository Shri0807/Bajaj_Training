package Day4;

public class PrintDuplicateValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 1, 3, 4, 5, 6, 5, 7, 9, 9};
		
		for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }

	}

}
