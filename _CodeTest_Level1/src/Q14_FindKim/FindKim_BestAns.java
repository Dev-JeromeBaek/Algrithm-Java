package Q14_FindKim;

import java.util.Arrays;

public class FindKim_BestAns {
	
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
		int x = Arrays.asList(seoul).indexOf("Kim");
		
		return "�輭���� " + x + "�� �ִ�";
	}
	
	// ������ ���� �׽�Ʈ�ڵ��Դϴ�.
	public static void main(String[] args) {
		FindKim_BestAns kim = new FindKim_BestAns();
		String[] names = {"Queen", "Tod", "Kim"};
		System.out.println(kim.findKim(names));
	}

}
