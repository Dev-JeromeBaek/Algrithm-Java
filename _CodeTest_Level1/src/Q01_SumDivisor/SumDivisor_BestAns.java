package Q01_SumDivisor;

public class SumDivisor_BestAns {

	/* 
	 * Quiz 01 - ����� ��
	 *
	 * � ���� �Է¹޾� �� ���� ����� ��� ���� ��  sumDivisor �Լ��� �ϼ��� ������.
	 * ���� ��� 12�� �Էµȴٸ� 12�� ����� [1, 2, 3, 4, 6, 12]�� �ǰ�,
	 * �� ���� 28�� �ǹǷ� 28�� ��ȯ�� �ָ� �˴ϴ�. 
	*/ 
	
	public int sumDivisor(int num) {
		int answer = 0;
		
		for (int i=1; i<=num/2; i++) {
			if (num%i == 0) {
				answer += i;
			}
		}
		
		return answer + num;
	}
	
	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	
	public static void main(String[] args) {
		
		SumDivisor_BestAns c = new SumDivisor_BestAns();
		System.out.println(c.sumDivisor(12));
		
	}// main END
	
}// class END