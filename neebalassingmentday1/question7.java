package question5session2;
//1
//2 2
//3 3
//4 4
//5 5
//4 4
//3 3
//2 2
//1
import java.util.Scanner;

public class question7 {

	public static void main(String[] args) {
	
		
		for (int i = 1; i <=5; i++) {
			
		    for (int j = 5; j >= 1; j--) {
		    	
		    	if(i==j) {
		    		System.out.print(j);
		    	}
		        
		    	else {
		    		System.out.print(" ");
		    	}
		    }

		    for (int j = 2; j <= 5; j++) {
		    	if(i==j)
		    	System.out.print(j);
		    	else
		    		System.out.print(" ");
		    }

		    System.out.println();
		}
		
		for (int i = 4; i >=1; i--) {
		    for (int j = 5; j >= 1; j--) {
		    	if(i==j)
		        System.out.print(j);
		    	else
		    		System.out.print(" ");
		    }

		    for (int j = 2; j <= 5; j++) {
		    	if(i==j)
		    	System.out.print(j);
		    	else
		    		System.out.print(" ");
		    }

		    System.out.println();
		}
	}

}
