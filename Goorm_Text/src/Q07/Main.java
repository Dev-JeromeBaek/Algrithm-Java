package Q07;

import java.util.Scanner;

public class Main {

	/*
	 * 평균과 평균보다 큰 수
	 * 
	 * [실습내용]
	 * 평균과 평균보다 큰 수의 개수를 구하는 문제입니다.
	 * 
	 * [입력]
	 * 첫째 줄에 비교할 정수의 개수 (n)을 입력합니다.
	 * 둘쨰 줄에 공백으로 구분하여 정수 하나씩 입력합니다.
	 * 
	 * [출력]
	 * 평균(소수점 첫번쨰 자리까지)을 출력하고 공백으로 구분하여 
	 * 평균보다 큰 수의 개수를 출력합니다.
	 * 
	 */
	
	String calAvg(int n, String s) {
		double avg = 0.0;
		int larger = 0;
		int temp = 0;
		String[] strArr = s.split("\\s+");
		for(String each : strArr) {
			temp += Integer.parseInt(each);
		}
		avg = temp / (double)n;
		
		for(String each : strArr) {
			if(Double.parseDouble(each) > avg) larger++;
		}
		
		return avg + " " + larger;
	}
	
	public static void main(String[] args) {
		Main test = new Main();
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		scan.nextLine();
		String str = scan.nextLine();
		System.out.println(test.calAvg(count, str));
	}
	
}
