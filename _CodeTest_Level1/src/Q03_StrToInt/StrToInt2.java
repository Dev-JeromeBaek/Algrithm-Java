package Q03_StrToInt;

public class StrToInt2 {
	
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
		// Integer.parseInt(str) ������ �̰� �����̸� ������. �ٵ� �� logic�� ¥���°�,
		// ������ �ͺ��� �̷��������� �ڵ��ؾ� �Ѵ� ����Ұ�. 
		// �ð��� �ѱ��� ����.
		char[] charArr = str.toCharArray();
		for (int i=1; i<charArr.length; i++) {
			if(charArr[0] == '-') {
				
			}
		}
		
		return 0;
	}// getStrToInt END
	
	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	
	 public static void main(String[] args) {
		StrToInt2 strToInt = new StrToInt2();
		
		System.out.println(strToInt.getStrToInt("-1234"));
	}// main END
	 
}// class END
