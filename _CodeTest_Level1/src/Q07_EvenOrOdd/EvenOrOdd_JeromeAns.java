package Q07_EvenOrOdd;

public class EvenOrOdd_JeromeAns {
	
	/*
	 * Quiz 07 - ¦���� Ȧ��
     * 
     * evenOrOdd �޼ҵ�� int�� num�� �Ű������� �޽��ϴ�.
     * num�� ¦���� ��� "Even"�� ��ȯ�ϰ� 
     * Ȧ���� ��� "Odd"�� ��ȯ�ϵ��� evenOrOdd�� �ڵ带 �ۼ��� ������.
     * 
     * num�� 0�̻��� �����̸�, num�� ������ ���� �����ϴ�.
	 */
	
	String evenOrOdd(int num) {
		String result = "";
		if (num%2 == 0) {
			result = "Even";
		} else {
			result = "Odd";
		}
		return result;
	}
	
	public static void main(String[] args) {
		String str = "1 2 3 4";
		EvenOrOdd_JeromeAns evenOrOdd = new EvenOrOdd_JeromeAns();
		// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
		System.out.println("��� : " + evenOrOdd.evenOrOdd(3));
        System.out.println("��� : " + evenOrOdd.evenOrOdd(2));
	}

}
