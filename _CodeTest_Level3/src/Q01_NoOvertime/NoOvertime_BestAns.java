package Q01_NoOvertime;

public class NoOvertime_BestAns {
	
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
		int max_value = 0;
		int max_index = 0;
		
		while(no!=0) {
			for(int i=0; i<works.length; i++) {
				if(works[i]>=max_value) {
					max_value = works[i];
					max_index = i;
				}
			}
			works[max_index] = works[max_index] -1;
			no = no -1;
			max_value = 0;
		}
				
		for (int i=0; i<works.length; i++) {
			result += (int)Math.pow(works[i],2);
		}
		return result;
	}
	
	public static void main(String[] args) {
		NoOvertime_BestAns c = new NoOvertime_BestAns();
		int []test = {4, 3, 3};
		System.out.println(c.noOvertime(4, test));
	}

}
