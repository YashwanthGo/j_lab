package Yashwanth;

import java.util.*;
interface BuzzNumber{
	public void check(int N);
}
interface Frequency_array{
	public void freq(int a[]);
}
public class MultipleInheritance implements BuzzNumber, Frequency_array {
	public void check(int N){
		if(N%10==7 || N%7==0)
			System.out.println("The number is Buzz Number");
		else
			System.out.println("The number is not Buzz Number");
	}
	public void freq(int a[]) {
		//Sort the array
		int count,x;
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j])
				{
					int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		System.out.println("Frequency of each element:");
		int i=0;
		do
		{
			count=1;
			x=a[i];
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
					count++;
			}
			System.out.println(a[i]+" : "+count);
			i++;
			while(i<a.length) {
				if(a[i]==x)
					i++;
				else
					break;
			}
		}while(i<a.length);
	}
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		System.out.println("Enter the number");
		int n=sc.nextInt();
		MultipleInheritance obj=new MultipleInheritance();
		obj.check(n);
		System.out.println("Enter the array elements");
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		obj.freq(a);
	}
}