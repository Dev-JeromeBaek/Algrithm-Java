package Q10_PrintTriangle;

public class PrintTriangle_JeromeAns {
	
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
		for (int i=0; i<num; i++) {
			for (int j=0; j<i+1; j++) {
				result += "*";
			}
			result += "\n";
		}
		return result;
	}
	
	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		PrintTriangle_JeromeAns pt = new PrintTriangle_JeromeAns();
		System.out.println(pt.printTriangle(3));
	}
}
