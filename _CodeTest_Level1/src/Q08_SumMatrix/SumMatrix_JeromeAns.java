package Q08_SumMatrix;

public class SumMatrix_JeromeAns {
	
	/*
	 * Q 08 - ����� ����
	 * 
	 * ����� ������ ��� ���� ũ�Ⱑ ���� �� ����� ���� ��, 
	 * ���� ���� ���� ���� ���� ����� �˴ϴ�. 
	 * 2���� ����� �Է¹޴� sumMatrix �Լ��� �ϼ��Ͽ� ��� ������ ����� ��ȯ�� �ּ���.
	 * ���� ��� 2x2 ����� A = ((1, 2), (2, 3)), B = ((3, 4), (5, 6)) �� �־�����, 
	 * ���� 2x2 ����� ((4, 6), (7, 9))�� ��ȯ�ϸ� �˴ϴ�.
	 * (��� ��Ŀ��� �����ϴ� �Լ��� �ϼ����ּ���.)
	 * 
	 */
	
	int[][] sumMatrix(int[][] A, int[][] B) {
		int[][] answer = new int[A.length][A[0].length];			// �ƴ� ���ʿ� �ʱ�ȭ�� �߸����ѳ�����... �׷��� ��� ��Ŀ����� ���ΰǰ�..
		for (int i=0; i<A.length; i++) {
			for (int j=0; j<A[i].length; j++) {
				answer[i][j] = A[i][j] + B[i][j];
			}
		}
		return answer;
	}// sumMatrix END

	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		SumMatrix_JeromeAns c = new SumMatrix_JeromeAns();
		int[][] A = { { 1, 2 }, { 2, 3 } };
		int[][] B = { { 3, 4 }, { 5, 6 } };
		int[][] answer = c.sumMatrix(A, B);
		if (answer[0][0] == 4 && answer[0][1] == 6 && 
				answer[1][0] == 7 && answer[1][1] == 9) {
			System.out.println("�¾ҽ��ϴ�. ������ ���� ������");
		} else {
			System.out.println("Ʋ�Ƚ��ϴ�. �����ϴ°� ���ھ��");
		}
		
	}// main END
}// class END