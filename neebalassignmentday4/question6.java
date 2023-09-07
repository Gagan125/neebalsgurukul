package neebalassignmentday4;
//The following arrays shows the profits of a company from 2001 to 2010:
//int[] profits = {12, 18, 20, 38, 53, 93, 77, 61, 59, 56};
//Write a program to find which year the decline in profits began.
import java.util.Scanner;

public class question6  {
	public static void main(String[] args) 
	{
		int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter the numbers you want to add to the array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
		       
		        int year = 2001;
		        
		        for (int i = 0; i < a.length - 1; i++) {
		            if (a[i] > a[i + 1]) {
		                year += i + 1; 
		  
		                System.out.println("declined profit in the Year " + year + ": " + a[i + 1]); 
		                break;
		            }		    
	}

	}
}
