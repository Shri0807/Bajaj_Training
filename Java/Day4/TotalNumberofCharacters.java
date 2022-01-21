package Day4;

public class TotalNumberofCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello World! My name is Shrikumar";
		int count=0;
		for(int i=0;i<s.length(); i++)
		{
			if(s.charAt(i) != ' ')
			{
				count++;
			}
		}
		System.out.println("Total Number of Character: " + count);
	}

}
