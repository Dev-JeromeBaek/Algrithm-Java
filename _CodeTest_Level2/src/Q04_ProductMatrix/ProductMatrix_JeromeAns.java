package Q04_ProductMatrix;

public class ProductMatrix_JeromeAns {
	
	/*
	 * Q 04 - 행렬의 곱셈
	 * 
	 * 행렬의 곱셈은, 곱하려는 두 행렬의 어떤 행과 열을 기준으로,
	 * 좌측의 행렬은 해당되는 행, 우측의 행렬은 해당되는 열을 순서대로
	 * 곱한 값을 더한 값이 들어갑니다.
	 * 행렬을 곱하기 위해선 좌측 행렬의 열의 개수와 우측 행렬의 행의 개수가 같아야 합니다.
	 * 곱할 수 있는 두 행렬 A,B가 주어질 때, 행렬을 곱한 값을 출력하는 productMatrix 함수를 완성해 보세요.
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
		// 아래는 테스트로 출력해 보기 위한 코드입니다.
		System.out.println("행렬의 곱셈 : " + c.productMatrix(a, b));
	}

}
