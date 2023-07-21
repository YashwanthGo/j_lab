package Yashwanth;

import java.util.*;
public class Pyramid {
	public static void main(String args[]) {
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter the number of levels for pyramid:");
		int levels=ob.nextInt();
		for(int row=1;row<levels+1;row++)
		{
			for(int space=row;space<levels;space++)
			{
				System.out.print(" ");
			}
			for(int col=row;col<=2*row-1;col++)
			{
				System.out.print(col+" ");
			}
			for(int k=2*row-2;k>=row;k--)
			{
				System.out.print(k+" ");
			}
			System.out.println();
						
		}
	}
}

