package Q01_SumDivisor;

public class SumDivisor2 {

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
			if(num%i == 0) answer += i;
		}
		answer += num;
		return answer;
	}// sumDivisor END
	
	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	
	public static void main(String[] args) {
		
		SumDivisor2 c = new SumDivisor2();
		System.out.println(c.sumDivisor(12));
		
	}// main END
	
}// class END