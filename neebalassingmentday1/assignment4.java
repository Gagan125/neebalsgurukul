package neebalassingmentday1;

import java.util.Scanner;

public class assignment4
// question 4 Bluebird bus service operates abusonly when its entire 50seats are occupied. X
//numberof bookings have beenmade fortheday. Find thenumber of people fromXwho
//will gettotravel today.
//Case 1:
//Input : X= 109
//Output:PeopleTravelling=100
//Case 2:
//Input :X = 49
//Output : People Travelling = 0
//Hint : No.of passengers travelling = 50 * (x//50)
		{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("People Travelling");
		int x=sc.nextInt();
		        int a = 50 * (x / 50);
		        System.out.println("People Travelling = " +a);
		    }

	}


