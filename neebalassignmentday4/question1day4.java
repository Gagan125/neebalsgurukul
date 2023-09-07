package neebalassignmentday4;

import java.util.Scanner;

//Question1-:Write a program to input an array from the user and reverse the order of elements in an
//array in place i.e. without using any additional arrays.
public class question1day4 {
public static void main(String[] args) {
	
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number of elements: ");
    int n = scanner.nextInt();
    int[] a= new int[n];
    System.out.print("Enter the array elements: ");
    for (int i = 0; i < n; i++) {
        a[i] = scanner.nextInt();
    }
    for (int i = 0, j = n - 1; i < j; i++, j--) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    System.out.print("Reversed array: ");
    for (int x : a) {
        System.out.print(x + " ");

    }
}
}


