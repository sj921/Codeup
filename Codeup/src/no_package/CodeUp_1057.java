package no_package;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp_1057 {

	public static void main(String[] args) throws IOException {
		
		System.out.print(">> ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String arr[] = br.readLine().split(" ");
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		
		if (a == 0 && b == 0) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
		
	}

}
