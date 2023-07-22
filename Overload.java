import java.util.*;
class Overload
{
  public void operate(int a[])
  {
    for(int i=0;i<a.length;i++)
     {
       for(int j=0;j<a.length-1;j++)
       {
          if(a[j]>a[j+1])
          {
          
            int temp=a[j];
            a[j]=a[j+1];
            a[j+1]=temp;
          }
        }
     }
     for(int x:a)
     {
       System.out.print(x +" ");
     }
     System.out.println("");
   } 
  public void operate(int b[],int key)
   {
    for(int i=0;i<b.length;i++)
     {
          if(b[i]==key)
          {
            System.out.println("Key found at index: "+i);
            return;         
          }
      }
      System.out.println("Key not found");
   }
  
  public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
     Overload o=new Overload();
     System.out.println("Enter the size of the array to be sorted");
     int l1=sc.nextInt();
     int a1[]=new int[l1];
     System.out.println("Enter the "+l1+" elements");
     for(int i=0;i<l1;i++)
      {
        a1[i]=sc.nextInt();
      }
     o.operate(a1);
     System.out.println("Enter the array element to be searched");
     int l2=sc.nextInt();
     int a2[]=new int[l2];
     System.out.println("Enter the "+l2+" elements");
     for(int i=0;i<l2;i++)
      {
        a2[i]=sc.nextInt();
      }
     System.out.println("Enter the element to be searched");
     int key=sc.nextInt(); 
     o.operate(a2,key);
   }
  }  
        
        
        
     
     

