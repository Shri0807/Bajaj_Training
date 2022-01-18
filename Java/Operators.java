package TestPackage;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=2;
		
		//shift operators
		int left_shift = a << 2;
		System.out.println("Left Shift: " + left_shift);
		int right_shift = a >> 2;
		System.out.println("Right Shift: " + right_shift);
		
		//Relational operators
		int num1=10, num2=20, num3=20;
		System.out.println(num1==num2);
		System.out.println(num1!=num2);
		System.out.println(num1>num2);
		System.out.println(num1<num2);
		System.out.println(num2<=num3);
		System.out.println(num2>=num3);
		
		//Bitwise Operators
		int b=5, c=7;
		/*
		 * b   0101
		 * c | 0111
		 * ----------
		 * 	   0111 = 7
		*/
		System.out.println(b|c);
		
		/*
		 * b   0101
		 * c & 0111
		 * ----------
		 * 	   0101 = 5
		*/
		System.out.println(b&c);
		
		/*
		 * b   0101
		 * c ^ 0111
		 * ----------
		 * 	   0010 = 2
		*/
		System.out.println(b^c);
		
		System.out.println(~b); //Will Give 2's complement
	}

}
