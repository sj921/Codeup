package no_package;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp_1053 {

	public static void main(String[] args) throws IOException {
		
		System.out.print(">> ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int data = Integer.parseInt(br.readLine());
		
		if (data == 1) {
			System.out.println("0");
		} else {
			System.out.println("1");
		}
		
	}

}
