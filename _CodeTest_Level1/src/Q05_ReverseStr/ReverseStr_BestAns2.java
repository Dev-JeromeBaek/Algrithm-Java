package Q05_ReverseStr;

import java.util.Arrays;

public class ReverseStr_BestAns2 {

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
		Arrays.sort(charArr);
		StringBuffer st = new StringBuffer(String.valueOf(charArr));
		st.reverse();
		return st.toString();
		
	}// reverseStr END
	
	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		ReverseStr_BestAns2 rs = new ReverseStr_BestAns2();
		System.out.println(rs.reverseStr("Zbcdefg"));
	}// main END
	
}// class END
