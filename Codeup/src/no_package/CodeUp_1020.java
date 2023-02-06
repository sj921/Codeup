package no_package;

import java.util.Scanner;

public class CodeUp_1020 {
	
	public static void main(String[] args) {
		
		System.out.print(">> ");
		Scanner sc = new Scanner(System.in);		
		String[] juminNo = sc.nextLine().split("\\-");
		int front = Integer.parseInt(juminNo[0]);
		int back = Integer.parseInt(juminNo[1]);
		System.out.printf("%06d%07d", front, back);

		
	}
	
}
