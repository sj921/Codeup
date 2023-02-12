package no_package;

import java.util.Scanner;

public class CodeUp_1045 {
	
	public static void main(String[] args) {
		System.out.print(">> ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = a + b;
		int difference = a - b;
		int multiply = a * b;
		int quotient = a / b;
		int remainder = a % b;
		double divided = (long)a / (b * 1.0);
		System.out.printf("%d\n%d\n%d\n%d\n%d\n%.2f\n", 
				sum, difference, multiply, quotient, remainder, divided);
		
		
	}
}
