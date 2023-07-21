package Yashwanth;
import java.util.*;

public class Calculator {

	static public void main(String[] args) 
	{
		int op1,op2;
		int ch;
		double ans=0;
		Scanner ob=new Scanner(System.in);
		System.out.println("1.Addition\n2.Substraction\n3.Multiplication\n4.Division\n5.Exit\nChoose the operation to perform");
		ch=ob.nextInt();
		System.out.println("Enter the first operand");
		op1=ob.nextInt();
		System.out.println("Enter the second operand");
		op2=ob.nextInt();
		switch(ch)
		{
		case 1:ans=op1+op2;
		System.out.println("The result is :"+ans);
		break;
		case 2:ans=op1-op2;
		System.out.println("The result is :"+ans);
		break;
		case 3:ans=op1*op2;
		System.out.println("The result is :"+ans);
		break;
		case 4:ans=op1/op2;
		System.out.println("The result is :"+ans);
		break;
		case 5:System.exit(0);
		default:System.out.println("Invalid Input");
		}
	}

}
