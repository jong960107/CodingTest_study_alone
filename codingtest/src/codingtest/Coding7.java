package codingtest;

import java.util.Scanner;

public class Coding7 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.next();
		
		String lowerInput = input.toLowerCase();
		
		int lt = 0;
		int rt = lowerInput.length()-1;
		while(lt<rt) {
			
			if(lowerInput.charAt(lt) == lowerInput.charAt(rt)) {
				lt++;
				rt--;
				System.out.println("YES");

				break;
			}else
		 {
				
				System.out.println("NO");
			}
		}
	}
	
}
