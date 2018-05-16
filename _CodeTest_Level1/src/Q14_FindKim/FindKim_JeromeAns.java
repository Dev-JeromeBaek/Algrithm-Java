package Q14_FindKim;

public class FindKim_JeromeAns {
	
	/*
	 * Q 14 - ���￡�� �輭�� ã��
	 * 
	 * findKim �Լ�(�޼ҵ�)�� String�� �迭 seoul�� �Ű������� �޽��ϴ�.
	 * seoul�� element�� "Kim"�� ��ġ x�� ã��, 
	 * "�輭���� x�� �ִ�"�� String�� ��ȯ�ϼ���.
	 * seoul�� "Kim"�� ���� �� ���� ��Ÿ���� 
	 * �߸��� ���� �ԷµǴ� ���� �����ϴ�.
	 * 
	 */
	
	public String findKim(String[] seoul) {
		// x�� �輭���� ��ġ�� �����ϼ���.
		int x = 0;
		for (; x<seoul.length; x++) {
			if(seoul[x].equals("Kim")) {
				break;
			}
		}
		
		return "�輭���� " + x + "�� �ִ�";
	}
	
	// ������ ���� �׽�Ʈ�ڵ��Դϴ�.
	public static void main(String[] args) {
		FindKim_JeromeAns kim = new FindKim_JeromeAns();
		String[] names = {"Queen", "Tod", "Kim"};
		System.out.println(kim.findKim(names));
	}

}
