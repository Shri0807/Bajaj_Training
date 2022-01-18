package TestPackage;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char size = 'M';
		switch(size)
		{
		case 'S'  : System.out.println("size is small");   
					break; 
	    case 'M'  : System.out.println("size is medium");  
	    			break;
	    case 'L'  : System.out.println("size is large");   
	    			break;
	    case 'X'  :	System.out.println("size is X-large"); 
	    			break;
		default:
		    		System.out.println("Invalid Input");
		}

	}

}
