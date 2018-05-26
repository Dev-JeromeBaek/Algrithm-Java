package Q01;

import java.util.Scanner;

public class Main {

	static String printResult(int A, int B) {
		String result = "";
		for (int i=A; i<=B; i++) {
			int calcul = 0;
			for (int j=1; j<=i/2; j++) {
				if(i%j == 0) calcul += j;
			}
			if(i == calcul) result += (i+" ");
		}
		if(result.equals("")) result = "No Answer!";
		return result;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] intArr = new int[2];
		for (int i=0; i<intArr.length; i++) {
			intArr[i] = scan.nextInt();
		}
		
		System.out.print(printResult(intArr[0], intArr[1]));
	}
}
