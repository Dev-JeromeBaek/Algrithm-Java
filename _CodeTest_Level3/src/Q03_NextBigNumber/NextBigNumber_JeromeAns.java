package Q03_NextBigNumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NextBigNumber_JeromeAns {
	
	/*
	 * Q 03 - 다음 큰 숫자
	 * 
	 * 어떤 수 N(1 <= N <= 1,000,000) 이 주어졌을 때, N의 '다음 큰 숫자'는 다음과 같습니다.
	 * - N의 다음 큰 숫자는 N을 2진수로 바꾸었을 때의 1의 개수와 같은 개수로 이루어진 수입니다.
	 * - 1번째 조건을 만족하는 숫자들 중 N보다 큰 수 중에서 가장 작은 숫자를 찾아야 합니다.
	 * 
	 * 예를 들어, 78을 2진수로 바꾸면 1001110 이며, 78의 다음 큰 숫자는 83으로 2진수는 1010011 입니다.
	 * N이 주어질 때, N의 다음 큰 숫자를 찾는 nextBigNumber함수를 완성하세요.
	 * 
	 */
	
	public int nextBigNumber(int n) {
		int answer = 0;
		int basicCount = countNumOne(n);
		
		while(true) {
			n++;
			int nextCount = countNumOne(n);
			if(nextCount == basicCount) {
				answer = n;
				break;
			}
		}
		
		return answer;
	}
	
	public int countNumOne(int num) {
		// 매개변수 2진수 변환
		String binaryNum = Integer.toBinaryString(num);
		
		// 1의 갯수 확인 - 방법 1. pattern mathers;
		int count = 0;
		Pattern pt = Pattern.compile("1");
		Matcher m = pt.matcher(binaryNum);
		for (int i=0; m.find(i); i=m.end()) {
			count++;
		}
//		System.out.println("count: " + count);
		
		return count;
	}
	
	public static void main(String[] args) {
		NextBigNumber_JeromeAns test = new NextBigNumber_JeromeAns();
		int n = 78;
		System.out.println(test.nextBigNumber(n));
	}

}
