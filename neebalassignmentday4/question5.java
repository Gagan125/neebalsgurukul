package neebalassignmentday4;
 
import java.util.Scanner;
//Write a program to input an array from the user and find the index of the smallest element
//in the array.
public class question5 {
public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("ELEMENTS:");
	int n=sc.nextInt();
	int a[]=new int[n];
	System.out.println("ARRAYS:");
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
		
	}
  int min =0;
  for(int j=1;j<a.length;j++) {
	  if(a[min]>a[j]) {
		min=j;  
		  }
}
  System.out.println("ANSWER:"+min);
    }
}

