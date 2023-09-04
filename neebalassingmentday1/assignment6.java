package neebalassingmentday1;
//3 Digit Armstrong No.
//Input a 3 digit number and find whether the given number is an “Armstrong Number”
//(Student)
//Definition of an Armstrong Number: Cubic sum of its digit is equal to the number
//3 Digit Armstrong No.
//Input a 3 digit number and find whether the given number is an “Armstrong Number”
//(Student)
//Definition of an Armstrong Number: Cubic sum of its digit is equal to the number

import java.util.Scanner;

public class assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println();
         int x=sc.nextInt();
    
         int temp=x;
         int d1=x/100;
         int d2=(x%100)/10;
         int d3=x%10;
         int result= (int) ((int) Math.pow(d1, 3)+ Math.pow(d2, 3) + Math.pow(d3, 3));
         System.out.println(result);
         if (temp==result) {
      System.out.println("then it is armstrong no");
         }
         else { 
         System.out.println("then it is not an armstrong no");
         }
         
	}

}
