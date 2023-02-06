package no_package;

import java.util.Scanner;

public class CodeUp_1019 {

	public static void main(String[] args) {
		System.out.printf(">> ");
		Scanner sc = new Scanner(System.in);
		String[] date = sc.nextLine().split("\\.");
		int year = Integer.parseInt(date[0]);
		int month = Integer.parseInt(date[1]);
		int day = Integer.parseInt(date[2]);		
		System.out.printf("%d.%02d.%02d", year, month, day); 		  
	}
}
