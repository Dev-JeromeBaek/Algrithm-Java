package Q02_JumpCase;

public class JumpCase_BestAns2 {
	
	/*
	 * Q 02 - �ָ� �ٱ�
	 * 
	 * ȿ���̴� �ָ� �ٱ⸦ �����ϰ� �ֽ��ϴ�.
	 * ȿ���̴� �ѹ��� 1ĭ, �Ǵ� 2ĭ�� �� �� �ֽ��ϴ�.
	 * ĭ�� �� 4�� ���� ��, ȿ���̴� 
	 * (1ĭ, 1ĭ, 1ĭ, 1ĭ)
	 * (1ĭ, 2ĭ, 1ĭ)
	 * (1ĭ, 1ĭ, 2ĭ)
	 * (2ĭ, 1ĭ, 1ĭ)
	 * (2ĭ, 2ĭ)
	 * �� 5���� ������� �� �� ĭ�� ������ �� �ֽ��ϴ�.
	 * �ָ��ٱ⿡ ���� ĭ�� �� n�� �־��� ��,
	 * ȿ���̰� ���� �����ϴ� ����� �� ��������
	 * ����ϴ� jumpCase �Լ��� �ϼ��ϼ���.
	 * 
	 * ���� ��� 4�� �Էµȴٸ�, 5�� ��ȯ�� �ָ� �˴ϴ�.
	 * 
	 */
	
	public int jumpCase(int num) {
		int answer = 0;
		int bNum = 0;
		int nNum = 1;
		
		for (int i=0; i<num; i++) {
			answer = bNum + nNum;
			bNum = nNum;
			nNum = answer;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		JumpCase_BestAns2 c = new JumpCase_BestAns2();
		int testCase = 5;
//		int testCase1 = 5;
//		int testCase2 = 13;
//		int testCase3 = 100;
		// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
		System.out.println(c.jumpCase(testCase));
//		System.out.println(c.jumpCase(testCase1));
//		System.out.println(c.jumpCase(testCase2));
//		System.out.println(c.jumpCase(testCase3));
	}

}
