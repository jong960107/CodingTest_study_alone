package codingtest;

import java.util.Scanner;

public class Coding2 {

	public String solution(String str) {
		String answer = "";
		for(int i = 0 ;i< str.length();i++) {
			
		if(	Character.isLowerCase(str.charAt(i))){
		answer += Character.toUpperCase(str.charAt(i));		
		}else {
			answer += Character.toLowerCase(str.charAt(i));
		}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Coding2 T = new Coding2();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}
