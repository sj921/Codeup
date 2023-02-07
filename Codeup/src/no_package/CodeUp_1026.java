package no_package;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp_1026 {

	public static void main(String[] args) throws IOException {
		System.out.print(">> ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String time = br.readLine();
		String arr[] = time.split(":");
		int h = Integer.parseInt(arr[0]);
		int m = Integer.parseInt(arr[1]);
		int s = Integer.parseInt(arr[2]);
		System.out.printf("%d", m);
		
	}
}
