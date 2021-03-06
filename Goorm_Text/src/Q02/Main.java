package Q02;

import java.util.Scanner;

public class Main {
	
	/*
	 * 절대값 출력하기
	 * 
	 * [실습내용]
	 * 절대값이란 원점에서 방향을 무시한 변위의 크기만을 나타낸 값입니다.
	 * 이번 문제에서는 임의의 정수가 입력되면 그것의 절대값을 출력해봅시다.
	 * 
	 * [입력]
	 * 임의의 정수
	 * 
	 * [출력]
	 * 입력된 정수의 절대값
	 * 
	 */

	public static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int num = scan.nextInt();
		System.out.println(Math.abs(num));
	}
}
