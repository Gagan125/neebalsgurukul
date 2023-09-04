package neebalassingmentday1;
public class Assignment3 
//Given the days expressin the formof Years: Months:Weeks:
//Days
//Test Case:
//Input : 1020 days
//Output: 2 Years : 9 Months: 2 Weeks : 6 Days
//Hint : 365 days make a year, 30 days make a month , 7 days make a week  
{
	public static void main(String[] args) {
		
	  int days=1020;
      int year = days / 365;
      int month = (days % 365) / 30;
      int week = ((days % 365) % 30) / 7;
      int remainingDay = ((days % 365) % 30) % 7;
      
      System.out.println(year + " Year : " + month + " Month : " + week + " Week : " + remainingDay + " Day");
      
}

	
}

