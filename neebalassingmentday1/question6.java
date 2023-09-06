package question5session2;

import java.util.Scanner;
//A
//C B
//E D C
//G F E D
//I H G F E
//G F E D
//E D C
//C B
//A
public class question6 {
public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("");
	    int x=sc.nextInt();
	    	for(int i=1;i<=5;i++)
	    	{
	    		for(int j=i*2-1;j>=i;j--){
	    			System.out.print((char)(j+64));
	    		}
	    		System.out.println(" ");
	    	}
	    	for(int i=x;i>=1;i--) {
	    		for(int j=i*2-1;j>=i;j--) {
	    			System.out.print((char)(j+64));
	    		}System.out.println(" ");
	    	}
	    	
}
}
