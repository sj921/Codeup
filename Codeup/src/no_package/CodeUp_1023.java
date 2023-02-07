package no_package;

import java.util.Scanner;

public class CodeUp_1023 {

	public static void main(String[] args) {
		System.out.print(">> ");
		Scanner sc = new Scanner(System.in);
		String[] num = sc.next().split("\\.");
		int a = Integer.parseInt(num[0]);
		int b = Integer.parseInt(num[1]);
		System.out.printf("%d\n%06d", a, b);
	}
}
