package no_package;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp_1030 {

	public static void main(String[] args) throws IOException {
		
		System.out.print(">> ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		Long num = Long.parseLong(str);
		System.out.print(String.format("%d", num));
		
		
		
	}
	
	
	
}
