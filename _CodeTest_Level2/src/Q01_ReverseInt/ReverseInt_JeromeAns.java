package Q01_ReverseInt;

import java.util.Arrays;

public class ReverseInt_JeromeAns {
	
	/*
	 * Q 01 - ���� ������������ ��ġ�ϱ�
	 * 
	 * reverseInt �޼ҵ�� int�� n�� �Ű������� �Է¹޽��ϴ�.
	 * n�� ��Ÿ���� ���ڸ� ū�ͺ��� ���� ������ ������ ���ο� ������ �������ּ���.
	 * 
	 * ������� n�� 118372�� 873211�� �����ϸ� �˴ϴ�.
	 * n�� ���� �����Դϴ�.
	 * 
	 */
	
	public int reverseInt(int n) {
		String[] strArr = Integer.toString(n).split("");
		for (int i=0; i<strArr.length; i++) {
			for (int j=0; j<strArr.length-1; j++) {
				if(Integer.parseInt(strArr[j]) < Integer.parseInt(strArr[j+1])) {
					String temp = strArr[j];
					strArr[j] = strArr[j+1];
					strArr[j+1] = temp;
				}
			}
		}
		String result = "";
		for (String each : strArr) {
			result += each;
		}
		return Integer.parseInt(result);
	}
	
	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		ReverseInt_JeromeAns ri = new ReverseInt_JeromeAns();
		System.out.println(ri.reverseInt(118372));
	}

}