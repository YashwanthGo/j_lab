import java.util.*;
public class BinarySearch {
public void sort(int[] array, int n) {
for(int i=0;i<n;i++) {
for(int j=1;j<n-i;j++) {
if(array[j-1]>array[j]) {
int temp=array[j-1];
array[j-1]=array[j];
array[j]=temp;
}
}
}
}
public void bin_search(int[] array,int key,int n) {
int high=n-1,low=0,flag=0,mid=0;
while(low<=high) {
mid=(high+low)/2;
if(array[mid]==key) {
flag=1;
break;
}
if(key>array[mid]) {
low=mid+1;
}
if(key<array[mid]) {
high=mid-1;
}
}
if(flag==1) {
System.out.println("Element found");
}
else {
System.out.println("Element not found");
}
}
public static void main(String[] args) {
int array[]=new int[10];
System.out.println("Enter no. of elements: ");
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
System.out.println("Enter "+n+" elements: ");
for(int i=0;i<n;i++) {
array[i]=scan.nextInt();
}
System.out.println("Enter element to be searched: ");
int key=scan.nextInt();
BinarySearch obj=new BinarySearch();
obj.sort(array,n);
obj.bin_search(array,key,n);
}
}
