package Q05_Collatz;

public class Collatz_JeromeAns {
	
	/*
	 * Q 05 - �ݶ��� ����
	 * 
	 * 1937�� Collatz�� ����� ���� ����� �� ������,
	 * �Էµ� ���� ¦����� 2�� ������, Ȧ����� 3�� ���ϰ� 1������ ����, 
	 * ����� ���� ���� ���� �۾��� 1�� �� ������ �ݺ��� ��� ��� ���� 1�� �ȴٴ� �����Դϴ�.
	 * 
	 * ���� ���, �Էµ� ���� 6�̶�� 
	 * 6->3->10->5->16->8->4->2->1 �� �Ǿ� �� 8�� ���� 1�� �˴ϴ�.
	 * collatz �Լ��� ����� �Էµ� ���� �� �� ���� 1�� �Ǵ��� ��ȯ�� �ּ���.
	 * ��, 500���� �ݺ��ص� 1�� ���� �ʴ´ٸ� -1�� ��ȯ�� �ּ���. 
	 * 
	 */
	
	public int collatz(int num) {
		int answer = 0;
		while (num != 1) {
			num = num%2==0? num/2 : (num*3)+1;
			answer++;
            if(answer >= 500) {
                answer = -1;
                break;
            }
		}
		return answer;
	}
	
	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		Collatz_JeromeAns c = new Collatz_JeromeAns();
		int ex = 489;
		System.out.println(c.collatz(ex));
	}

}