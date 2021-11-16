package codingtest;

import java.util.Scanner;

public class Coding3 {

	public String solution(String str) {
		int maxValue = Integer.MIN_VALUE;
		String answer = "";
		String [] splitedStr = str.split(" ");
		for(int i = 0;i<splitedStr.length;i++) {
			int maxValueLength = splitedStr[i].length();
			if(maxValueLength>maxValue) {
				
				maxValue = maxValueLength;
				if(splitedStr[i].length()==maxValue) {
					
						answer = splitedStr[i];
					
				}
				
			}
		
		}
		
		
		
		return answer;
	}
	
	
	public static void main(String[] args) {
	
		Coding3 T = new Coding3();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.println(T.solution(str));
		
		
		
	}
}
