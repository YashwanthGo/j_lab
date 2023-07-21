package Yashwanth;
import java.util.*;
public class Separate {
	public static void Transpose(int b[][],int m,int n)
	{
		int c[][]=new int[10][10];
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				c[j][i]=b[i][j];
			}
		}
		System.out.println("Transpose:");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.println(c[i][j]+" ");
			}
			System.out.println("\n");
		}
	}
	public static void Separate(int a[])
	{
		int e[]=new int[10];
		int o[]=new int[10];
		int i,j,p=0,q=0;
		for(i=0;i<a.length;i++)
		{
			if((a[i]%2)==0)
			{
				e[p++]=a[i];
			}
			else
			{
				o[q++]=a[i];
			}
		}
		System.out.println("Even Number:");
		for(i=0;i<p;i++)
		{
			System.out.println(e[i]+" ");
		}
		System.out.println("Odd Number:");
		for(i=0;i<q;i++)
		{
			System.out.println(o[i]+" ");
		}
	}
	public static void main(String[] args) 
	{
		int a[]=new int[10];
		int b[][]=new int[10][10];
		int i,j,m,n;
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the Elements to separate even and odd");
		for(i=0;i<10;i++)
		{
			a[i]=ob.nextInt();
		}
		Separate(a);
		System.out.println("Enter the number of Rows and Columns of matrix to find Transpose:");
		m=ob.nextInt();
		n=ob.nextInt();
		System.out.println("Enter the matrix to find transpose:");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				b[i][j]=ob.nextInt();
			}
		}
		Transpose(b, m, n);
	}

}
