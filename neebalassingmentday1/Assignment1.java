package neebalassingmentday1;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	 Question 1-:	Convert MillSec To Hrs,Mins,Secs
//		Given the time in milliseconds express in the form of Hours: Minute: Seconds
//		Sample:
//		Input: 7000234
//		Output: 1: 56: 40
//		Hint: 1000 milliseconds make 1 second
//		60 Seconds makes 1 minute
//		60 minutes make 1 hour
		
		long millisecond = 7000234;
		long second = millisecond/1000;
		long min=second/60;
		long hr=min/60;
		
		second=second%60;
		min=min%60;
		
		System.out.println(hr+":"+min+":"+second);

		
	}

}
