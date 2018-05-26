package Q10;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	/*
	 * ������ ��
	 * 
	 * [�ǽ� ����]
	 * ���ڵ��� �ԷµǸ� ¦�� ���� ���ڸ� ã�Ƴ��� ����ϴ� ���α׷��� �ۼ��غ�����.
	 * 
	 * [�Է�]
	 * ù �ٿ��� �Է� �� ������ �� ���� A�� �Է��ϸ�, A�� �Է��ϸ�, A�� Ȧ�����߸� �մϴ�.
	 * A���� ������ �������� ���еǾ� �ԷµǾ�� �d�ϴ�.
	 * 
	 * [���]
	 * ¦�� ���� ������ 1�� ����մϴ�.
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		scan.nextLine();
		int[] intArr = new int[length];
		for (int i=0; i<intArr.length; i++) {
			intArr[i] = scan.nextInt();
		}
		
		// ��� 1. XOR����
		// - XOR�� ��Ʈ �������̴�.
		// �׷��� 2������ ����� �ϴµ� ���� ���� �ٸ��� 1�̰�, ���� ���� ������ 0�̴�.
		// ���� ���, 1^2�� ���� �� 1=0001, 2=0010�̴�. �׷��� XOR ������ �ϸ� ���� 0011�� �ȴ�.
		
		int result = 0;
		for (int each : intArr) {
			result ^= each;
		}
		System.out.println(result);
		
		// ��� 2. HashSet�̿�
		// - Set�� �������� ������ Collection���� ������ �ǹ̰� ������ Data�� �ߺ��ؼ� ������ �� ���� Ư¡�� �������ִ�.
		// �׷��� HashSet�� Ư¡���δ� add() �޼ҵ带 �̿��� �����͸� ����, next()�� �̿��� �����͸� ������ �� �ִ�.
		// ����, Iterator�� �̿��ؼ� ������ �� �� �ִ�.
		Set<Integer> set = new HashSet<>();
		
		for (int each : intArr) {
			if(set.contains(each)) {
				set.remove(each);
			} else {
				set.add(each);
			}
		}
		
		System.out.println(set.iterator().next());
		
	}
}







