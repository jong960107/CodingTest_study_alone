package codingtest;

import java.util.Scanner;

public class Coding4 {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	int inputCount = scanner.nextInt();
	String [] arrayInput = new String[inputCount];
	for(int i = 0;i< inputCount;i++) {
		arrayInput[i] = scanner.next();
		StringBuffer sb = new StringBuffer(arrayInput[i]);
	String answer=	sb.reverse().toString();
	System.out.println(answer);
	}
	}
}
