package Q12_GetMiddle;

public class GetMiddle_JeromeAns {
	
	/*
	 * Q 12 - ��� ���� ��������
	 * 
	 * getMiddle�޼ҵ�� �ϳ��� �ܾ �Է¹޽��ϴ�.
	 * �ܾ �Է� �޾Ƽ� ��� ���ڸ� ��ȯ�ϵ���
	 * getMiddle�޼ҵ带 ����� ������.
	 * �ܾ��� ���̰� ¦���ϰ�� ��� �α��ڸ� ��ȯ�ϸ� �˴ϴ�.
	 * 
	 * ������� �Է¹��� �ܾ power�̶�� w�� ��ȯ�ϸ� �ǰ�,
	 * �Է¹��� �ܾ test��� es�� ��ȯ�ϸ� �˴ϴ�.
	 * 
	 */
	
	String getMiddle(String word) {
		int start, end = 0;
		
		start = word.length()/2;
		if(word.length()%2 == 0) {
			start -= 1;
			end = start+2;
		} else {
			end = start+1;
		}
		return word.substring(start, end);
	}
	
	public static void main(String[] args) {
		GetMiddle_JeromeAns gm = new GetMiddle_JeromeAns();
		System.out.println(gm.getMiddle("power"));
		System.out.println(gm.getMiddle("test"));
	}

}
