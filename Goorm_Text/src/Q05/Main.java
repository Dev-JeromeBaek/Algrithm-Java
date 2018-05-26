package Q05;

import java.util.Scanner;

public class Main {

	/*
	 * 약수 구하기
	 * 
	 * [실습내용]
	 * 양의 정수를 입력 받고 그 수의 약수를 모두 출력하는 프로그램을 작성해보세요.
	 * 
	 * [입력]
	 * 양의 정수
	 * 
	 * [출력]
	 * 입력된 수의 약수를 공백으로 구분하여 출력
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		String result = "";
		for (int i=1; i<=num/2; i++) {
			if(num%i == 0) result += i+" ";
		}
		System.out.println(result + num + " ");
	}
}
