package Q06_GetMean;

import java.util.Arrays;

public class GetMean_BestAns {
	
	/*
	 * Quiz 06 - ��ձ��ϱ�
     * 
     * �Լ��� �ϼ��ؼ� �Ű�����  array�� ��հ��� return�ϵ��� ����� ������.
     * ��� ũ���� array�� �͵� ��հ��� ���� �� �־�� �մϴ�.
	 */
	
	public int getMean(int[] array) {
		return (int) Arrays.stream(array).average().orElse(0);
	}
	
	public static void main(String[] args) {
		int x[] = {5, 4, 3};
		GetMean_BestAns getMean = new GetMean_BestAns();
		// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
		System.out.println("��հ� : " + getMean.getMean(x));
	}

}
