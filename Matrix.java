package Yashwanth;
import java.util.*;
public class Matrix {

	public static void sum(int a[][],int b[][], int n, int m)
	{
		int c[][]=new int[10][10];
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("After Addition\n");
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.println(c[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		int a[][]=new int[10][10];
		int b[][]=new int[10][10];
		int i,j,m,n;
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the number of rows and columns:\n");
		n=ob.nextInt();
		m=ob.nextInt();
		System.out.println("Enter the elements of 1st matrix");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				a[i][j]=ob.nextInt();
			}
		}
		System.out.println("Enter the elements of 2nd matrix");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				b[i][j]=ob.nextInt();
			}
		}
		sum(a,b,n,m);
	}

}
