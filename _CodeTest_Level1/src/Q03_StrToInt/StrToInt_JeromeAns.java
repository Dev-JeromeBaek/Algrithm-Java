package Q03_StrToInt;


public class StrToInt_JeromeAns {
	
	/*
	 * Quiz 03 - ��Ʈ���� ���ڷ� �ٲٱ�
     * 
     * strToInt �޼ҵ�� String�� str�� �Ű������� �޽��ϴ�.
     * str�� ���ڷ� ��ȯ�� ����� ��ȯ�ϵ��� strToInt�� �ϼ��ϼ���.
     * 
     * ������� str�� "1234"�̸� 1234�� ��ȯ�ϰ�, "-1234"�̸� -1234�� ��ȯ�ϸ� �˴ϴ�.
     * str�� ��ȣ(+,-)�� ���ڷθ� �����Ǿ� �ְ�, �߸��� ���� �ԷµǴ� ���� �����ϴ�.
	 */
	
	public int getStrToInt(String str) {
		return Integer.parseInt(str);
	}// getStrToInt END
	
	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	
	 public static void main(String[] args) {
		StrToInt_JeromeAns strToInt = new StrToInt_JeromeAns();
		
		System.out.println(strToInt.getStrToInt("-1234"));
	}// main END
}// class END
