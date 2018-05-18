package Q06_HarshadNumber;

public class HarshadNumber_JeromeAns2 {
	
	/*
	 * Q 06 - �ϻ��� ��
	 * 
	 * ���� ���� x�� �ϻ��� ���̷��� x�� �ڸ����� ������ x�� ���������� �մϴ�.
	 * 
	 * ������� 18�� �ڸ��� ���� 1+8=9�̰�, 
	 * 18�� 9�� ������ �������Ƿ� 18�� �ϻ��� ���Դϴ�.
	 * ----------------------------------------------------
	 * 
	 * Harshad�Լ��� ���� ���� n�� �Ű������� �Է¹޽��ϴ�.
	 * �� n�� �ϻ�������� �ƴ��� �Ǵ��ϴ� �Լ��� �ϼ��ϼ���.
	 * 
	 * ������� n�� 10, 12, 18�̸� True�� ���� 
	 * 11, 13�̸� False�� �����ϸ� �˴ϴ�.
	 * 
	 */
	
	public boolean isHarshad(int num) {
		String[] strArr = Integer.toString(num).split("");
		
		int temp = 0;
		for (String each : strArr) {
			temp += Integer.parseInt(each);
		}
		
		return num%temp==0? true : false;
	}
	
	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		HarshadNumber_JeromeAns2 sn = new HarshadNumber_JeromeAns2();
		// true
		System.out.println("10 is Harshad? : " + sn.isHarshad(10));
		System.out.println("12 is Harshad? : " + sn.isHarshad(12));
		System.out.println("18 is Harshad? : " + sn.isHarshad(18));
		// false
		System.out.println("11 is Harshad? : " + sn.isHarshad(11));
		System.out.println("13 is Harshad? : " + sn.isHarshad(13));
	}

}
