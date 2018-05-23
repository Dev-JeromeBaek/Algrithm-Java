package Q04_Caesar;

public class Caesar_JeromeAns {
	
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
		// �Լ��� �ϼ��ϼ���.
		String[] strArr = s.split("");
		for (String each : strArr) {
			result += changeString(each, n);
		}
		
		return result;
	}
	
	String changeString(String str, int count) {
		int chrNum = str.charAt(0);
//		System.out.println(chrNum);
//		System.out.println("chrNum : " + chrNum);
//		System.out.println(Character.toString((char)chrNum));
		if(chrNum != 32) {
			for (int i=0; i<count; i++) {
				if(chrNum >=97 && chrNum <=122) {
					chrNum++;
					if(chrNum > 122) {
						chrNum = 97;
					}
				} else if (chrNum >=65 && chrNum <= 90) {
					chrNum++;
					if(chrNum > 90) {
						chrNum = 65;
					}
				}
			}
		}
		
		return Character.toString((char)chrNum);
	}
	
	public static void main(String[] args) {
		Caesar_JeromeAns c = new Caesar_JeromeAns();
		System.out.println("s�� 'a B z', n�� 4�� ��� : " + c.caesar("a B z", 4));
	}
}
