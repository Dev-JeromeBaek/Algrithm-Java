package Q06_GetMean;

public class GetMean2 {
	
	/*
	 * Quiz 06 - ��ձ��ϱ�
     * 
     * �Լ��� �ϼ��ؼ� �Ű�����  array�� ��հ��� return�ϵ��� ����� ������.
     * ��� ũ���� array�� �͵� ��հ��� ���� �� �־�� �մϴ�.
	 */
	
	public int getMean(int[] array) {
		int answer = 0;
		for(int each : array) {
			answer += each;
		}
		return answer/array.length;
	}
	
	public static void main(String[] args) {
		int x[] = {5, 4, 3};
		GetMean2 getMean = new GetMean2();
		// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
		System.out.println("��հ� : " + getMean.getMean(x));
	}

}
