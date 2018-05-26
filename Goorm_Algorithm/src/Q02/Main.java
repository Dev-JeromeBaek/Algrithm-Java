package Q02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		int count = 0;
		for (int i=2; i<=num; i++) {
			if(num%i == 0) count++;
		}
		String result = count == 1 ? "True" : "False";
		System.out.print(result);
	}
}
