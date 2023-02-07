package no_package;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp_1024 {
	
	public static void main(String[] args) throws IOException {
		System.out.print(">> ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String data = br.readLine();
		String array[] = data.split("");
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(String.format("\'%s\'", array[i]));
		}
	}
}
