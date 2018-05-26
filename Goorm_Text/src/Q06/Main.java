package Q06;

import java.util.Scanner;

public class Main {
	
	/*
	 * 부분 문자열
	 * 
	 * [실습내용]
	 * 문자열을 입력받으면 아래의 예와 같이 부분 문자열을 모두 출력하는 프로그램을 작성하십시오.
	 * 예를 들어 ACE가 입력되면
	 * A
	 * AC
	 * ACE
	 * 가 출력되도록 하면 됩니다.
	 * 
	 * [입력]
	 * 임의의 문자열 (최대 100자)
	 * 
	 * [출력]
	 * 예와 같이 부분 문자열 출력
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String param = scan.nextLine();
		String[] strArr = param.split("");
		for (int i=0; i<param.length(); i++) {
			String result = "";
			for (int j=0; j<=i; j++) {
				result += strArr[j];
			}
			System.out.println(result);
		}
	}
}
