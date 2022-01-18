package TestPackage;

public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,b=0,flag=0;
		int a=10;//it is the number to be checked    
		b=a/2;
		
		if(a==0||a==1)
		{  
		   System.out.println(a+" is not prime number");      
		}
		else
		{  
		   for(i=2;i<=b;i++)
		   {      
		    if(a%i==0)
		    {      
		     System.out.println(a+" is not prime number");      
		     flag=1;      
		     break;      
		    }      
		   }
		}
		if(flag==0)  
		{ 
			System.out.println(a+" is prime number"); 
		}

	}

}
