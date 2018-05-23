package Q04_Caesar;

public class Caesar_BestAns {
	
	/*
	 * Q 04 - ���� ��ȣ
	 * 
	 * � ������ �� ���ĺ��� ������ �Ÿ���ŭ �о 
	 * �ٸ� ���ĺ����� �ٲٴ� ��ȣȭ ����� ���� ��ȣ��� �մϴ�.
	 * A�� 3��ŭ �и� D�� �ǰ� z�� 1��ŭ �и� a�� �˴ϴ�.
	 * ������ �������� �ʽ��ϴ�.
	 * 
	 * ���� ���ڿ� s�� �󸶳� ���� �˷��ִ� n�� �Է¹޾� 
	 * ��ȣ���� ����� caesar �Լ��� �ϼ��� ������.
	 * 
	 * - "a B z", 4�� �Է¹޾Ҵٸ� "e F d"�� �����մϴ�.
	 */

	String caesar(String s, int n) {
		String result = "";
		n = n % 26;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isLowerCase(ch)) {
				ch = (char) ((ch - 'a' + n) % 26 + 'a');
			} else if (Character.isUpperCase(ch)) {
				ch = (char) ((ch - 'A' + n) % 26 + 'A');
			}
			result += ch;
		}
		return result;
	}
	
	public static void main(String[] args) {
		Caesar_BestAns c = new Caesar_BestAns();
		System.out.println("s�� 'a B z', n�� 4�� ��� : " + c.caesar("a B z", 4));
	}
}
