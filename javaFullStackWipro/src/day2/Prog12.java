package day2;

import java.util.Scanner;
public class Prog12 {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter first number: ");
	        int a = sc.nextInt();
	        System.out.print("Enter second number: ");
	        int b = sc.nextInt();
	        int temp = a;
	        a = b;
	        b = temp;
	        System.out.println("After swapping: a = " + a + ", b = " + b);
	        sc.close();

	}

}
