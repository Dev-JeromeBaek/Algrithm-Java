package Q05_ReverseStr;

public class ReverseStr_JeromeAns {

	/*
	 * Quiz 05 - ���ڿ� ������������ ��ġ�ϱ�
     * 
     * reverseStr �޼ҵ�� String�� ���� str�� �Ű������� �Է¹޽��ϴ�.
     * str�� ��Ÿ���� ���ڸ� ū�ͺ��� ���� ������ ������ ���ο� String�� �������ּ���.
     * str�� ���� ��ҹ��ڷθ� �����Ǿ� ������, �빮�ڴ� �ҹ��ں��� ���� ������ �����մϴ�.
     * 
     * ������� str�� "Zbcdefg"�� "gfedcbZ"�� �����ϸ� �˴ϴ�.
	 */
	
	public String reverseStr(String str) {
		
		char[] charArr = str.toCharArray();
		
		for (int i=0; i<str.length(); i++) {
			for (int j=0; j<str.length()-1; j++) {
				if (charArr[j] < charArr[j+1]) {
					char temp = charArr[j];
					charArr[j] = charArr[j+1];
					charArr[j+1] = temp;
				}
			}
		}
		str = "";
		for (int i=0; i<charArr.length; i++) {
			str += charArr[i];
		}
		return str;
		
	}// reverseStr END
	
	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		ReverseStr_JeromeAns rs = new ReverseStr_JeromeAns();
		System.out.println(rs.reverseStr("Zbcdefg"));
	}// main END
	
}// class END