package Q10_PrintTriangle;

public class PrintTriangle_BestAns {
	
	/*
	 * Q 10 - �ﰢ������ϱ�
	 * 
	 * printTriangle �޼ҵ�� ���� ���� num�� �Ű������� �Է¹޽��ϴ�.
	 * ������ ������ *(��)�� ���̰� num�� 
	 * �ﰢ���� ���ڿ��� �����ϴ� printTriangle �޼ҵ带 �ϼ��ϼ���.
	 * printTriangle�� return�ϴ� String�� ���๮��('\n')�� ������ �մϴ�.
	 * 
	 */
	
	public String printTriangle(int num) {
		String result = "";
		String stars = "*";
		for (int i=0; i<num; i++) {
			result += stars+"\n";
			stars += "*";
		}
		return result;
	}
	
	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		PrintTriangle_BestAns pt = new PrintTriangle_BestAns();
		System.out.println(pt.printTriangle(3));
	}
}
