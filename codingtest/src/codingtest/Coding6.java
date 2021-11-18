package codingtest;

import java.util.Scanner;

public class Coding6 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String answer ="";
		String inputScanner = scanner.next();
		
		for(int i = 0;i<inputScanner.length();i++) {
			if(inputScanner.indexOf(inputScanner.charAt(i))==i)
				answer += inputScanner.charAt(i);
		}
		
		System.out.println(answer);
		
	}
	
	
}
