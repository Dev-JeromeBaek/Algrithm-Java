package Q12_GetMiddle;

public class GetMiddle_BestAns {
	
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
		return word != null ? word.substring((word.length()-1)/2, (word.length()+2)/2) : "";
	}
	
	public static void main(String[] args) {
		GetMiddle_BestAns gm = new GetMiddle_BestAns();
		System.out.println(gm.getMiddle("power"));
		System.out.println(gm.getMiddle("test"));
	}

}
