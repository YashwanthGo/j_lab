import java.util.*;
interface A
{
   interface B
   {
	   public void ishappy(int n);
   }
}
public class happy implements A
{
    public static int squaresumdigit(int n)
    {
    	int a,sum=0;
    	while(n>0)
    	{
    	   a=n%10;
    	   sum+=a*a;
    	   n=n/10;
    	}
    	return sum;
    }
    public static void ishappy(int n)
    {
    	int a=squaresumdigit(n);
    	if(a<10)
    	{
    		if(a==1)
    			 System.out.println("Is a Happy Number");
    		else
    		     System.out.println("Not is not a Happy Number");
    	}
    	else
    	{
    		ishappy(a);
    	}
    }
    
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
	    ishappy(n);
	}

}
