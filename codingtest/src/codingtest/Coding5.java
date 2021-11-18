package codingtest;

import java.util.Scanner;

public class Coding5 {

	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
			
		String inputScanner = scanner.next();
		String answer;
		char [] c = inputScanner.toCharArray();
		int lt = 0;
		int rt = inputScanner.length()-1;
		while(lt<rt) {
			if(!Character.isAlphabetic(c[lt]))lt++;
			else if(!Character.isAlphabetic(c[rt]))rt--;
			else {
				char tmp = c[lt];
				c[lt] = c[rt];
				c[rt] = tmp;
				lt++;
				rt--;
				
			}
			
		}
		answer = String.valueOf(c);
		System.out.println(answer);
	}
}
