package Q11_WaterMelon;

public class WaterMelon_JeromeAns {
	
	/*
	 * Q 11 - ���ڼ��ڼ��ڼ��ڼ��ڼ�?
	 * 
	 * water_melon�Լ��� ���� n�� �Ű������� �Է¹޽��ϴ�.
	 * ���̰� n�̰�, ���ڼ��ڼ�...�� ���� ������ 
	 * �����ϴ� ���ڿ��� �����ϵ��� �Լ��� �ϼ��ϼ���.
	 * 
	 * ������� n�� 4�̸� '���ڼ���'�� �����ϰ� 
	 * 3�̶�� '���ڼ�'�� �����ϸ� �˴ϴ�.
	 * 
	 */

	public String watermelon(int n) {
		String result = "";
		for (int i=0; i<n; i++) {
			if (i%2 == 0) {
				result += "��";
			} else {
				result += "��";
			}
		}
		return result;
	}
	
	// ������ ���� �׽�Ʈ�ڵ��Դϴ�.
	public static void main(String[] args) {
		WaterMelon_JeromeAns wm = new WaterMelon_JeromeAns();
		System.out.println("n�� 3�� ��� : " + wm.watermelon(3));
		System.out.println("n�� 4�� ��� : " + wm.watermelon(4));
	}
}
