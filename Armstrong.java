package Yashwanth;
import java.util.*;
public class Armstrong {
    
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        int digits = String.valueOf(number).length();
        
        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }
        
        return sum == originalNumber;
    }
    
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter a number to check if the number is armstrong or not: ");
        int n=ob.nextInt();
        if (isArmstrong(n)) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
    }
}

      
     
