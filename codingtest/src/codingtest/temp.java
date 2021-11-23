package codingtest;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class temp {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		String answer = "NO";
		str = str.toUpperCase().replaceAll("[^A-Z],", "");
		String tmp = new StringBuilder(str).reverse().toString();
		if(str.equals(tmp))answer="YES";
		
	}
	
	}
	