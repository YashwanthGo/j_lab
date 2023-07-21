package Yashwanth;

import java.util.*;
public class Password {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter name , mobile number ,room number");
		String name=sc.nextLine();
		String mobno=sc.nextLine();
		int roomn=sc.nextInt();
		String l="QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm0123456789~!@#$&.,";
	    String pass=" "; 
	    Random r=new Random();
	    pass=pass+name.charAt(r.nextInt(name.length()-1))+mobno.charAt(r.nextInt(mobno.length()-1));
 		for(int i=1;i<=4;i++)
	    {
		int ra=r.nextInt(l.length()-1);
		pass=pass+l.charAt(ra);
	    }
 		System.out.println("Password is "+pass);
	}

}
