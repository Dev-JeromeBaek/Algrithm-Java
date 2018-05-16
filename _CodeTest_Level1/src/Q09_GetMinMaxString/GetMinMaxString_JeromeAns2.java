package Q09_GetMinMaxString;

import java.util.Arrays;

public class GetMinMaxString_JeromeAns2 {
	
	/*
	 * Q 09 - �ִ밪�� �ּҰ�
	 * 
	 * getMinMaxString �޼ҵ�� String�� ���� str�� �Ű������� �Է¹޽��ϴ�.
	 * str���� �������� ���е� ���ڵ��� ����Ǿ� �ֽ��ϴ�.
	 * str�� ��Ÿ���� ���� �� �ּҰ��� �ִ밪�� ã�� 
	 * �̸� "(�ּҰ�) (�ִ밪)"������ String�� ��ȯ�ϴ� �޼ҵ带 �ϼ��ϼ���.
	 * 
	 * ������� str�� "1 2 3 4"��� "1 4"�� �����ϰ�, 
	 * "-1 -2 -3 -4"��� "-4 -1"�� �����ϸ� �˴ϴ�.
	 */
	
	public String getMinMaxString(String str) {
		String[] strArr = str.split("\\p{Z}");
		int[] intArr = new int[strArr.length];
		for (int i=0; i<strArr.length; i++) {
			intArr[i] = Integer.parseInt(strArr[i]);
		}
		
		Arrays.sort(intArr);
		String min = Integer.toString(intArr[0]);
		String max = Integer.toString(intArr[intArr.length-1]);
		
		return min + " " + max;
	}
	
	public static void main(String[] args) {
		String str = "1 2 3 4";
//		String str = "-1 -2 -3 -4";
		
		GetMinMaxString_JeromeAns2 minMax = new GetMinMaxString_JeromeAns2();
		// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
		System.out.println("�ִ밪�� �ּҰ���?" + minMax.getMinMaxString(str));
	}
	
}// class END
