package Q00;

import java.util.Scanner;

public class S04_Decimal_Conversion {

	// java ���� ��ȯ (10����, 2����, 8����, 16����)
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		// 1. 10���� -> 2����, 8����, 16����
		System.out.println("10������ �Է��Ͻÿ�.");
		String inputString = scan.nextLine();
		int inputInt = Integer.parseInt(inputString);
		System.out.println("10���� : " + inputInt);
		// 10���� -> 2���� ��ȯ Integer.toBinaryString(int i);
		System.out.println("2���� : " + Integer.toBinaryString(inputInt));
		// 10���� -> 8���� ��ȯ Integer.toOctalString(int i);
		System.out.println("8���� : " + Integer.toOctalString(inputInt));
		// 10���� -> 16���� ��ȯ Integer.toHexString(int i);
		System.out.println("16���� : " + Integer.toHexString(inputInt));
		
		
	}
}
