package no_package;

import java.util.Scanner;

public class CodeUp_1018 {

	public static void main(String[] args) {
		System.out.printf(">> ");
		Scanner sc = new Scanner(System.in);
		String time[] = sc.next().split(":");
		System.out.print(time[0] + ":" + time[1]);
	}
}
