package no_package;

import java.util.Scanner;

public class CodeUp_1046 {

	public static void main(String[] args) {
		System.out.print(">> ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int sum = a + b + c;
		double avg = sum / 3.0;
		System.out.printf("%d\n%.1f", sum, avg);
	}
}
