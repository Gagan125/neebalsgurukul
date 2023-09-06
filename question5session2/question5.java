package question5session2;

import java.util.Scanner;

//5
//4 5
//3 4 5
//2 3 4 5
//1 2 3 4 5
public class question5 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("PATERN PROGRAME-:");
	int x=sc.nextInt();
	for(int i=x;i>=1;i--) {
		for(int j=i;j<=x;j++) {
			System.out.print(j);
		}System.out.println(" ");
	}
	
	
}
}
