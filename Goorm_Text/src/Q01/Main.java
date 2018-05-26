package Q01;

import java.util.Scanner;

public class Main {
	
	/*
	 * 사칙 연산
	 * 
	 * [실습내용]
	 * 입력받은 두 수의 덧셈을 실행한 결과 값을 출력하는 프로그램을 작성해보세요.
	 * 
	 * [입력]
	 * 덧셈을 실행할 두 정수
	 * 
	 * [출력]
	 * 결과 값
	 * 
	 */
	
	public static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int result = 0;
		String inVal = scan.nextLine();
		String[] strArr = inVal.split("\\s+");
		for(String each : strArr) {
			result += Integer.parseInt(each);
		}
		System.out.print(result);
	}
}
