package Q03_StrToInt;


public class StrToInt_BestAns {
	
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
		boolean Sign = true;
		int result = 0;
		
		for (int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			System.out.println("ch : " + ch);
			if (ch=='-') Sign = false;
			else if (ch == '+') continue;
			else result = result * 10 + (ch - '0');
		}
		System.out.println(result);
		return Sign ? 1 : -1 * result;
	}
	
	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	
	 public static void main(String[] args) {
		StrToInt_BestAns strToInt = new StrToInt_BestAns();
		
		System.out.println(strToInt.getStrToInt("-1234"));
	}
}
