package Q04_ProductMatrix;

public class ProductMatrix_JeromeAns {
	
	/*
	 * Q 04 - ����� ����
	 * 
	 * ����� ������, ���Ϸ��� �� ����� � ��� ���� ��������,
	 * ������ ����� �ش�Ǵ� ��, ������ ����� �ش�Ǵ� ���� �������
	 * ���� ���� ���� ���� ���ϴ�.
	 * ����� ���ϱ� ���ؼ� ���� ����� ���� ������ ���� ����� ���� ������ ���ƾ� �մϴ�.
	 * ���� �� �ִ� �� ��� A,B�� �־��� ��, ����� ���� ���� ����ϴ� productMatrix �Լ��� �ϼ��� ������.
	 * 
	 */
	
	public int[][] productMatrix(int[][] A, int[][] B) {
		int[][] answer = null;
		answer = new int[A.length][B[0].length];
		for (int i=0; i<answer.length; i++) {
			for (int j=0; j<answer[0].length; j++) {
				for (int k=0; k<A[0].length; k++) {
					answer[i][j] += A[i][k] * B[k][i];
				}
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		ProductMatrix_JeromeAns c = new ProductMatrix_JeromeAns();
		int[][] a = { {1, 2}, {2, 3} };
		int[][] b = { {3, 4}, {5, 6} };
		// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
		System.out.println("����� ���� : " + c.productMatrix(a, b));
	}

}