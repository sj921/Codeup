package no_package;

import java.util.Scanner;

public class CodeUp_1035 {

	public static void main(String[] args) {
		System.out.print(">> ");
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		int hex = Integer.valueOf(num, 16);
		System.out.printf("%o", hex);
	}
	
}
