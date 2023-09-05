package neebalassignmentday2;

import java.util.Scanner;
// question 4 Print first 10 even fibonacii numbers
public class assignmentquesion4 {
   public static void main(String[]args) {
	   Scanner sc=new Scanner(System.in);
	    //System.out.println("find the frist 10 even no febonacci series");
	    int n=sc.nextInt();
	    int x1=0,x2=1,x3 = 0;
	    System.out.println();
	    for(int i=2;i<=n;i++) {
	     x3=x1+x2;
	     if( x3%2==0) {
	  	   System.out.print(" "+x3);
	     }
	 x1=x2;
	 x2=x3;
   }
   }
   }