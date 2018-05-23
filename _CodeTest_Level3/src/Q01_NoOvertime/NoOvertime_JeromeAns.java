package Q01_NoOvertime;

import java.util.Arrays;

public class NoOvertime_JeromeAns {
	
	/*
	 * Q 01 - �߱� ����
	 * 
	 * ȸ����� �����̴� ���� ���� �׿� �ֽ��ϴ�.
	 * �����̴� �߱��� �ּ�ȭ�ϱ� ���� ���� ���� �۾����� ���ڷ� �ޱ��,
	 * �Ͽ� ���� �߱� ������ ���̱�� �����߽��ϴ�.
	 * �߱� ������ ���� ���� �۾����� �����Ͽ� ���� ���� �ǹ��մϴ�.
	 * �����̴� 1�ð� ���� ���� �� �� �ϳ��� ��� �۾��� 1��ŭ ó���� �� �ֽ��ϴ�.
	 * �������� ��ٱ��� ���� N �ð��� �� �Ͽ� ���� �۾����� ���� ��,
	 * noOvertime �Լ��� �����Ͽ� �������� �߱� ������ �ּ�ȭ �� ����� ����� �ּ���.
	 * 
	 * ���� ���, N=4 �� ��, ���� ���� �۾����� [4, 3, 3] �̶�� 
	 * �߱� ������ �ּ�ȭ�ϱ����� ���� �� ����� [2, 2, 2]�� �ǰ� 
	 * �߱� ������ 2^2 + 2^2 + 2^2 = 12�� �Ǿ� 12�� ��ȯ�� �ݴϴ�.
	 * 
	 */
	
	public int noOvertime(int no, int[] works) {
		int result = 0;
		// �߱� ������ �ּ�ȭ �Ͽ��� ���� �߱� ������ ���ϱ��?
		
		for (int i=0; i<no; i++) {
			Arrays.sort(works);
			works[works.length-1] -= 1;
		}
		
		for (int i=0; i<works.length; i++) {
			System.out.println(works[i]);
			result += Math.pow(works[i], 2);
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		NoOvertime_JeromeAns c = new NoOvertime_JeromeAns();
		int []test = {4, 3, 3};
		System.out.println(c.noOvertime(4, test));
	}

}
