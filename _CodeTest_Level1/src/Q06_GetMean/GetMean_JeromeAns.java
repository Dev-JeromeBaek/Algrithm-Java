package Q06_GetMean;

public class GetMean_JeromeAns {
	
	/*
	 * Quiz 06 - ��ձ��ϱ�
     * 
     * �Լ��� �ϼ��ؼ� �Ű�����  array�� ��հ��� return�ϵ��� ����� ������.
     * ��� ũ���� array�� �͵� ��հ��� ���� �� �־�� �մϴ�.
	 */
	
	public int getMean(int[] array) {
		int sum = 0;
		for (int each : array) {
			sum += each;
		}
		return sum/array.length;
	}
	
	public static void main(String[] args) {
		int x[] = {5, 4, 3};
		GetMean_JeromeAns getMean = new GetMean_JeromeAns();
		// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
		System.out.println("��հ� : " + getMean.getMean(x));
	}

}
