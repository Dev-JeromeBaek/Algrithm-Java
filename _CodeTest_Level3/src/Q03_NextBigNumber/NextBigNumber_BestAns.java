package Q03_NextBigNumber;

public class NextBigNumber_BestAns {
	
	/*
	 * Q 03 - ���� ū ����
	 * 
	 * � �� N(1 <= N <\ 1,000,000) �� �־����� ��, N�� ���� ū ���ڴ� ������ �����ϴ�.
	 * - N�� ���� ū ���ڴ� N�� 2������ �ٲپ��� ���� 1�� ������ ���� ������ �̷���� ���Դϴ�.
	 * - 1��° ������ �����ϴ� ���ڵ� �� N���� ū �� �߿��� ���� ���� ���ڸ� ã�ƾ� �մϴ�.
	 * 
	 * ���� ���, 78�� 2������ �ٲٸ� 1001110 �̸�, 78�� ���� ū ���ڴ� 83���� 2������ 1010011 �Դϴ�.
	 * N�� �־��� ��, N�� ���� ū ���ڸ� ã�� nextBigNumber�Լ��� �ϼ��ϼ���.
	 * 
	 */
	 
	public int nextBigNumber(int n) {
		int a = Integer.bitCount(n);
		while (Integer.bitCount(++n) != a) {}
		return n;
	}
	
	public static void main(String[] args) {
		NextBigNumber_BestAns test = new NextBigNumber_BestAns();
		int n = 78;
		System.out.println(test.nextBigNumber(n));
	}

}
