package Q03_NumOfPrime;

public class NumOfPrime {
	
	/*
	 * Q 03 - �Ҽ� ã��
	 * 
	 * numberOfPrime �޼ҵ�� ���� n�� �Ű������� �Է¹޽��ϴ�.
	 * 1���� �Է¹��� ���� n ���̿� �ִ� �Ҽ��� ������ ��ȯ�ϵ���    
	 * numberOfPrime �޼ҵ带 ��������.
	 * �Ҽ��� 1�� �ڱ� �ڽ����θ� ���������� ���� �ǹ��մϴ�.
	 * (1�� �Ҽ��� �ƴմϴ�.)
	 * 10�� �Է¹޾Ҵٸ�, 1���� 10 ������ �Ҽ��� [2, 3, 5, 7] 4���� �����ϹǷ� 4�� ��ȯ
	 * 5�� �Է¹޾Ҵٸ�, 1���� 5������ �Ҽ��� [2. 3. 5] 3���� �����ϹǷ� 3�� ��ȯ.
	 * 
	 */
	
	int numberOfPrime(int n) {
		int result = 0;
		// �Լ��� �ϼ��ϼ���.
		for (int i=2; i<=n; i++) {
			for (int j=1; j<=i; j++) {
				if(i%2 == 0 && i/j == 1) {
					result++;
				}
			}
			System.out.println(result);
		}
		
		
		return result;
	}
	
	public static void main(String[] args) {
		NumOfPrime prime = new NumOfPrime();
		System.out.println(prime.numberOfPrime(10));
	}

}