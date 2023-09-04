package neebalassingmentday1;
//Question 7 The military uses a 4-digit number system for communicating the time of day. For
//example, 2350 hours ie 23 hours and 50 minutes in 24-hour clock which is 11:50pm.
//Write a program to input the 4-digit time and convert it to 12-hour format.

//Eg: 2350 >>> 11:50pm

public class assidnment7 {
//    public static void main(String []args);
    public static void main(String[] args) {
		int time=2350;
		int hr=time/100;
		int min=time%100;
		//System.out.println(hr+""+min);
		
		boolean bln=(hr<12?true:false);
		if(hr>12) {
			hr=hr-12;
		}
		else {
			hr=12;
		}
		if(bln=true) {
			System.out.println(hr+":"+min+"PM");
		}
		else {
			System.out.println(hr+":"+min+"AM");
		}
	}
    
}
