import java.util.*;

public class Lexico_graph 
{
	public void lexico() 
	{
		String[] str=new String[5];
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 5 strings: ");
		for(int i=0;i<5;i++) 
		{
			str[i]=scan.nextLine();
		}
		System.out.println("Strings before sorting ");
		for(int i=0;i<5;i++) 
		{
			System.out.println(str[i]);
		}
		for(int i=0;i<5;i++) 
		{
			for(int j=1; j<5-i;j++) 
			{
				if(str[j-1].compareTo(str[j])>0) 
				{
					String temp=str[j-1];
					str[j-1]=str[j];
					str[j]=temp;
				}
			}

		}
		System.out.println("Strings after sorting ");
		for(int i=0;i<5;i++) 
		{
			System.out.println(str[i]);
		}
	}
	public static void main(String[] args) 
	{
		Lexico_graph obj=new Lexico_graph();
		obj.lexico();
	}
}
