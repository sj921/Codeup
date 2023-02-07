package no_package;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp_1025 {
	
	public static void main(String[] args) throws IOException {
		
		System.out.print(">> ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String data = br.readLine();
		String arr[] = data.split("");
		int a = Integer.parseInt(arr[0]) * 10000;
		int b = Integer.parseInt(arr[1]) * 1000;
		int c = Integer.parseInt(arr[2]) * 100;
		int d = Integer.parseInt(arr[3]) * 10;
		int e = Integer.parseInt(arr[4]);
		
		System.out.printf("[%d]\n[%d]\n[%d]\n[%d]\n[%d]", a,b,c,d,e);
		
		
		
	}
}










//	Scanner sc = new Scanner(System.in);
//	int num = sc.nextInt();
//	int a = num / 10000 * 10000;
//	int b = (num - a) / 1000 * 1000;
//	int c = (num - a - b) / 100 * 100;
//	int d = (num - a - b - c) / 10 * 10;
//	int e = num - a - b - c - d;
//	System.out.printf("[%d]\n[%d]\n[%d]\n[%d]\n[%d]", a,b,c,d,e);