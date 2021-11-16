package codingtest;

import java.util.Scanner;

public class Coding1 {

	public int solution(String compString,char compChar) {
		
		int answer = 0;
		compString = compString.toLowerCase();
		compChar = Character.toLowerCase(compChar);
		for(int i = 0;i<compString.length();i++) {
			if(compString.charAt(i) == compChar) {
				
				answer++;
			}
			
			
			
		}
		return answer;
		
	}
	
	public static void main(String[] args) {
		
		Coding1 T = new Coding1();
		
		Scanner kb = new Scanner(System.in);
		String compString = kb.next();
		char compChar = kb.next().charAt(0);
		
		System.out.println(T.solution(compString,compChar ));
		
	}
	
}
