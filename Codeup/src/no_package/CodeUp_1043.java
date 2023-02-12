package no_package;

import java.util.Scanner;

public class CodeUp_1043 {
	
	public static void main(String[] args) {
		System.out.print(">> ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int answer = a % b;
		System.out.printf("%d", answer);
		
	}
}
