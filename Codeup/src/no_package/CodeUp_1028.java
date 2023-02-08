package no_package;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp_1028 {

	public static void main(String[] args) throws IOException {
		
		System.out.print(">> ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		long num = Long.parseLong(str);
		
		System.out.printf("%d", num);
		
	}		
}


//	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	String data = br.readLine();
//	String arr[] = data.split("");
//	for (int i = 0; i < arr.length; i++) {
//		System.out.print(String.format("%s", arr[i]));