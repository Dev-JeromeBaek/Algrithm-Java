package Q02_Divisible;

import java.util.Arrays;

public class Divisible2_JeromeAns {
	
	/*
	 * Quiz 02 - ������ �������� ���� �迭
     * 
     * divisible �޼ҵ�� int�� �迭 array�� int divisor�� �Ű������� �޽��ϴ�.
     * array�� �� element �� divisor�� ������ �������� ���� �����ϴ�
     * ���ο� �迭�� ���� ��ȯ�ϵ��� divisible�� �ڵ带 �ۼ��� ������.
     * 
     * ������� array�� {5, 9, 7, 10} �̰� divisor�� 5 �̸� {5, 10} �� �����ؾ� �մϴ�.
	 */
	
	public int[] divisible(int[] array, int divisor) {
		// ret�� array�� ���Ե� ������, divisor�� ������ �������� ���ڸ� ������� ��������.
		int num = 0;
		int[] intArr = new int[array.length];
		for (int each : array) {
			 
			if(check(each, divisor) != 0) num++;
		}
		int[] ret = new int[num];
		
		return ret;
	}// divisible END
	
	public int check(int num, int divisor) {
		return num%divisor == 0 ? num : 0;
	}
	
	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	
	public static void main(String[] args) {
		Divisible2_JeromeAns div = new Divisible2_JeromeAns();
		int[] array = {5, 9, 7, 10};
		System.out.println(Arrays.toString(div.divisible(array, 5)));
	}// main END
	
}// class END
