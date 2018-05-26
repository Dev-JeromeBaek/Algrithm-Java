package Q03;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	/*
	 * 배열에서의 최소값 구하기
	 * 
	 * [실습내용]
	 * 배열에 들어있는 정수 중 최소값을 구하는 문제입니다.
	 * 
	 * [입력]
	 * 첫 줄에 배열에 들어가는 정수의 개수(n) 입력
	 * 다음 줄부터 n개의 정수 입력
	 * 
	 * [출력]
	 * 배열 내의 정수 중 최소값
	 * 
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int arrayLength = scan.nextInt();
		int[] intArr = new int[arrayLength];
		scan.nextLine();
		String value = scan.nextLine();
		String[] strArr = value.split("\\s+");
		for (int i=0; i<intArr.length; i++) {
			intArr[i] = Integer.parseInt(strArr[i]);
		}
		Arrays.sort(intArr);
		
		System.out.println(intArr[0]);
	}
}
