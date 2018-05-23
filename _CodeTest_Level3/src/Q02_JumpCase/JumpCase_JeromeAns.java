package Q02_JumpCase;

public class JumpCase_JeromeAns {
	
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
		int temp1 = 0;
		int temp2 = 0;
		
		for (int i=0; i<num; i++) {
			if(i<1) {
				answer = 1;
				temp1 = 1;
				temp2 = 1;
			} else {
				System.out.println("i : " + i);
				
				System.out.println("answer : " + answer);
				System.out.println("temp1 : " + temp1);
				System.out.println("temp2 : " + temp2);
				answer = temp1 + temp2;
				temp2 = temp1;
				temp1 = answer;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		JumpCase_JeromeAns c = new JumpCase_JeromeAns();
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
