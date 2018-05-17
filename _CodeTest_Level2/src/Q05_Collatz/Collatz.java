package Q05_Collatz;

public class Collatz {
	
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
			if(answer == 501) {
				answer = -1;
				num=1;
			}
			System.out.println(num);
		}
		System.out.println(answer);
		System.out.println(num);
		return answer;
	}
	
	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		Collatz c = new Collatz();
		int ex = 489;
		System.out.println(c.collatz(ex));
	}

}