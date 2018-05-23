package Q03_NextBigNumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NextBigNumber_JeromeAns {
	
	/*
	 * Q 03 - ���� ū ����
	 * 
	 * � �� N(1 <= N <= 1,000,000) �� �־����� ��, N�� '���� ū ����'�� ������ �����ϴ�.
	 * - N�� ���� ū ���ڴ� N�� 2������ �ٲپ��� ���� 1�� ������ ���� ������ �̷���� ���Դϴ�.
	 * - 1��° ������ �����ϴ� ���ڵ� �� N���� ū �� �߿��� ���� ���� ���ڸ� ã�ƾ� �մϴ�.
	 * 
	 * ���� ���, 78�� 2������ �ٲٸ� 1001110 �̸�, 78�� ���� ū ���ڴ� 83���� 2������ 1010011 �Դϴ�.
	 * N�� �־��� ��, N�� ���� ū ���ڸ� ã�� nextBigNumber�Լ��� �ϼ��ϼ���.
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
		// �Ű����� 2���� ��ȯ
		String binaryNum = Integer.toBinaryString(num);
		
		// 1�� ���� Ȯ�� - ��� 1. pattern mathers;
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
