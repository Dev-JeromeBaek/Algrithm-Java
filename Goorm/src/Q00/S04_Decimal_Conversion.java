package Q00;

import java.util.Scanner;

public class S04_Decimal_Conversion {

	// java 진수 변환 (10진수, 2진수, 8진수, 16진수)
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		// 1. 10진수 -> 2진수, 8진수, 16진수
		System.out.println("10진수를 입력하시오.");
		String inputString = scan.nextLine();
		int inputInt = Integer.parseInt(inputString);
		System.out.println("10진수 : " + inputInt);
		// 10진수 -> 2진수 변환 Integer.toBinaryString(int i);
		System.out.println("2진수 : " + Integer.toBinaryString(inputInt));
		// 10진수 -> 8진수 변환 Integer.toOctalString(int i);
		System.out.println("8진수 : " + Integer.toOctalString(inputInt));
		// 10진수 -> 16진수 변환 Integer.toHexString(int i);
		System.out.println("16진수 : " + Integer.toHexString(inputInt));
		
		
	}
}
